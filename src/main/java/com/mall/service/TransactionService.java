package com.mall.service;

import com.mall.controller.TransactionController;
import com.mall.model.ProductDTO;
import com.mall.model.TransactionDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final String NAMESPACE = "mapper.transactionMapper";
    SqlSession session;
    TransactionController transactionController;
    @Autowired
    public TransactionService(SqlSession session){
        this.session=session;
    }

    public List<TransactionDTO> selectAll(int userId){
        return session.selectList(NAMESPACE+".selectAllTransaction", userId);
    }

    public void addTransaction(TransactionDTO transactionDTO){
        session.insert(NAMESPACE+".insertTransaction", transactionDTO);
    }

    public List<TransactionDTO> selectTransaction(int id){
        return session.selectList(NAMESPACE+".selectName", id);
    }

    public void deleteAllTransaction(int userId){
        session.delete(NAMESPACE +".deleteAll", userId);
    }

    public TransactionDTO selectOneTransaction(int id){
        return session.selectOne(NAMESPACE+".selectOneTransaction", id);
    }
}
