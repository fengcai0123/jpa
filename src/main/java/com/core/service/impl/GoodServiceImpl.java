package com.core.service.impl;

import com.core.entity.Good;
import com.core.repository.GoodRepository;
import com.core.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
@Service
public class GoodServiceImpl implements GoodService {


    @Autowired
    private GoodRepository goodRepository;

    @Override
    //根据asin查找是否已经存在
    public String findGoodIdByAsin(String asin) {
        Good good=goodRepository.findAsin(asin);
        if(good!=null){
            System.out.println("查询到的goodId 不为空=="+good.getGoodId());
            return String.valueOf(good.getGoodId());
        }else {
            System.out.println("查询到的goodId 不存在");
            return "0";
        }
    }



    @Override
    @Transactional
    public Good insert(Good good) {
        return goodRepository.save(good);
    }

    public List<Good> getAll() {
        List<Good> goodList=goodRepository.findAll();
        return goodList;
    }

    @Override
    @Transactional
    public void  update(Good g) {
        goodRepository.updateOrderByAsin(g.getRankNum(),g.getTotalSellNum(),g.getGoodId());
    }

    @Override
    public Good findGoodByAsin(int  goodId) {
        Good good=goodRepository.findOne(goodId);
        return null;
    }

    @Override
    public List<String> findAsinByAsinStatus(int asinStatus) {
        List<String> asinList=goodRepository.selectAsinByAsinStatus(asinStatus);
        return asinList;
    }
}
