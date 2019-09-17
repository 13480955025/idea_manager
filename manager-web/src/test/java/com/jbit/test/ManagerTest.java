package com.jbit.test;

import com.jbit.mapper.UsersMapper;
import com.jbit.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: 作者
 * @Date: 日期 2019/9/6
 * @Description: 描述 com.jbit.test
 * @version：1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper um;
    @Test
    public void getinse(){
        Users users=new Users();
        users.setUsername("赖超");
        users.setUserage(20);
       int a= um.getInsert(users);
        System.out.println(a);
    }
}
