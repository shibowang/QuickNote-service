package com.xd.entity;

import javax.persistence.Column;

/**
 * Created by XD on 2016/1/9.
 * 日记标签
 */
public class Tag extends BasicEntity{
    @Column
    private String tagname;

    public Tag() {
    }

    public Tag(String tagname) {
        this.tagname = tagname;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }
}
