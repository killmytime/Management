package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Indoor {
    private String idInDoor;
    private String name;
    private Timestamp lastTime;
    private Integer repairNum;
    private Double totalFee;

    @Id
    @Column(name = "idInDoor")
    public String getIdInDoor() {
        return idInDoor;
    }

    public void setIdInDoor(String idInDoor) {
        this.idInDoor = idInDoor;
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
        Indoor indoor = (Indoor) o;
        return Objects.equals(idInDoor, indoor.idInDoor) &&
                Objects.equals(name, indoor.name) &&
                Objects.equals(lastTime, indoor.lastTime) &&
                Objects.equals(repairNum, indoor.repairNum) &&
                Objects.equals(totalFee, indoor.totalFee);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idInDoor, name, lastTime, repairNum, totalFee);
    }
}
