package com.core.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yonghuo.chen on 17/6/16.
 */
@Table(name = "comment")
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  int inventoryId;
    @Column(name = "date")
    private Date date;

    @Column(name = "comment_score")
    private float commentScore;

    @Column(name = "total_comment_num")
    private int totalCommentNum;

    @Column(name = "five_star")
    private String fiveStar;

    @Column(name = "four_star")
    private String fourStar;

    @Column(name = "three_star")
    private String threeStar;

    @Column(name = "two_star")
    private String twoStar;

    @Column(name = "one_star")
    private String oneStar;

    @JoinColumn(name = "good_id")
    @ManyToOne(fetch = FetchType.LAZY)
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

    public int getTotalCommentNum() {
        return totalCommentNum;
    }

    public void setTotalCommentNum(int totalCommentNum) {
        this.totalCommentNum = totalCommentNum;
    }


    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public float getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(float commentScore) {
        this.commentScore = commentScore;
    }

    public String getFiveStar() {
        return fiveStar;
    }

    public void setFiveStar(String fiveStar) {
        this.fiveStar = fiveStar;
    }

    public String getFourStar() {
        return fourStar;
    }

    public void setFourStar(String fourStar) {
        this.fourStar = fourStar;
    }

    public String getThreeStar() {
        return threeStar;
    }

    public void setThreeStar(String threeStar) {
        this.threeStar = threeStar;
    }

    public String getTwoStar() {
        return twoStar;
    }

    public void setTwoStar(String twoStar) {
        this.twoStar = twoStar;
    }

    public String getOneStar() {
        return oneStar;
    }

    public void setOneStar(String oneStar) {
        this.oneStar = oneStar;
    }
}
