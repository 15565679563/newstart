package com.wlu.newstart.service.impl;

import com.wlu.newstart.dao.UserDao;
import com.wlu.newstart.entity.UserEntity;
import com.wlu.newstart.service.UserService;
import com.wlu.newstart.utils.GlobalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户接口实现类
 *
 * @author: wlu
 * @created: 2021/04/13 11:00
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    /**
     * 新增用户
     * @param userName
     * @param loginId
     * @param password
     * @param tel
     */
    @Override
    public void addUser(String userName, String loginId, String password, int tel) {

        UserEntity userEntity = new UserEntity();
        userEntity.setId(GlobalUtil.getId());
        userEntity.setUserName(userName);
        userEntity.setLoginId(loginId);
        userEntity.setPassword(password);
        userEntity.setTel(tel);
        userDao.addUser(userEntity);
    }
}
