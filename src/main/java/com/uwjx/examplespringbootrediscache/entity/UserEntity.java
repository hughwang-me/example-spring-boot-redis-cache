package com.uwjx.examplespringbootrediscache.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserEntity {

    private Long id;
    private String username;
    private String nickname;
    private Timestamp createTime;
}
