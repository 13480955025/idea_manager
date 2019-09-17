package com.jbit.Controller;

import com.jbit.pojo.Users;
import com.jbit.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Auther: 作者
 * @Date: 日期 2019/9/6
 * @Description: 描述 com.jbit.Controller
 * @version：1.0
 */
@Controller
public class PageController {
    @Resource
    private UsersService us;
    //进入主页
    @RequestMapping("/index.html")
    public String lod(){
        return "index";
    }
    //新增
    @RequestMapping("/addUser")
    public String getadd(Users users){
        int a=us.getAddUser(users);
        System.out.println(a);
        return "cg";
    }
}
