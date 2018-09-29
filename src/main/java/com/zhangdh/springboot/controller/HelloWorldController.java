package com.zhangdh.springboot.controller;

import com.zhangdh.springboot.dao.UserRepository;
import com.zhangdh.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangdeheng
 * @date 2018/9/28 22:55
 */
//RestController 默认返回json 格式
@RestController
public class HelloWorldController {

    @Autowired
    private UserRepository userRepository;
    @RequestMapping("/getUser")
    //自动根据方法生成缓存
    @Cacheable(value="user-key")
    public User getUser() {
//        User user=new User();
//        user.setUserName("zhangdh");
//        user.setEmail("1600976604@qq.com");
        User user=userRepository.findByUserName("aa");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }
}
