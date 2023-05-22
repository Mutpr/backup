package com.mall.service;

import com.mall.model.ProductDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public class ProductService {
    SqlSession session;

    @Autowired
    public ProductService(SqlSession session) {
        this.session = session;
    }

    String NAMESPACE = "mapper.productMapper";

    public List<ProductDTO> selectAll() {
        System.out.printf("session: " + session);
        return session.selectList(NAMESPACE + ".selectAll");
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

    public int update(ProductDTO productDTO){
        return session.update(NAMESPACE+".update", productDTO);
    }
}