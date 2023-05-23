package com.mall.service;

import com.mall.model.BasketDTO;
import com.mall.model.ProductDTO;
import com.mall.model.TransactionDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TransactionService {
    SqlSession session;
    private final String NAMESPACE = "mapper.transactionMapper";

    @Autowired
    public TransactionService(SqlSession session) {
        this.session = session;
    }

    public List<TransactionDTO> showAllTransaction() {
        System.out.printf("session: " + session);
        return session.selectList(NAMESPACE + ".selectAll");
    }

    public boolean insertTransaction(TransactionDTO transactionDTO) {
        List<TransactionDTO> list = new ArrayList<>();
        if (transactionDTO.getTransactionID() != 0) {
            session.insert(NAMESPACE, ".insert");
            return true;
        } else {
            return false;
        }
    }
}
