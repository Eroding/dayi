package com.cnh.service;


import com.cnh.dataobject.Address;
import com.cnh.dto.UserInformation;
import com.cnh.vo.UserforUserVo;

public interface AddressService {

//添加地址
    public Address save(Address address);

    /**
     * 到后面会做用户查询页面一个修改手机号或者地址的接口
     * @param address
     * @return
     */
    public Address update(Address address);


    public UserforUserVo findByPhone(int phonenumber);

    /**
     * 新增，因为在一个servie最好用另一个的servie，不要是用dao层
     */

    boolean addAddress(UserInformation userInformation);

    /**
     * 新增一个数据，但是插入对象是address
     */
int saveAddress(Address address);

    /**
     * 查找addressId
     */
    Address findByUserInformation(UserInformation userInformation);
}
