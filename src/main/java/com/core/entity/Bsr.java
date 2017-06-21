package com.core.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
@Table(name = "bsr")
@Entity
public class Bsr {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  int bsrId;
    @Column(name = "date")
    private Date date;
    @Column(name = "bsr_num")
    private int bsrNum;

    @JoinColumn(name="good_id")
    @ManyToOne(fetch=FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    private Good good;


    public int getBsrNum() {
        return bsrNum;
    }

    public void setBsrNum(int bsrNum) {
        this.bsrNum = bsrNum;
    }

    public int getBsrId() {
        return bsrId;
    }

    public void setBsrId(int bsrId) {
        this.bsrId = bsrId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }
}
