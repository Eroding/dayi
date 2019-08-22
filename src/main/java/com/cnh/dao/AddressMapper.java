package com.cnh.dao;

import com.cnh.dataobject.Address;
import com.cnh.dto.UserInformation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    int insert(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    int insertSelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    Address selectByPrimaryKey(Integer id);




    Address selectByUserinformation(UserInformation userInformation);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    int updateByPrimaryKeySelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    int updateByPrimaryKey(Address record);
}