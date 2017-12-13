package com.efo.s.spring.cache.example.entities;

/**
 * 2017/12/7
 * Created by JackLee.
 */
public class JudgeResponse {

    private String message;
    private int code;
    private boolean exist;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }
}
