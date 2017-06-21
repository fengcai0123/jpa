package com.core.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
@Table(name = "sell")
@Entity()
public class Sell {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int sellId;
    @Column(name = "date")
    private Date date;

    @Column(name="sell_num")
    private int sellNum;

    @JoinColumn(name="good_id")
    @ManyToOne(fetch=FetchType.LAZY)
    private Good good;

    public int getSellId() {
        return sellId;
    }

    public void setSellId(int sellId) {
        this.sellId = sellId;
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

    public int getSellNum() {
        return sellNum;
    }

    public void setSellNum(int sellNum) {
        this.sellNum = sellNum;
    }
}
