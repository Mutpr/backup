package com.mall.service;

import com.mall.model.ProductDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Service
public class ProductService {
    SqlSession session;
    String NAMESPACE = "mapper.productMapper";
    HttpSession httpSession;

    @Autowired
    public ProductService(SqlSession session) {
        this.session = session;
    }

    public List<ProductDTO> selectAll(@RequestParam("count") String size, @RequestParam("pageNo") String start) {
        HashMap<String, Integer> params = new HashMap<>();
        if (size != null && start != null) {
            System.out.println("count = " + size);
            System.out.println("pageNo = " + start);
            String countTrim = size.trim();
            String pageNoTrim = size.trim();

            int countInt = Integer.parseInt(countTrim);
            int pageNoInt = Integer.parseInt(pageNoTrim);

            params.put("start", (pageNoInt - 1) * countInt);
            params.put("size", countInt);
        }
        System.out.println("params = " + params);
        System.out.println("session.selectList(NAMESPACE+\".selectAll\"),params = " + session.selectList(NAMESPACE+".selectAll", params));
        return session.selectList(NAMESPACE + ".selectAll", params);
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
        return session.selectOne(NAMESPACE+"count");
    }

//    public int selectLastPage() {
//        int count = session.selectOne(NAMESPACE + ".count");
//        int total = count / PAGE_SIZE;
//        if (count % PAGE_SIZE != 0) {
//            total++;
//        }
//
//        return total;
//    }
}