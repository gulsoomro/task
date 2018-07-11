package com.infosecurity.task.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tor_ips", schema = "teyetor_ips")
public class TorIpsEntity {
    private int id;
    private String ip;
    private String lastSeen;
    private String firstSeen;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ip", nullable = false, length = 15)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "last_seen", nullable = false, length = 30)
    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    @Basic
    @Column(name = "first_seen", nullable = false, length = 30)
    public String getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(String firstSeen) {
        this.firstSeen = firstSeen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TorIpsEntity that = (TorIpsEntity) o;
        return id == that.id &&
                Objects.equals(ip, that.ip) &&
                Objects.equals(lastSeen, that.lastSeen) &&
                Objects.equals(firstSeen, that.firstSeen);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, ip, lastSeen, firstSeen);
    }
}
