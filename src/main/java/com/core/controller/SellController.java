package com.core.controller;

import com.core.entity.Inventory;
import com.core.entity.Sell;
import com.core.service.GoodService;
import com.core.service.InventoryService;
import com.core.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/20.
 */
@RequestMapping("sell")
@Controller
public class SellController {

    @Autowired
    private SellService sellService;

    @Autowired
    private GoodService goodService;

    @RequestMapping("allList")
    public String findAllSell(Model model){
            List<Sell> sellList = sellService.findAll();
            model.addAttribute("sellList",sellList);
        return "sellList";
    }

    @RequestMapping("list")
    public String findSellByAsin(@RequestParam String asin,Model model){
        /*根据asin查找商品goodId*/
        int goodId=Integer.parseInt(goodService.findGoodIdByAsin(asin));
        if(goodId!=0) {
            System.out.println("SellController 取得返回的goodId=="+goodId);
            List<Sell> sellList = sellService.findSellByGoodId(goodId);
            model.addAttribute("sellList",sellList);
        }else {
            System.out.println("找不到该商品销量信息!");
        }
        return "sell";
    }

    @RequestMapping("one")
    public String sell(Model model){
        return "redirect:sell";
    }
}
