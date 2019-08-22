package com.cnh.service.impl;

import com.cnh.dao.AddressMapper;
import com.cnh.dataobject.Address;
import com.cnh.dto.UserInformation;
import com.cnh.enums.AddressEnum;
import com.cnh.exception.DateException;
import com.cnh.service.AddressService;
import com.cnh.vo.UserforUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
  private   AddressMapper addressMapper;

    /**
     * 保存了之后返回一下，判断这个id加了没
     * @param address
     * @return
     */
    @Override
    public Address save(Address address) {

        addressMapper.insertSelective(address);




        return null;
    }

    @Override
    public Address update(Address address) {
        return null;
    }

    @Override
    public UserforUserVo findByPhone(int phonenumber) {
        return null;
    }


    /**
     * 新增，本来不想写的，但是在另一个servie引用到了
     * @param userInformation
     * @return
     */
    @Override
    public boolean addAddress(UserInformation userInformation) {


        /**
         * 这个可以使用  .builder的方法
         */
        Address address =new Address();
        address.setAddress(userInformation.getAddress());
        address.setUsername(userInformation.getUsername());
        address.setPhone(userInformation.getPhone());

        int i=1;
        if (addressMapper.insertSelective(address)!=i) {
          throw new DateException(AddressEnum.ADDRESS_ERROR);
        } else {
return true;
        }

    }

    @Override
    public int saveAddress(Address address) {
        int i;
          i=addressMapper.insertSelective(address);
        if(i!=1){
            throw new DateException(AddressEnum.ADDRESS_ERROR);
        }
        return i;
    }

    @Override
    public Address findByUserInformation(UserInformation userInformation) {

        Address address = new Address();
        address = addressMapper.selectByUserinformation(userInformation);
if(address==null){
    throw new DateException(AddressEnum.ADDRESS_UNFIND);
}
        return address;
    }
}
