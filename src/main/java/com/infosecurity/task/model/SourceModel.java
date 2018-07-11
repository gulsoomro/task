package com.infosecurity.task.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SourceModel implements Serializable {


    private String dateTime;
    private int srcPort;
    private String service;
    private int dstPort;
    private String protocol;
    private double severityScore;
    private String category;
    private String tool;
    private String endTime;
    private OriginModel origin;
    private DestinationModel destination;
    private List<Auth> authList;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(int srcPort) {
        this.srcPort = srcPort;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getDstPort() {
        return dstPort;
    }

    public void setDstPort(int dstPort) {
        this.dstPort = dstPort;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public double getSeverityScore() {
        return severityScore;
    }

    public void setSeverityScore(double severityScore) {
        this.severityScore = severityScore;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public OriginModel getOrigin() {
        return origin;
    }

    public void setOrigin(OriginModel origin) {
        this.origin = origin;
    }

    public DestinationModel getDestination() {
        return destination;
    }

    public void setDestination(DestinationModel destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "SourceModel{" +
                "dateTime='" + dateTime + '\'' +
                ", srcPort=" + srcPort +
                ", service='" + service + '\'' +
                ", dstPort=" + dstPort +
                ", protocol='" + protocol + '\'' +
                ", severityScore=" + severityScore +
                ", category='" + category + '\'' +
                ", tool='" + tool + '\'' +
                ", endTime='" + endTime + '\'' +
                ", origin=" + origin +
                ", destination=" + destination +
                '}';
    }
}
