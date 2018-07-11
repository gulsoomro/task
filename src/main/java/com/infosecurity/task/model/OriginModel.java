package com.infosecurity.task.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class OriginModel implements Serializable {


    private String ip;
    private boolean internal;
    private TorModel tor;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public boolean isInternal() {
        return internal;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public TorModel getTor() {
        return tor;
    }

    public void setTor(TorModel tor) {
        this.tor = tor;
    }

    @Override
    public String toString() {
        return "OriginModel{" +
                "ip='" + ip + '\'' +
                ", internal=" + internal +
                ", tor=" + tor +
                '}';
    }
}
