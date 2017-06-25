package com.core.service.impl;

import com.core.entity.Inventory;
import com.core.repository.InventoryRepository;
import com.core.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/20.
 */
@Service
public class InventoryServiceImpl implements InventoryService {
    @Override
    public void del(int goodId) {

    }

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public Inventory insert(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override
    public List<Inventory> findInventoryByGoodId(int goodId) {
        List<Inventory> inventoryList=inventoryRepository.selectAllGoodId(goodId);
        System.out.println("InventoryServiceImpl 取得返回的 inventoryList.size()=="+inventoryList.size());
        if(inventoryList.size()>0) {
            for (Inventory i:inventoryList) {
                System.out.println("InventoryServiceImpl 取得返回的inventoryList InventoryId==" + i.getInventoryId());          ;
            }
        }
        return inventoryList;
    }

    @Override
    public List<Inventory> findAll() {
        List<Inventory> inventoryList=inventoryRepository.findAll();
        return inventoryList;

    }
}
