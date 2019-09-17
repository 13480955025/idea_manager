package com.jbit.service.impl;

import com.jbit.mapper.UsersMapper;
import com.jbit.pojo.Users;
import com.jbit.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: 作者
 * @Date: 日期 2019/9/6
 * @Description: 描述 com.jbit.service.impl
 * @version：1.0
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersMapper usersMapper;

    public int getAddUser(Users users) {
        int a= usersMapper.getInsert(users);
        return a;
    }
}
