package com.angle.service;

import com.angle.entity.User;

/**
 * [来个全套]
 *
 * @slogan: 高于生活，源于生活
 * @Description: TODO
 * @author: smlz
 * @date 2020/7/28 16:45
 */
public class UserServiceImpl {

    public void insertUser(User user) {

        System.out.println("模拟执行insertUser操作");

        if(null != user) {
            throw new IllegalArgumentException("参数为空");
        }
    }
}
