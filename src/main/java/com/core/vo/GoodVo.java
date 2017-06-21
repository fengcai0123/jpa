package com.core.vo;
import java.util.Date;
public class GoodVo{

    private int goodId;

   /* private int sellId;
    private int priceId;
    private int inventityId;
    private int categoryId;
    private int rankId;
    private int commentId;*/

    private String asin;
    private String name;
    private String brank;
    private String sellerName;
    private String size;
    private float weight;
    private int rankNum;
    private int totalSellNum;
    private Date addTime;
    private String disPatching;
    private String imgUrl;

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

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
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
}
