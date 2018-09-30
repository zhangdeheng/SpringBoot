package com.zhangdh.springboot.Component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zhangdh@csdn.net
 * @date 2018/09/30 11:46
 * @desc 用于项目启动初始化资源操作
 **/
@Component
@Order(2)
public class SecondRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("The SecondRunner start to initialize ...");
    }
}
