package com.mall.controller;

import javax.servlet.http.HttpSession;

public class ControllerImpl {

    public int sessionToInt(HttpSession session, String sessionName){
        String sessionResultInt = (String)session.getAttribute(sessionName);
        if(sessionResultInt != null){
            String resultTrim = sessionResultInt.trim();
            return Integer.parseInt(resultTrim);
        }else{
            return 0;
        }
    }
}
