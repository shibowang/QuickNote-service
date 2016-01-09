package com.xd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by XD on 2016/1/9.
 */
@Entity
@Table
public class Diary extends BasicEntity{
    @Column
    private Long Date;
    @Column
    private String location;
    @Column String weather;

    /**
     * 1 为星标记  0 为未标记
     */
    @Column
    private int star;



}
