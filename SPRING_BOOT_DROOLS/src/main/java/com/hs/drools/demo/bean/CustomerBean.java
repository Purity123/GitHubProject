package com.hs.drools.demo.bean;

import com.hs.drools.demo.base.BaseBean;

import java.sql.Date;

public class CustomerBean extends BaseBean {

    private static final long serialVersionUID = -6555167015680808301L;

    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户渠道
     */
    private String userOrgId;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 用户等级
     */
    private Integer lev;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtUpdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserOrgId() {
        return userOrgId;
    }

    public void setUserOrgId(String userOrgId) {
        this.userOrgId = userOrgId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    @Override
    public String toString() {
        return "CustomerBean{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userOrgId='" + userOrgId + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", lev=" + lev +
                ", gmtCreate=" + gmtCreate +
                ", gmtUpdate=" + gmtUpdate +
                '}';
    }

}
