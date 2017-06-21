package com.core.repository;

import com.core.entity.Category;
import com.core.entity.Price;
import com.core.entity.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
public interface RankRepository extends JpaRepository<Rank,Integer> {


}
