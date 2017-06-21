package com.core.service;

import com.core.entity.Good;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
public interface GoodService {
    public List<Good> getAll();
    public Good insert(Good good);
    public  String findGoodIdByAsin(String asin);
    public Good findGoodByAsin(int  goodId);
    public void  update(Good good);
}
