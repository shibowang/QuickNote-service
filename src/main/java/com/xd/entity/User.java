package com.xd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by XD on 2016/1/9.
 */
@Entity
@Table
public class User extends BasicEntity {
    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String imgUrl;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
