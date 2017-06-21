package com.core.repository;

import com.core.entity.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
public interface GoodRepository extends JpaRepository<Good,Integer> {
    @Query("select  g from Good g where g.asin=?1")
    public Good  findAsin(String asin);

    @Modifying
    @Query("update Good g set " +
        "g.rankNum=:rankNum ,  g.totalSellNum=:totalSellNum where g.goodId=:goodId")
    int  updateOrderByAsin(@Param("rankNum") int rankNum, @Param("totalSellNum")int totalSellNum, @Param("goodId")int goodId);

   /* @Query("select g from Good g JOIN g.priceSet p  where p.goodId=:goodId")
    public Good findGood(int  goodId);*/
}
