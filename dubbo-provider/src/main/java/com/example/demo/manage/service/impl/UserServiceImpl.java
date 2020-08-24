package com.example.demo.manage.service.impl;

import com.example.demo.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * UserServiceImpl
 *
 * @author lucky_morning
 * @group com.example.demo.manage.service.impl
 * @date 2020/8/21 15:17
 */
@DubboService
@Service
public class UserServiceImpl implements UserService {
    @Value("${spring.application.name}")
    private String serviceName;

    @Override
    public String getNameById(Long userId) {
        return serviceName + ":" + Optional.ofNullable(userId).orElse(-1L).toString();
    }
}
