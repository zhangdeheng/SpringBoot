package com.zhangdh.springboot.repositories.jpa;

import com.zhangdh.springboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhangdeheng
 * @date 2018/9/28 23:40
 * jpa 使用参照
 * http://www.ityouknow.com/springboot/2016/08/20/spring-boo-jpa.html
 */
public interface UserRepository extends JpaRepository<User,Long>{
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
    //分页方法
//    Page<User> findALL(Pageable pageable);
//    Page<User> findByUserName(String userName, Pageable pageable);

    @Modifying
    @Query("update User u set u.userName = ?1 where u.id = ?2")
    int modifyByIdAndUserId(String  userName, Long id);

    @Transactional
    @Modifying
    @Query("delete from User where id = ?1")
    void deleteByUserId(Long id);
    //对事物的支持，查询超时的设置等
//    @Transactional(timeout = 10)
//    @Query("select u from User u where u.emailAddress = ?1")
//    User findByEmailAddress(String emailAddress);
}
