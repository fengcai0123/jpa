package com.core.entity;

/**
 * Created by yonghuo.chen on 17/6/14.
 */

public class DataIndex {
    private String asin;
    private String title;
    private String customerReviews;

    public DataIndex(String asin, String title, String customerReviews) {
        this.asin = asin;
        this.title = title;
        this.customerReviews = customerReviews;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCustomerReviews() {
        return customerReviews;
    }

    public void setCustomerReviews(String customerReviews) {
        this.customerReviews = customerReviews;
    }

    @Override
    public String toString() {
        return "DataIndex{" +
            "asin='" + asin + '\'' +
            ", title='" + title + '\'' +
            ", customerReviews='" + customerReviews + '\'' +
            '}';
    }
}
