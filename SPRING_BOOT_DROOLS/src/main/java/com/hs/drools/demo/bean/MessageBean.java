package com.hs.drools.demo.bean;

public class MessageBean {

    public static final Integer HELLO = 0;
    public static final Integer GOODBYE = 1;

    private String message;

    private Integer status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
