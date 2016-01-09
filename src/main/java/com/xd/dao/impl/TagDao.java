package com.xd.dao.impl;

import com.xd.dao.ITagDao;
import com.xd.entity.Tag;

/**
 * Created by XD on 2016/1/9.
 */
public class TagDao extends BasicDao<Tag> implements ITagDao{
    @Override
    public Class classOfT() {
        return Tag.class;
    }
}
