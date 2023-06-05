package com.mall.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final String NAMESPACE="mapper.categoryMapper";
    SqlSession session;
    @Autowired
    public CategoryService(SqlSession session) {
        this.session = session;
    }

    public int countCategoryProduct(int categoryId){
        return session.selectOne(NAMESPACE+".countByCategory", categoryId);
    }

    public int countCategory(){
        return session.selectOne(NAMESPACE+".categoryCount");
    }

}
