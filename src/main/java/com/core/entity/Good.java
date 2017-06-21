package com.core.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
@Table(name = "good")
@Entity
public class Good {
    @Id
    @GeneratedValue
    @Column(name = "good_id",nullable = false,unique = true)
    private int goodId;

   /* private int sellId;
    private int priceId;
    private int inventityId;
    private int categoryId;
    private int rankId;
    private int commentId;*/

    @Column(nullable = true)
    private String asin;
    @Column(nullable = true)
    private String name;
    @Column(nullable = true)
    private String brank;
    @Column(nullable = true)
    private String sellerName;
    @Column(nullable = true)
    private String size;
    @Column(nullable = true,name = "weight_1")
    private float weight;
    @Column(nullable = true,name = "weight_2")
    private float transportWeight;
    @Column(nullable = true)
    private int rankNum;
    @Column(nullable = true)
    private int totalSellNum;
    @Column(nullable = true,name = "sale_time")
    private Date saleTime;

    @Column(nullable = true)
    private String disPatching;
    @Column(nullable = true)
    private String imgUrl;

    @Column(nullable = true,name = "asin_status")
    private int asinStatus;
    @Column(nullable = true,name = "update_time")
    private Date updateTime;
    @Column(nullable = true,name = "color")
    private String color;

    @Column(nullable = true,name = "answer_num")
    private int  answerNum;

    @OneToMany(mappedBy="good",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<Price> priceSet=new HashSet<Price>();

    public Set<Price> getPriceSet() {
        return priceSet;
    }

    public void setPriceSet(Set<Price> priceSet) {
        this.priceSet = priceSet;
    }

    @Column(nullable = true,name = "standard")
    private String standard;

    public float getTransportWeight() {
        return transportWeight;
    }

    public void setTransportWeight(float transportWeight) {
        this.transportWeight = transportWeight;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrank() {
        return brank;
    }

    public void setBrank(String brank) {
        this.brank = brank;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getRankNum() {
        return rankNum;
    }

    public void setRankNum(int rankNum) {
        this.rankNum = rankNum;
    }

    public int getTotalSellNum() {
        return totalSellNum;
    }

    public void setTotalSellNum(int totalSellNum) {
        this.totalSellNum = totalSellNum;
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public String getDisPatching() {
        return disPatching;
    }

    public void setDisPatching(String disPatching) {
        this.disPatching = disPatching;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getAsinStatus() {
        return asinStatus;
    }

    public void setAsinStatus(int asinStatus) {
        this.asinStatus = asinStatus;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnswerNum() {
        return answerNum;
    }

    public void setAnswerNum(int answerNum) {
        this.answerNum = answerNum;
    }
}
