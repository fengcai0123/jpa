package com.core.repository;

import com.core.entity.Bsr;
import com.core.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/20.
 */
public interface BsrRepository extends JpaRepository<Bsr,Integer> {

    @Query("select  b from Bsr b join b.good g where g.goodId=:goodId order by b.date asc ")
    public List<Bsr> selectAllByGoodId(@Param("goodId") int goodId);
}
