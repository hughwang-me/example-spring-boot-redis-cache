package com.uwjx.examplespringbootrediscache.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.uwjx.examplespringbootrediscache.entity.UserEntity;

@Mapper
public interface UserMapper {
    int insert(@Param("userEntity") UserEntity userEntity);

    List<UserEntity> list();

}
