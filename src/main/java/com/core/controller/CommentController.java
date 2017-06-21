package com.core.controller;

import com.core.entity.Comment;
import com.core.entity.Inventory;
import com.core.service.CommentService;
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
@RequestMapping("comment")
@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private GoodService goodService;

    @RequestMapping("allList")
    public String findAllComment(Model model){
            List<Comment> commentList = commentService.findAll();
            model.addAttribute("commentList",commentList);
        return "commentList";
    }

    @RequestMapping("list")
    public String findCommentByAsin(@RequestParam String asin,Model model){
        /*根据asin查找商品goodId*/
        int goodId=Integer.parseInt(goodService.findGoodIdByAsin(asin));
        if(goodId!=0) {
            System.out.println("inventoryController 取得返回的goodId=="+goodId);
            List<Comment> commentList = commentService.findCommentByGoodId(goodId);
            model.addAttribute("commentList",commentList);
        }else {
            System.out.println("找不到该商品评分信息!");
        }
        return "comment";
    }

    @RequestMapping("one")
    public String comment(Model model){
        return "redirect:comment";
    }
}
