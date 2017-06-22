package com.core.service;

import com.core.entity.Price;
import com.core.entity.Sell;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
public interface SellService  {
    /*添加商品销量*/
    public Sell insert(Sell sell);

    /*删除商品销量*/
    public void del(int  goodId);

    /*根据goodId查所有销量信息*/
    public List<Sell> findSellByGoodId(int goodId);

    /*查询所有商品销量信息*/
    public List<Sell> findAll();
}
