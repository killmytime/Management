package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Outdoor {
    private String idOutDoor;
    private String name;
    private Timestamp lastTime;
    private Integer repairNum;
    private Double totalFee;

    @Id
    @Column(name = "idOutDoor")
    public String getIdOutDoor() {
        return idOutDoor;
    }

    public void setIdOutDoor(String idOutDoor) {
        this.idOutDoor = idOutDoor;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "LastTime")
    public Timestamp getLastTime() {
        return lastTime;
    }

    public void setLastTime(Timestamp lastTime) {
        this.lastTime = lastTime;
    }

    @Basic
    @Column(name = "RepairNum")
    public Integer getRepairNum() {
        return repairNum;
    }

    public void setRepairNum(Integer repairNum) {
        this.repairNum = repairNum;
    }

    @Basic
    @Column(name = "TotalFee")
    public Double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Double totalFee) {
        this.totalFee = totalFee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Outdoor outdoor = (Outdoor) o;
        return Objects.equals(idOutDoor, outdoor.idOutDoor) &&
                Objects.equals(name, outdoor.name) &&
                Objects.equals(lastTime, outdoor.lastTime) &&
                Objects.equals(repairNum, outdoor.repairNum) &&
                Objects.equals(totalFee, outdoor.totalFee);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idOutDoor, name, lastTime, repairNum, totalFee);
    }
}
