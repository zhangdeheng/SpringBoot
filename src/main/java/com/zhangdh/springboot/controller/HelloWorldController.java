package com.zhangdh.springboot.controller;

import com.zhangdh.springboot.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangdeheng
 * @date 2018/9/28 22:55
 */
//RestController 默认返回json 格式
@RestController
public class HelloWorldController {
    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setUserName("zhangdh");
        user.setEmail("1600976604@qq.com");
        return user;
    }
}
