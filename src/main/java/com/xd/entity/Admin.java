package com.xd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by XD on 2016/1/9.
 */
@Entity
@Table
public class Admin extends BasicEntity{
    @Column
    private String adminName;
    @Column
    private String password;

    public Admin() {
    }

    public Admin(String password, String adminName) {
        this.password = password;
        this.adminName = adminName;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
