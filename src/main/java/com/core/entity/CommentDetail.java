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
@Table(name = "comment_detail")
@Entity
public class CommentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  int commentDetailId;
    @Column(name = "add_time")
    private Date addTime;
    @Column(name = "date_comment_num")
    private int dateCommentNum;
    @Column(name = "start_num")
    private int starNum;
    @Column(name = "isVp")
    private boolean isVp;
    @JoinColumn(name = "comment_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Comment Comment;

    public int getCommentDetailId() {
        return commentDetailId;
    }

    public void setCommentDetailId(int commentDetailId) {
        this.commentDetailId = commentDetailId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public int getDateCommentNum() {
        return dateCommentNum;
    }

    public void setDateCommentNum(int dateCommentNum) {
        this.dateCommentNum = dateCommentNum;
    }

    public int getStarNum() {
        return starNum;
    }

    public void setStarNum(int starNum) {
        this.starNum = starNum;
    }

    public boolean isVp() {
        return isVp;
    }

    public void setVp(boolean vp) {
        isVp = vp;
    }


    public com.core.entity.Comment getComment() {
        return Comment;
    }

    public void setComment(com.core.entity.Comment comment) {
        Comment = comment;
    }
}

