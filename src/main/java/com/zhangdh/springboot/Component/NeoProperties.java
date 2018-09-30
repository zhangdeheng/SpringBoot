package com.zhangdh.springboot.Component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zhangdeheng
 * @date 2018/9/28 23:26
 */
@Component
public class NeoProperties {
    @Value("${com.zhangdh.title}")
    private String title;
    @Value("${com.zhangdh.description}")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
