package com.ipa.openapi_inzent.service;

import com.ipa.openapi_inzent.dao.MydataDao;
import com.ipa.openapi_inzent.model.*;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class MydataService {

    private MydataDao mydataDao;

    public MydataService(MydataDao mydataDao) {
        this.mydataDao = mydataDao;
    }

    public List<MdProviderDTO> selectMdProviderAsPaging(int pageNo){
        HashMap<String, Integer> params = new HashMap<>();
        int size = 1;
        int start = (pageNo-1)*size;

        params.put("start", start);
        params.put("size", size);

        return mydataDao.mdProviderSelectAllPagination(params);
    }

    public List<MdReqInfoDTO> selectMdReqAllasPagination(int pageNo){
        HashMap<String, Integer> params = new HashMap<>();

        int size = 1;
        int start = ((pageNo -1 ) * size);

        params.put("start", start);
        params.put("size", size);
        System.out.println("params = " + params);

        return mydataDao.selectMdReqAllasPagination(params);
    }

    public int countAll(){
        return mydataDao.countAll();
    }

}

