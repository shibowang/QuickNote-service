package com.xd.dao.impl;

import com.xd.dao.IUserDao;
import com.xd.entity.User;

/**
 * Created by XD on 2016/1/9.
 */
public class UserDao extends BasicDao<User> implements IUserDao {
    @Override
    public Class classOfT() {
        return User.class;
    }
}
