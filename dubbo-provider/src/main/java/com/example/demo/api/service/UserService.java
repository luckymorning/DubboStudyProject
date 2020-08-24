package com.example.demo.api.service;

/**
 * UserService
 *
 * @author lucky_morning
 * @group com.example.demo.api.service
 * @date 2020/8/21 15:14
 */
public interface UserService {
    /**
     * 通过id获取名称
     *
     * @param userId 用户id
     * @return 用户名称
     * @author lucky_morning
     */
    String getNameById(Long userId);
}
