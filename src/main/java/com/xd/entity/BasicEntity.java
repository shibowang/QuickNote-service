package com.xd.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by XD on 2016/1/9.
 */
public class BasicEntity implements Serializable{
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(name = "isDelete")
    protected boolean isDeleted;

    @Column(name = "created_time")
    protected long created_time;

    @Column(name = "modify_time")
    protected long modify_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public long getCreated_time() {
        return created_time;
    }

    public void setCreated_time(long created_time) {
        this.created_time = created_time;
    }

    public long getModify_time() {
        return modify_time;
    }

    public void setModify_time(long modify_time) {
        this.modify_time = modify_time;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || !this.getClass().equals(o.getClass()))
            return false;

        return this.id == ((BasicEntity) o).getId();
    }

    @Override
    public int hashCode() {
        int hash = 17;

        Long ID = this.id;

        hash = hash * 31 + ID.hashCode();

        return (hash);
    }
}
