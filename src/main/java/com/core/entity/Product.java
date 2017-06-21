package com.core.entity;

/**
 * Created by yonghuo.chen on 17/6/15.
 */
public class Product {
    private int adNum;
    private int bestNum;
    private String asin;
    private String titleStr;
    private String sellerName;
    private String price;
    private String customerReviews;

    public Product(int adNum, int bestNum, String asin, String titleStr, String sellerName, String price, String customerReviews) {
        this.adNum = adNum;
        this.bestNum = bestNum;
        this.asin = asin;
        this.titleStr = titleStr;
        this.sellerName = sellerName;
        this.price = price;
        this.customerReviews = customerReviews;
    }

    public Product() {

    }

    public int getAdNum() {
        return adNum;
    }

    public void setAdNum(int adNum) {
        this.adNum = adNum;
    }

    public int getBestNum() {
        return bestNum;
    }

    public void setBestNum(int bestNum) {
        this.bestNum = bestNum;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getTitleStr() {
        return titleStr;
    }

    public void setTitleStr(String titleStr) {
        this.titleStr = titleStr;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCustomerReviews() {
        return customerReviews;
    }

    public void setCustomerReviews(String customerReviews) {
        this.customerReviews = customerReviews;
    }

    @Override
    public String toString() {
        return "Product{" +
            "adNum=" + adNum +
            ", bestNum=" + bestNum +
            ", asin='" + asin + '\'' +
            ", titleStr='" + titleStr + '\'' +
            ", sellerName='" + sellerName + '\'' +
            ", price='" + price + '\'' +
            ", customerReviews='" + customerReviews + '\'' +
            '}';
    }
}
