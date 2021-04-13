package com.wlu.newstart.dao;

import com.wlu.newstart.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户信息数据操作Dao类
 *
 * @author: wlu
 * @created: 2021/04/13 11:24
 */
@Mapper
public interface UserDao {

    /**
     * 添加用户信息
     * @param userEntity
     */
    public void addUser(UserEntity userEntity);

}
