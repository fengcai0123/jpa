package com.core.repository;

import com.core.entity.Category;
import com.core.entity.Comment;
import com.core.entity.Sell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
public interface CommentRepository extends JpaRepository<Comment,Integer> {

    @Query("select c from Comment c join c.good g where g.goodId=:goodId")
    public List<Comment> selectAllByGoodId(@Param("goodId") int goodId);
}
