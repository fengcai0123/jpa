package com.core.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
@Table(name = "inventory")
@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  int inventoryId;
    @Column(name = "date")
    private Date date;
    @Column(name = "inventory_num")
    private int inventoryNum;

    @JoinColumn(name="good_id")
    @ManyToOne(fetch=FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    private Good good;

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getInventoryNum() {
        return inventoryNum;
    }

    public void setInventoryNum(int inventoryNum) {
        this.inventoryNum = inventoryNum;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }
}
