package com.core.service.impl;

import com.core.entity.Price;
import com.core.entity.Sell;
import com.core.repository.SellRepository;
import com.core.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
@Service
public class SellServiceImpl implements SellService{
    @Autowired
    private SellRepository sellRepository;

    @Override
    public Sell insert(Sell sell) {
        return sellRepository.save(sell);
    }

    @Override
    public void del(int goodId) {

    }

    @Override
    public List<Sell> findSellByGoodId(int goodId) {
        List<Sell> sellList=sellRepository.selectAllByGoodId(goodId);
        return sellList;
    }

    @Override
    public List<Sell> findAll() {
        return sellRepository.findAll();
    }
}
