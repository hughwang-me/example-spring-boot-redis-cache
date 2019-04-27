package com.uwjx.examplespringbootrediscache.service;

import java.util.List;
import com.uwjx.examplespringbootrediscache.entity.UserEntity;
public interface UserService {

    boolean insert(UserEntity userEntity);

    List<UserEntity> list();
}
