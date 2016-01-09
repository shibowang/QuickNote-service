package com.xd.entity;

import javax.persistence.Column;

/**
 * Created by XD on 2016/1/9.
 * 手机端登陆认证
 */
public class Token extends BasicEntity{
    @Column
    private long user_id;
    @Column
    private String token;
    @Column
    private String device_id;

    public Token() {
    }

    public Token(long user_id, String token, String device_id) {
        this.user_id = user_id;
        this.token = token;
        this.device_id = device_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }
}
