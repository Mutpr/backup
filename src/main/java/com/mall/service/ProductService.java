package com.mall.service;

import com.mall.controller.ControllerImpl;
import com.mall.model.ProductDTO;
import lombok.*;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Service
public class ProductService {
    SqlSession session;
    private final String NAMESPACE = "mapper.productMapper";
    HttpSession httpSession;
    private final int PAGE_SIZE = 10;
    @Autowired
    public ProductService(SqlSession session) {
        this.session = session;
    }

    public List<ProductDTO> selectAll(){
        return session.selectList(NAMESPACE+".selectAll");
    }
    public List<ProductDTO> selectAsPagination(int pageNo) {
        HashMap<String, Integer> params = new HashMap<>();
        params.put("start", (pageNo - 1) * PAGE_SIZE);
        params.put("size", PAGE_SIZE);

        return session.selectList(NAMESPACE + ".selectAsPagination", params);
    }

    public int countByPrice(HashMap<String, Integer> list){
        HashMap<String, Integer> params = new HashMap<>();
        params.put("start", list.get("start"));
        params.put("limit", list.get("limit"));
        params.put("category", list.get("category"));
        System.out.println("parmas = " + params);
        return session.selectOne(NAMESPACE + ".categoryPrice", params);
    }

    public ProductDTO selectOne(int id) {
        return session.selectOne(NAMESPACE + ".selectOne", id);
    }

    public boolean insert(ProductDTO productDTO) {
        System.out.println("insert:====== " + productDTO);
        if (productDTO.getProductName() != null) {
            System.out.println("ProductService.insert");
            System.out.println("productDTO = " + productDTO);

            session.insert(NAMESPACE + ".insert", productDTO);
            return true;
        } else {
            return false;
        }
    }

    public void delete(int id) {
        session.delete(NAMESPACE + ".delete", id);
    }

    public int update(ProductDTO productDTO) {
        return session.update(NAMESPACE + ".update", productDTO);
    }

    public List<ProductDTO> selectProductName(int userId) {
        return session.selectList(NAMESPACE + ".selectName", userId);
    }

    public int countAll(){
        return session.selectOne(NAMESPACE+".count");
    }

    public int selectLastPage() {
        int count = session.selectOne(NAMESPACE + ".count");
        int total = count / PAGE_SIZE;
        if (count % PAGE_SIZE != 0) {
            total++;
        }

        return total;
    }
}