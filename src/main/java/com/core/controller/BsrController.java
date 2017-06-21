package com.core.controller;

import com.core.entity.Bsr;
import com.core.entity.Inventory;
import com.core.service.BsrService;
import com.core.service.GoodService;
import com.core.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/20.
 */
@RequestMapping("bsr")
@Controller
public class BsrController {

    @Autowired
    private BsrService bsrService;

    @Autowired
    private GoodService goodService;

    @RequestMapping("allList")
    public String findAllBsr(Model model){
            List<Bsr> bsrList = bsrService.findAll();
            model.addAttribute("bsrList",bsrList);
        return "bsrList";
    }

    @RequestMapping("list")
    public String findBsrByAsin(@RequestParam String asin,Model model){
        /*根据asin查找商品goodId*/
        int goodId=Integer.parseInt(goodService.findGoodIdByAsin(asin));
        if(goodId!=0) {
            System.out.println("inventoryController 取得返回的goodId=="+goodId);
            List<Bsr> bsrList = bsrService.findBsrByGoodId(goodId);
            model.addAttribute("bsrList",bsrList);
        }else {
            System.out.println("找不到该商品库存信息!");
        }
        return "bsr";
    }

    @RequestMapping("one")
    public String bsr(Model model){
        return "redirect:bsr";
    }
}
