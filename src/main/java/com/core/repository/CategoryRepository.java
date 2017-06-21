package com.core.repository;

import com.core.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
