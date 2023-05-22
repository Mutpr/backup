package com.mall.model;


import lombok.Data;

@Data
public class UserDTO {
    private int userId;
    private String userName;
    private String userPassword;
    private String userNickname;
    private String userRole;
}
