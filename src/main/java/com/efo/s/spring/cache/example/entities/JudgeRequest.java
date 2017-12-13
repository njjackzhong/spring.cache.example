package com.efo.s.spring.cache.example.entities;

/**
 * 2017/12/7
 * Created by JackLee.
 */
public class JudgeRequest {

    private RealTimeMessage message;

    private String where;

    public RealTimeMessage getMessage() {
        return message;
    }

    public void setMessage(RealTimeMessage message) {
        this.message = message;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public JudgeRequest(){

    }

    public JudgeRequest(RealTimeMessage message, String where) {
        this.message = message;
        this.where = where;
    }
}
