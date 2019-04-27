package com.uwjx.examplespringbootrediscache.controller;

import com.uwjx.commons.utils.ResponseUtils;
import com.uwjx.commons.vo.DataVO;
import com.uwjx.examplespringbootrediscache.entity.UserEntity;
import com.uwjx.examplespringbootrediscache.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Resource
    UserService userService;

    @PostMapping(value = "add")
    public DataVO add(@RequestBody UserEntity userEntity){
        boolean result = userService.insert(userEntity);
        return ResponseUtils.success(result);
    }

    @PostMapping(value = "list")
    public DataVO list( ){
        List<UserEntity> result = userService.list();
        return ResponseUtils.success(result);
    }

}
