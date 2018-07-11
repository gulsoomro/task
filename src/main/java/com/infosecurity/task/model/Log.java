package com.infosecurity.task.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Log implements Serializable {
    private String index;
    private String type;
    private SourceModel source;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SourceModel getSource() {
        return source;
    }

    public void setSource(SourceModel source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Log{" +
                "index='" + index + '\'' +
                ", type='" + type + '\'' +
                ", source=" + source +
                '}';
    }
}
