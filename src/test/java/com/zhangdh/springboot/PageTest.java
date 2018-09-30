package com.zhangdh.springboot;

import com.zhangdh.springboot.repositories.jpa.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhangdeheng
 * @date 2018/9/29 22:56
 * 分页测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PageTest {

    @Autowired
    UserRepository userRepository;
    @Test
    public void testPageQuery() throws Exception {
        int page=1,size=10;
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable =PageRequest.of(page, size, Sort.by(Sort.Direction.ASC,"id"));
//        userRepository.findALL(pageable);
//        userRepository.findByUserName("testName", pageable);
    }
}
