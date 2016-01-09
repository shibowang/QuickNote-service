package com.xd.dao.impl;

import com.xd.dao.IAdminDao;
import com.xd.entity.Admin;

/**
 * Created by XD on 2016/1/9.
 */
public class AdminDao extends BasicDao<Admin> implements IAdminDao {
    @Override
    public Class classOfT() {
        return Admin.class;
    }
}
