package com.example.demo.manage.controller;

import com.example.demo.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 *
 * @author lucky_morning
 * @group com.example.demo.manage.controller
 * @date 2020/8/24 10:02
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;


    @RequestMapping("/getUserNameById")
    public String getUserNameById(@RequestParam Long id){
        return userService.getNameById(id);
    }
}
