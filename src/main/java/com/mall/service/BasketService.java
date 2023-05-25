package com.mall.service;

import com.mall.model.BasketDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasketService {
    SqlSession session;
    private final String NAMESPACE = "mapper.transactionMapper";

    @Autowired
    public BasketService(SqlSession session) {
        this.session = session;
    }

    public List<BasketDTO> showAllTransaction() {
        System.out.printf("session: " + session);
        return session.selectList(NAMESPACE + ".selectAll");
    }

    public boolean insertTransaction(BasketDTO basketDTO) {
        List<BasketDTO> list = new ArrayList<>();
        if (basketDTO.getBasketId() != 0) {
            session.insert(NAMESPACE, ".insert");
            return true;
        } else {
            return false;
        }
    }
}
