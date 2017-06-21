package com.core.repository;

import com.core.entity.Category;
import com.core.entity.Inventory;
import com.core.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
public interface PriceRepository extends JpaRepository<Price,Integer> {

    @Query("select p from Price p join p.good g where g.goodId=:goodId")
    //@Query("select i from Inventory i ,in(i.good) g where g.goodId=:goodId")
    public List<Price> selectAllByGoodId(@Param("goodId") int goodId);
}
