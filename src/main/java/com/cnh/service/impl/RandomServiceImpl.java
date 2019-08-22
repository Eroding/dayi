package com.cnh.service.impl;

import com.cnh.dao.RandomCodeMapper;
import com.cnh.dataobject.Address;
import com.cnh.dataobject.RandomCode;
import com.cnh.dto.CodeFindTermDto;
import com.cnh.dto.UserInformation;
import com.cnh.enums.AddressEnum;
import com.cnh.enums.RandomEnum;
import com.cnh.enums.SendGoodsEnum;
import com.cnh.enums.UseEnum;
import com.cnh.exception.DateException;
import com.cnh.service.AddressService;
import com.cnh.service.RandomService;
import com.cnh.util.DateUtil;
import com.cnh.vo.UserforAdminVo;
import com.cnh.vo.UserforUserVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@Slf4j
public class RandomServiceImpl implements RandomService {

    @Autowired
    private RandomCodeMapper randomCodeMapper;

    @Autowired
    private AddressService addressService;


    @Override
    public int addRandom(RandomCode randomCode) {
        return randomCodeMapper.insertSelective(randomCode);
    }

    @Override
    public int addRandomList(List<RandomCode> randomCodeList) {
        int i;
        i= randomCodeMapper.insertList(randomCodeList);
       if(i==0){
throw new DateException(RandomEnum.RANDOM_ERROR);
       }
       return i;
    }

    @Override
    public PageInfo<UserforAdminVo> findAll(int pageNo, int pageSize, CodeFindTermDto codeFindTermDto) {

//创建分页工具类
        PageHelper.startPage(pageNo,pageSize);
        Map<String,Object> map = new HashMap<>();
        if(codeFindTermDto!=null){
            if(codeFindTermDto.getSendGoods()==1 ){
                map.put("sendGoods",codeFindTermDto.getSendGoods());
            }
            else if(codeFindTermDto.getTrophy()!=0){
                map.put("trophy",codeFindTermDto.getTrophy());
            }
            else if(codeFindTermDto.getUsed()==1){
                map.put("used",codeFindTermDto.getUsed());
            }
        }


List<UserforAdminVo> randomCodeList = randomCodeMapper.findAllCodeByPage(map);
        PageInfo<UserforAdminVo> page = new PageInfo<UserforAdminVo>(randomCodeList);

        return page;
    }

    @Override
    public PageInfo<UserforAdminVo> findAll(int pageNo, int pageSize, String trophy, String used, String sendGoods) {

        PageHelper.startPage(pageNo,pageSize);
        Map<String,Object> map = new HashMap<>();
        if(trophy!=null &&trophy!=""){
            map.put("trophy",Integer.valueOf(trophy));
        } if(used!=null&&used!=""){
            map.put("used",Integer.valueOf(used));
        } if (sendGoods!=null&&sendGoods!=""){
            map.put("sendGoods",Integer.valueOf(sendGoods));
        }

        System.out.println("此时map的used的值="+map.get("used"));
        System.out.println("此时map的send的值="+map.get("sendGoods"));

        List<UserforAdminVo> randomCodeList = randomCodeMapper.findAllCodeByPage(map);
        PageInfo<UserforAdminVo> page = new PageInfo<UserforAdminVo>(randomCodeList);

        return page;
    }


    /**
     * 当检查出来存在的时候判断这个是否使用过，如果使用抛出异常
     * @param codeText
     * @return
     */
    @Override
    public boolean findByCode(String codeText) {

          RandomCode randomCode=  randomCodeMapper.findByCode(codeText);
        if(randomCode==null){
            throw new DateException(RandomEnum.RANDOM_UNUSE);
        }  else    if(randomCode.getUsed()==1){//被兑换
            throw new DateException(RandomEnum.RANDOM_USED);
        }else if(DateUtil.dateuse(randomCode.getValidDate(), new Date())==false){
            throw new DateException(RandomEnum.RANDOM_UNNOWTIME);
        }else
            return true;
    }


    /**
     * service两个动作，一个修改random表
     * 一个添加address表
     * @param random
     * @param userInformation
     * @return
     */

   @Transactional
    @Override
    public boolean exchange(String random, UserInformation userInformation) {

        /**
         * 先增加address表，产生了addressid，然后在给
         * random表修改
         */

Address address = new Address();
        //int addressId;
        //插入表格
       address.setPhone(userInformation.getPhone());
       address.setAddress(userInformation.getAddress());
       address.setUsername(userInformation.getUsername());

        addressService.saveAddress(address);
        //查找addressid
       /**
        * 本来使用查找的，但是有可能会出现一个对象有很多列，使用集合，但是为了取一个id，没有必要
        * 所以在mybatis，使用了key自增，和id为主键
        */
      //  address=   addressService.findByUserInformation(userInformation);
    /*  if(address.getId()!=null){
           addressId=address.getId();
       }*/

       System.out.println("此时主键的值为："+address.getId());


/**
 * 修改random表格，包括是否使用，使用时间，addressid
 */

RandomCode randomCode = new RandomCode();
log.info("[此时的时间是，{}]",new Date());

Date nowDate = new Date();
  /*      SimpleDateFormat datea = new SimpleDateFormat("yyyy-MM-dd");
        String date =datea.format(nowDate.getTime());*/

randomCode.setRandom(random);
randomCode.setExchangeDate(nowDate);
randomCode.setUsed(UseEnum.USE_STATE_USED.getCode());
randomCode.setAddressId(address.getId());

if(randomCodeMapper.updateByCode(randomCode)!=1){
    throw new DateException(RandomEnum.RANDOM_UPDATE);
}
        return true;
    }




    @Override
    public List<UserforUserVo> findByPhone(String phone) {

        List<UserforUserVo> userVos= randomCodeMapper.findByPhone(phone);
       if(userVos ==null){
           throw new DateException(AddressEnum.ADDRESS_NOTFOUNDBYONESELF);
       }

        return userVos;
    }

    @Override
    public int updateGoods(int sendGoods,int id) {


       int i=1;
       RandomCode randomCode = new RandomCode();
       randomCode.setId(id);
       randomCode.setSendGoods(sendGoods);
         if(randomCodeMapper.updateByPrimaryKeySelective(randomCode)!=1){
             throw new DateException(SendGoodsEnum.GOODS_ERROR);
         }
        return i;
    }
}
