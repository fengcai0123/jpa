package com.core.service.impl;

import com.core.entity.Comment;
import com.core.entity.Price;
import com.core.repository.CommentRepository;
import com.core.repository.PriceRepository;
import com.core.service.CommentService;
import com.core.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/20.
 */
@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    private PriceRepository priceRepository;
    @Override
    public Price insert(Price price) {
        return priceRepository.save(price);
    }

    @Override
    public void del(int goodId) {

    }

    @Override
    public List<Price> findPriceByGoodId(int goodId) {
        List<Price> priceList=priceRepository.selectAllByGoodId(goodId);
        return priceList;
    }

    @Override
    public List<Price> findAll() {
        return priceRepository.findAll();
    }
}
