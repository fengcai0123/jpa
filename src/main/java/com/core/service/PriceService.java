package com.core.service;

import com.core.entity.Bsr;
import com.core.entity.Inventory;
import com.core.entity.Price;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/20.
 */
public interface PriceService {

    /*添加商品价格*/
    public Price insert(Price price);

    /*删除商品价格*/
    public void del(int  goodId);

    /*根据goodId查所有价格信息*/
    public List<Price> findPriceByGoodId(int goodId);

    /*查询所有商品价格信息*/
    public List<Price> findAll();


}
