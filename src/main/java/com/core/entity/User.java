package com.core.entity;
import org.springframework.context.annotation.Lazy;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "ecs_users")
@Entity

public class User implements Serializable {

    private static final long serialVersionUID = -1227951848403032089L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true, nullable = false)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "user_name")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "real_name")
    private String realName;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "source")
    private String source;

    @Column(name = "sex")
    private Integer gender;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "address_id")
    private Long addressId;

    @Column(name = "reg_time")
    private Date regTime;

    @Column(name = "last_login")
    private Date lastLogin;

    @Column(name = "last_time")
    private Date lastTime;

    @Column(name = "last_ip")
    private String lastIp;

    @Column(name = "salt")
    private String salt;

    @Column(name = "qq")
    private String qq;

    @Column(name = "mobile_phone")
    private String mobile;

    @Column(name="is_validated")
    private String isValidated;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "channel")
    private String channel;

    @Column(name = "recommend_partner")
    private String recommendPartner;

    @Column(name = "plate_number")
    private String plateNumber;

    @Column(name = "reg_ip")
    private String regIp;

    @Column(name = "allinpay_id")
    private String allinpayId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRecommendPartner() {
        return recommendPartner;
    }

    public void setRecommendPartner(String recommendPartner) {
        this.recommendPartner = recommendPartner;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    public String getAllinpayId() {
        return allinpayId;
    }

    public void setAllinpayId(String allinpayId) {
        this.allinpayId = allinpayId;
    }
}
