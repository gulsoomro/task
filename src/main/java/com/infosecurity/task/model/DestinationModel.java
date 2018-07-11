package com.infosecurity.task.model;

import java.io.Serializable;

public class DestinationModel implements Serializable {

    private String sensorName;
    private String ip;

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "DestinationModel{" +
                "sensorName='" + sensorName + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
