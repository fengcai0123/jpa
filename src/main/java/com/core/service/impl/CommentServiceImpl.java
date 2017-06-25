package com.core.service.impl;

import com.core.entity.Comment;
import com.core.repository.CommentRepository;
import com.core.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/20.
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Override
    public Comment insert(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void del(int goodId) {

    }

    @Override
    public List<Comment> findCommentByGoodId(int goodId) {
        List<Comment> commentList=commentRepository.selectAllByGoodId(goodId);
        return commentList;
    }

    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }
}
