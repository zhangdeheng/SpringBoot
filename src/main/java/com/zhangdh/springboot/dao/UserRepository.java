package com.zhangdh.springboot.dao;

import com.zhangdh.springboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhangdeheng
 * @date 2018/9/28 23:40
 */
public interface UserRepository extends JpaRepository<User,Long>{
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}
