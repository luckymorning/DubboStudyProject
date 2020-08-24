package com.example.demo.manage.controller;

import com.example.demo.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author lucky_morning
 * @group com.example.demo.manage.controller
 * @date 2020/8/21 15:59
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @DubboReference
    private UserService userService;

    /**
     * 测试消费
     *
     * @param userId 用户id
     * @return 用户姓名
     */
    @GetMapping("/testConsumer")
    public String testConsumer(@RequestParam Long userId) {
        return userService.getNameById(userId);
    }
}
