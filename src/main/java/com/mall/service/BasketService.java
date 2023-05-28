package com.mall.service;

import com.mall.model.BasketDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {
    SqlSession session;


    @Autowired
    public BasketService(SqlSession session) {
        this.session = session;
    }

    private final String NAMESPACE = "mapper.basketMapper";

    public List<BasketDTO> showAllBasket(int id) {
        return session.selectList(NAMESPACE + ".selectAll", id);
    }

    public boolean insertBasket(BasketDTO basketDTO) {
        System.out.println(session);
        if (basketDTO.getUserId() != 0) {
            session.insert(NAMESPACE + ".insert", basketDTO);
            return true;
        } else {
            return false;
        }
    }
    public void deleteOneBasket(int basketId){
        System.out.println(session);
        session.delete(NAMESPACE + ".delete", basketId);
    }

    public void deleteAllBasket(int userId){
        session.delete(NAMESPACE +".deleteAll", userId);
    }

    public BasketDTO selectOneBasket(int id){
        return session.selectOne(NAMESPACE+".selectOne", id);
    }
}
