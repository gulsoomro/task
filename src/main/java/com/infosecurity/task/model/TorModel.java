package com.infosecurity.task.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class TorModel implements Serializable {

    private boolean tor;

    public boolean isTor() {
        return tor;
    }

    public void setTor(boolean tor) {
        this.tor = tor;
    }

    @Override
    public String toString() {
        return "TorModel{" +
                "tor=" + tor +
                '}';
    }
}
