package com.cnh.dataobject;

import java.util.Date;

public class Address {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_address.id
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_address.username
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_address.phone
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    private Long phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_address.address
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_address.create_date
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    private Date createDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_address.id
     *
     * @return the value of tb_address.id
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_address.id
     *
     * @param id the value for tb_address.id
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_address.username
     *
     * @return the value of tb_address.username
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_address.username
     *
     * @param username the value for tb_address.username
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_address.phone
     *
     * @return the value of tb_address.phone
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public Long getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_address.phone
     *
     * @param phone the value for tb_address.phone
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_address.address
     *
     * @return the value of tb_address.address
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_address.address
     *
     * @param address the value for tb_address.address
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_address.create_date
     *
     * @return the value of tb_address.create_date
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_address.create_date
     *
     * @param createDate the value for tb_address.create_date
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}