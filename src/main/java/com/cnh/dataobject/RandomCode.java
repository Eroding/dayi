package com.cnh.dataobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RandomCode {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_redom_code.id
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_redom_code.random
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    private String random;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_redom_code.trophy_id
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    private Integer trophyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_redom_code.address_id
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    private Integer addressId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_redom_code.use
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    private Integer used;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_redom_code.send_goods
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    private Integer sendGoods;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_redom_code.create_date
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_redom_code.exchange_date
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    private Date exchangeDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_redom_code.valid_date
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    private String validDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_redom_code.id
     *
     * @return the value of tb_redom_code.id
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_redom_code.id
     *
     * @param id the value for tb_redom_code.id
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_redom_code.random
     *
     * @return the value of tb_redom_code.random
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public String getRandom() {
        return random;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_redom_code.random
     *
     * @param random the value for tb_redom_code.random
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public void setRandom(String random) {
        this.random = random == null ? null : random.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_redom_code.trophy_id
     *
     * @return the value of tb_redom_code.trophy_id
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public Integer getTrophyId() {
        return trophyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_redom_code.trophy_id
     *
     * @param trophyId the value for tb_redom_code.trophy_id
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public void setTrophyId(Integer trophyId) {
        this.trophyId = trophyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_redom_code.address_id
     *
     * @return the value of tb_redom_code.address_id
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_redom_code.address_id
     *
     * @param addressId the value for tb_redom_code.address_id
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_redom_code.use
     *
     * @return the value of tb_redom_code.use
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public Integer getUsed() {
        return used;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_redom_code.use
     *
     * @param used the value for tb_redom_code.use
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public void setUsed(Integer used) {
        this.used = used;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_redom_code.send_goods
     *
     * @return the value of tb_redom_code.send_goods
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public Integer getSendGoods() {
        return sendGoods;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_redom_code.send_goods
     *
     * @param sendGoods the value for tb_redom_code.send_goods
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public void setSendGoods(Integer sendGoods) {
        this.sendGoods = sendGoods;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_redom_code.create_date
     *
     * @return the value of tb_redom_code.create_date
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_redom_code.create_date
     *
     * @param createDate the value for tb_redom_code.create_date
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_redom_code.exchange_date
     *
     * @return the value of tb_redom_code.exchange_date
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public Date getExchangeDate() {
        return exchangeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_redom_code.exchange_date
     *
     * @param exchangeDate the value for tb_redom_code.exchange_date
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public void setExchangeDate(Date exchangeDate) {
        this.exchangeDate = exchangeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_redom_code.valid_date
     *
     * @return the value of tb_redom_code.valid_date
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public String getValidDate() {
        return validDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_redom_code.valid_date
     *
     * @param validDate the value for tb_redom_code.valid_date
     *
     * @mbggenerated Fri Aug 16 10:07:20 CST 2019
     */
    public void setValidDate(String validDate) {
        this.validDate = validDate == null ? null : validDate.trim();
    }
}