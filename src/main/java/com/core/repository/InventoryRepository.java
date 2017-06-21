package com.core.repository;

import com.core.entity.Category;
import com.core.entity.Inventory;
import com.core.entity.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
public interface InventoryRepository extends JpaRepository<Inventory,Integer> {

    @Query("select i from Inventory i ,in(i.good) g where g.goodId=:goodId")
    public List<Inventory> selectAllGoodId(@Param("goodId") int goodId);
}
