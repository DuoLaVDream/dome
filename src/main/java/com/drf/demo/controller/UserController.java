package com.drf.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Damon
 * @since 2020-01-25
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/test")
    public HashMap<String,Object> test1(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("1", "测试实施");
        return map;
    }

}

