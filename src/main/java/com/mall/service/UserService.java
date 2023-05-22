package com.mall.service;

import com.mall.model.ProductDTO;
import com.mall.model.UserDTO;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    SqlSession session;

    @Autowired
    public UserService(SqlSession session){
        this.session = session;
    }
    private final String NAMESPACE = "mapper.userMapper";
    public UserDTO selectOne(int id){
        return session.selectOne(NAMESPACE+".selectOne", id);
    }

    public List<UserDTO> selectAll(){
        return session.selectList(NAMESPACE+".selectAll");
    }
//
//    public boolean insert(UserDTO userDTO){
//        if(userDTO.getUserName()!= null){
//            session.insert(NAMESPACE+".insert", userDTO);
//            return true;
//        }return false;
//    }
    public void delete(int id) {
        session.delete(NAMESPACE + ".delete", id);
    }

    public int update(ProductDTO productDTO){
        return session.update(NAMESPACE+".update", productDTO);
    }

}
