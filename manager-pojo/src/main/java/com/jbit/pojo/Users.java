package com.jbit.pojo;

/**
 * @Auther: 作者
 * @Date: 日期 2019/9/4
 * @Description: 描述 com.jbit.pojo
 * @version：1.0
 */
public class Users {
    private int userid;
    private String username;
    private int userage;
    /**
     * 功能描述：
     * @param:
     * @return:
     * @auther:
     * @date；
     */
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserage() {
        return userage;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }
}
