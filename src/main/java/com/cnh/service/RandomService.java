package com.cnh.service;

import com.cnh.dataobject.RandomCode;
import com.cnh.dto.CodeFindTermDto;
import com.cnh.dto.UserInformation;
import com.cnh.vo.UserforAdminVo;
import com.cnh.vo.UserforUserVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface RandomService {

    //添加新的随机码
    public int addRandom(RandomCode randomCode);

//批量添加随机码
int addRandomList(List<RandomCode> randomCodeList);

//查询随机数
    PageInfo<UserforAdminVo> findAll(int pageNo, int pageSize, CodeFindTermDto codeFindTermDto);
/*
查询随机数。使用form提交的
 */
PageInfo<UserforAdminVo> findAll(int pageNo, int pageSize, String trophy,String used,String sendGoods);
//检查兑换码是否存在
    boolean findByCode(String codeText);



    //开始兑换
    boolean exchange(String random, UserInformation userInformation);


    //根据手机号传回值
   List<UserforUserVo>  findByPhone(String phone);


   //更新发货状态
    int updateGoods(int sendGoods,int id);


}
