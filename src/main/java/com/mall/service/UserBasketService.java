package com.mall.service;

import com.mall.model.UserBasketDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserBasketService {
    SqlSession session;
    private final String NAMESPACE = "mapper.basketMapper";

    public UserBasketService(SqlSession session) {
        this.session = session;
    }

    public List<UserBasketDTO> selectAll() {
        return session.selectList(NAMESPACE + ".selectList");
    }

}
