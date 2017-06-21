package com.core.entity;

import javax.persistence.*;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * Created by yonghuo.chen on 17/6/16.
 */
@Table(name = "rank")
@Entity
public class Rank {
    @Id
    @GeneratedValue()
    @Column(name = "id")
    private int rankId;
    @Column(name = "date")
    private Date date;
    @Column(name = "parent_id")
    private int parentId;

    @JoinColumn(name = "good_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Good good;

    public int getRankId() {
        return rankId;
    }

    public void setRankId(int rankId) {
        this.rankId = rankId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }


    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }
}
