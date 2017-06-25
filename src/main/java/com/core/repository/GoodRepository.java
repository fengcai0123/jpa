package com.core.repository;

import com.core.entity.Good;
import org.hibernate.annotations.NamedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
public interface GoodRepository extends JpaRepository<Good,Integer> {

    @Query("select  g from Good g where g.asin=?1")
    public Good  findAsin(String asin);

    @Query("select  g.asin,g.goodId from Good g where g.asinStatus=?1")
    public List<String> selectAsinByAsinStatus(int asinStatus);

    @Modifying
    @Query("update Good g set " +
        "g.rankNum=:rankNum ,  g.totalSellNum=:totalSellNum where g.goodId=:goodId")
    int  updateOrderByAsin(@Param("rankNum") int rankNum, @Param("totalSellNum")int totalSellNum, @Param("goodId")int goodId);

    /*根据asinStatus更新*/
    @Modifying
    @Query("update Good g set " +
        "g.asinStatus=:newStatus  where g.asinStatus=:oldAsinStatus")
    int  updateAsinStatusByAsinStatus( @Param("newStatus")int newStatus,@Param("oldAsinStatus")int oldStatus);

   /* @Query("select g from Good g JOIN g.priceSet p  where p.goodId=:goodId")
    public Good findGood(int  goodId);*/

    @Query("select g from Good g where g.asin=?1")
    public Good findByAsin( String asin);
}
