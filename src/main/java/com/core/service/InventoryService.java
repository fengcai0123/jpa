package com.core.service;

import com.core.entity.Inventory;
import com.core.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/20.
 */
public interface InventoryService {

    public Inventory insert(Inventory inventory);

    /*根据goodId查所有库存信息*/
    public List<Inventory> findInventoryByGoodId(int goodId);

    /*查询所有商品库存*/
    public List<Inventory> findAll();
}
