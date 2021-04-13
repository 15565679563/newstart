package com.wlu.newstart.service;

import com.wlu.newstart.entity.UserEntity;

/**
 * 用户接口类
 *
 * @author: wlu
 * @created: 2021/04/13 10:59
 */
public interface UserService {

    /**
     * 新建用户
     * @param userName
     * @param loginId
     * @param password
     * @param tel
     */
    public void addUser(String userName,String loginId,String password,int tel);
}
