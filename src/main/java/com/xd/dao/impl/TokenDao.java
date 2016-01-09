package com.xd.dao.impl;

import com.xd.dao.ITokenDao;
import com.xd.entity.Token;

/**
 * Created by XD on 2016/1/9.
 */
public class TokenDao extends BasicDao<Token> implements ITokenDao {
    @Override
    public Class classOfT() {
        return Token.class;
    }
}
