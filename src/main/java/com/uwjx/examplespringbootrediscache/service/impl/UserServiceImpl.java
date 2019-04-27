package com.uwjx.examplespringbootrediscache.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.uwjx.examplespringbootrediscache.entity.UserEntity;
import com.uwjx.examplespringbootrediscache.mapper.UserMapper;
import com.uwjx.examplespringbootrediscache.service.UserService;

@Service
@Slf4j
@CacheConfig(cacheNames = "user")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    @CacheEvict(key = "#id")
    public boolean insert(UserEntity userEntity){
        log.warn("插入 insert");
        int result = userMapper.insert(userEntity);
        return true;
    }

    @Override
    @Cacheable(key = "#id")
    public List<UserEntity> list() {
        log.warn("查询 list");
        return userMapper.list();
    }

}
