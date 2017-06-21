package com.core.repository;

import com.core.entity.Bsr;
import com.core.entity.Sell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
public interface SellRepository extends JpaRepository<Sell,Integer> {

    @Query("select s from Sell s join s.good g where g.goodId=:goodId")
    public List<Sell> selectAllByGoodId(@Param("goodId") int goodId);
}
