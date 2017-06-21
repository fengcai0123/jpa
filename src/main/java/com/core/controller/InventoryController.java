package com.core.controller;

import com.core.entity.Inventory;
import com.core.service.GoodService;
import com.core.service.InventoryService;
import com.core.service.impl.GoodServiceImpl;
import com.core.service.impl.InventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/20.
 */
@RequestMapping("inventory")
@Controller
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @Autowired
    private GoodService goodService;

    @RequestMapping("allList")
    public String findAllInventory(Model model){
            List<Inventory> inventoryList = inventoryService.findAll();
            model.addAttribute("inventoryList",inventoryList);
        return "inventoryList";
    }

    @RequestMapping("list")
    public String findInventoryByAsin(@RequestParam String asin,Model model){
        /*根据asin查找商品goodId*/
        int goodId=Integer.parseInt(goodService.findGoodIdByAsin(asin));
        if(goodId!=0) {
            System.out.println("inventoryController 取得返回的goodId=="+goodId);
            List<Inventory> inventoryList = inventoryService.findInventoryByGoodId(goodId);
            model.addAttribute("inventoryList",inventoryList);
        }else {
            System.out.println("找不到该商品库存信息!");
        }
        return "inventory";
    }

    @RequestMapping("one")
    public String inventory(Model model){
        return "redirect:inventory";
    }
}
