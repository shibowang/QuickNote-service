package com.xd.dao.impl;

import com.xd.dao.IDiaryDao;
import com.xd.entity.Diary;

/**
 * Created by XD on 2016/1/9.
 */
public class DiaryDao extends BasicDao<Diary> implements IDiaryDao {
    @Override
    public Class classOfT() {
        return Diary.class;
    }
}
