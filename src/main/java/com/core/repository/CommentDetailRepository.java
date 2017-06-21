package com.core.repository;

import com.core.entity.Category;
import com.core.entity.CommentDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
public interface CommentDetailRepository extends JpaRepository<CommentDetail,Integer> {
}
