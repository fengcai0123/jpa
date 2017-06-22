package com.core.service;

import com.core.entity.Bsr;
import com.core.entity.Comment;
import com.core.entity.Inventory;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/20.
 */
public interface CommentService {

    /*添加商品评分*/
    public Comment insert(Comment comment);

    /*删除商品评分*/
    public void del(int  goodId);

    /*根据goodId查所有对应评分信息*/
    public List<Comment> findCommentByGoodId(int goodId);

    /*查询所有商品评分*/
    public List<Comment> findAll();


}
