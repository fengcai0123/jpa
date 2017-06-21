package com.core.controller;

import com.core.entity.Inventory;
import com.core.entity.Price;
import com.core.service.GoodService;
import com.core.service.InventoryService;
import com.core.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/20.
 */
@RequestMapping("price")
@Controller
public class PriceController {

    @Autowired
    private PriceService priceService;

    @Autowired
    private GoodService goodService;

    @RequestMapping("allList")
    public String findAllPrice(Model model){
            List<Price> priceList = priceService.findAll();
            model.addAttribute("priceList",priceList);
        return "priceList";
    }

    @RequestMapping("list")
    public String findPriceByAsin(@RequestParam String asin,Model model){
        /*根据asin查找商品goodId*/
        int goodId=Integer.parseInt(goodService.findGoodIdByAsin(asin));
        if(goodId!=0) {
            System.out.println("priceController 取得返回的goodId=="+goodId);
            List<Price> priceList = priceService.findPriceByGoodId(goodId);
            model.addAttribute("priceList",priceList);
        }else {
            System.out.println("找不到该商品价格信息!");
        }
        return "price";
    }

    @RequestMapping("one")
    public String price(Model model){
        return "redirect:price";
    }
}
