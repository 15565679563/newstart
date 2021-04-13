package com.wlu.newstart.entity;

/**
 * 用户实体类
 *
 * @author: wlu
 * @created: 2021/04/13 11:01
 */
public class UserEntity {

    /**
     * 用户Id，使用分布式Id
     */
    private long id;

    /**
     * 用户姓名，用户名
     */
    private String userName;

    /**
     * 登录用户名
     */
    private String loginId;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 电话号码
     */
    private int tel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
