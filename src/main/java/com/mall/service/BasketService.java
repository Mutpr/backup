package com.mall.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class BasketService {
    SqlSession session;
    private final String NAMESPACE = "mapper.basketMapper";
    public BasketService(SqlSession session){
        this.session = session;
    }
    
}
