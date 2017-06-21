package com.core.entity;

import javax.persistence.*;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
@Table(name = "category")
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int categoryId;
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "parent_id")
    private int parentId;
    @JoinColumn(name = "good_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Good good;

    public int getCategoryId() {
        return categoryId;
    }


    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
