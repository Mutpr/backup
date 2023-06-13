package com.ipa.openapi_inzent.service;

import com.ipa.openapi_inzent.dao.RequestDao;
import com.ipa.openapi_inzent.model.RequestDTO;
import com.ipa.openapi_inzent.model.UserDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class RequestService {
    private RequestDao requestDao;
    public RequestService(@Qualifier("requestDao") RequestDao requestDao) {
        this.requestDao = requestDao;
    }
    public int countAll(){
        return requestDao.countAll();
    }
    public List<RequestDTO> selectAll(int pageNo) {
        HashMap<String, Integer> params = new HashMap<>();

        int size = 5;
        int start = ((pageNo - 1)*size);

        params.put("start", start);
        params.put("size",size);
        return requestDao.selectAll(params);
    }

    public List<RequestDTO> reqUserList() {
        return requestDao.reqUserList();
    }

    public RequestDTO selectOne(int id) {
        return requestDao.selectOne(id);
    }

    public void insert(RequestDTO requestDTO) {
        requestDao.insert(requestDTO);
    }

    public void delete(int id) {
        requestDao.delete(id);
    }

    public RequestDTO selectUserId(int userId) {
        return requestDao.selectUserId(userId);
    }

    public void updateRequest(RequestDTO requestDTO) {
        requestDao.updateRequest(requestDTO);
    }

    public List<RequestDTO> requestSearch(String keyword) {
        return requestDao.requestSearch(keyword);
    }
}
