package com.zhangdh.springboot.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhangdeheng
 * @date 2018/9/29 23:31
 */
@Component
public class Scheduler2Task {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//  参数说明
//  @Scheduled 参数可以接受两种定时的设置，一种是我们常用的cron="*/6 * * * * ?",一种是 fixedRate = 6000，两种都表示每隔六秒打印一下内容。
//  fixedRate 说明
//  @Scheduled(fixedRate = 6000) 上一次开始执行时间点之后6秒再执行
//  @Scheduled(fixedDelay = 6000) 上一次执行完毕时间点之后6秒再执行
//  @Scheduled(initialDelay=1000, fixedRate=6000) 第一次延迟1秒后执行，之后按fixedRate的规则每6秒执行一次
    @Scheduled(fixedRate = 6000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }
}
