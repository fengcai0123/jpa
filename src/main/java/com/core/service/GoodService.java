package com.core.service;

import com.core.entity.Good;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
public interface GoodService {

    public Good insert(Good good);


    public void  update(Good good);

    public  String findGoodIdByAsin(String asin);

    /*根据asinStatus查找asin*/
    public List<String> findAsinByAsinStatus(int asinStatus);

    public Good findGoodByAsin(int  goodId);
    public List<Good> getAll();
}
