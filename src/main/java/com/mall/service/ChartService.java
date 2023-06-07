package com.mall.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChartService {
    private final String NAMESPACE="mapper.categoryMapper";
    SqlSession session;
    @Autowired
    public ChartService(SqlSession session) {
        this.session = session;
    }

    public int countCategoryProduct(int categoryId){
        return session.selectOne(NAMESPACE+".countByCategory", categoryId);
    }

    public int countCategory(){
        return session.selectOne(NAMESPACE+".categoryCount");
    }

    public String getName(int id){
        return session.selectOne(NAMESPACE+".categoryName", id);
    }

}
