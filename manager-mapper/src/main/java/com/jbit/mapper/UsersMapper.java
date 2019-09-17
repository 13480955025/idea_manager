package com.jbit.mapper;

import com.jbit.pojo.Users;

import java.util.List;

/**
 * @Auther: 作者
 * @Date: 日期 2019/9/4
 * @Description: 描述 com.jbit.mapper
 * @version：1.0
 */
public interface UsersMapper {
    /**
     * 功能描述：新增
     * @param: users
     * @return: int
     * @auther:
     * @date；
     */
    int getInsert(Users users);

    /**
     * 功能描述：查询
     * @param:
     * @return:
     * @auther:
     * @date；
     */
    List<Users> getselect();
}
