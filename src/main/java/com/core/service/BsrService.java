package com.core.service;

import com.core.entity.Bsr;
import com.core.entity.Inventory;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/20.
 */
public interface BsrService {

    /*添加商品BSR排名*/
    public Bsr insert(Bsr bsr);

    /*根据goodId查所有库存信息*/
    public List<Bsr> findBsrByGoodId(int goodId);

    /*查询所有商品库存*/
    public List<Bsr> findAll();


}
