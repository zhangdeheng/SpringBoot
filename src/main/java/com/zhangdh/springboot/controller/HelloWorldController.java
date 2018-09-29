package com.zhangdh.springboot.controller;

import com.zhangdh.springboot.repositories.jpa.UserRepository;
import com.zhangdh.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * @author zhangdeheng
 * @date 2018/9/28 22:55
 */
//RestController 默认返回json 格式
@RestController
public class HelloWorldController {

    @Autowired
    private UserRepository userRepository;

    /**
     * 自动根据方法生成缓存
     * @return
     */
    @RequestMapping("/getUser")
    @Cacheable(value="user-key")
    public User getUser() {
//        User user=new User();
//        user.setUserName("zhangdh");
//        user.setEmail("1600976604@qq.com");
        User user=userRepository.findByUserName("aa");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }

    /**
     * 共享Session-spring-session-data-redis
     * @param session
     * @return
     */
    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
}
