package com.efo.s.spring.cache.example.entities;

/**
 * 2017/12/7
 * Created by JackLee.
 */
public class RealTimeMessage {

    private String msgtime;
    private String msgkind;


    public String getMsgtime() {
        return msgtime;
    }

    public void setMsgtime(String msgtime) {
        this.msgtime = msgtime;
    }

    public String getMsgkind() {
        return msgkind;
    }

    public void setMsgkind(String msgkind) {
        this.msgkind = msgkind;
    }


    public RealTimeMessage(){

    }

    public RealTimeMessage(String msgtime, String msgkind) {
        this.msgtime = msgtime;
        this.msgkind = msgkind;
    }
}
