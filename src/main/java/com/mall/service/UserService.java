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
    public UserDTO selectOne(UserDTO user){
       return session.selectOne(NAMESPACE+".selectOne", user);
    }

    public List<UserDTO> selectAll(){
        return session.selectList(NAMESPACE+".selectAll");
    }

    public boolean insert(UserDTO userDTO){
        if(userDTO.getUserName()!= null){
            session.insert(NAMESPACE+".insert", userDTO);
            return true;
        }return false;
    }

    public int findUserId(int userId){
        return session.selectOne(NAMESPACE+".selectOneById", userId);
    }

}
