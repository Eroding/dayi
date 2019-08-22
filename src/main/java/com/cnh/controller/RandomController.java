package com.cnh.controller;

import com.cnh.dataobject.RandomCode;
import com.cnh.dto.CodeFindTermDto;
import com.cnh.dto.RandomDto;
import com.cnh.dto.UserInformation;
import com.cnh.enums.SendGoodsEnum;
import com.cnh.enums.UseEnum;
import com.cnh.result.Result;
import com.cnh.service.RandomService;
import com.cnh.util.RandomUtil;
import com.cnh.util.ResultUtil;
import com.cnh.vo.UserforAdminVo;
import com.cnh.vo.UserforUserVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/random")
@Slf4j
public class RandomController {

    @Autowired
    private RandomService randomService;

    /**
     * 管理员随机数生成页面
     * @return
     */
    @RequestMapping("/createrandom")
    public String createRandom(){
        return "createrandom";
    }

//兑换兑换码
    @RequestMapping("/exchangeCode")
    public String exchangeCode(){
        return "exchangerandom";
    }

    //用户查看兑换信息
    @RequestMapping("/userlook")
    public String userlook(){
        return "userlook";
    }

    //用户管理员查看兑换记录
    @RequestMapping("/adminlook")
    public String adminlook(){
        return "adminlook";
    }



    /**
     * 生成随机兑换码。传进来的是RandomDto
     * 这个时间是否存在于兑奖日期,做一个日期工具，
     */

    @RequestMapping("/generation")
    @ResponseBody
public Result<Integer> generation(RandomDto randomDto){
//生成随机数个数
        int size=1000;
        List<RandomCode> randomCodeList = new ArrayList<>();

for(int i=0;i<size;i++){
    randomCodeList.add(RandomCode.builder()
    .random(RandomUtil.generateString(11))
            .trophyId(randomDto.getTrophy())
            .validDate(randomDto.getValidDate())
            .sendGoods(SendGoodsEnum.GOODS_UNSEND.getCode())
            .used(UseEnum.USE_STATE_UNUSE.getCode())
            .build());
}
     int i=   randomService.addRandomList(randomCodeList);
        //这个成功不需要传回值。只需要传回一个信息


        return ResultUtil.success(i);

    }

/**
 * 查找数量，里面有全查和条件查询,所以加个required=false
 */
    @RequestMapping("/findAll")
   // @ResponseBody
    /**
     * 好像使用name传进来的值不能使用一个对象去接受，
     */
    public String findAll(Model model,
                      @RequestParam(value="pageNo",defaultValue = "1") Integer pageNo,
                      @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                     /* @RequestParam(value = "codeFindTermDto",required = false) CodeFindTermDto codeFindTermDto*/
                          @RequestParam(value = "trophy",required = false) String trophy,
                          @RequestParam(value = "used",required = false) String used,
                          @RequestParam(value = "sendGoods",required = false) String sendGoods

    ){

/*if(codeFindTermDto!=null){
    log.info("[此时传进来的条件是],{}",codeFindTermDto.getSendGoods());
}*/

        System.out.println("trophy="+trophy+"used="+used+"sendGoods="+sendGoods);
        PageInfo<UserforAdminVo> page = randomService.findAll(pageNo,pageSize,trophy,used,sendGoods);


        log.info("[page],{}",page.getSize());

        model.addAttribute("pageInfo",page);
return "adminlook";
    }


    /**
     * 验证兑换码是否存在
     */

    @RequestMapping("/checkCode")
    @ResponseBody
    public Result<Boolean> checkCode(String random){
       randomService.findByCode(random);
            return ResultUtil.success(true);

    }

/**
 * 兑换开始
 */

    @RequestMapping("/useCode")
    @ResponseBody
public Result<Boolean> useCode(String random,UserInformation userInformation){

        /**
         * 兑换开始，先看一下这次输进来的兑换码是不是对的
         */

        randomService.findByCode(random);

/**
 * 开始兑换
 */

randomService.exchange(random,userInformation);

return ResultUtil.success(true);



    }

/**
 * 用户单查
 */
@RequestMapping("/findByPhone")
@ResponseBody
public Result<List<UserforUserVo>> findByUser(String phone){

    List<UserforUserVo> userVos=  randomService.findByPhone(phone);

    return ResultUtil.success(userVos);
}


/**
 * 修改发货状态
 */
    @RequestMapping("/updateGoodsState")
    @ResponseBody
public Result<Boolean> updateGoodsState(int sendGoods,int id){

        randomService.updateGoods(sendGoods,id);

return ResultUtil.success(true);

    }




}
