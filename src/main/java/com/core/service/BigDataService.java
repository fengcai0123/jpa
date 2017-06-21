package com.core.service;

import com.core.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/14.
 */

public interface BigDataService {
    public List<Product> resultData(String str);
    public String getData(String url);
    public List<Product> analysisData(String data);
    public List<Product> analyData(String html);

}
