package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Repairchart {
    private String idRepairChart;
    private String equipNo;
    private String equipName;
    private String description;
    private String reason;
    private Double fee;
    private Timestamp repairTime;

    @Id
    @Column(name = "idRepairChart")
    public String getIdRepairChart() {
        return idRepairChart;
    }

    public void setIdRepairChart(String idRepairChart) {
        this.idRepairChart = idRepairChart;
    }

    @Basic
    @Column(name = "EquipNo")
    public String getEquipNo() {
        return equipNo;
    }

    public void setEquipNo(String equipNo) {
        this.equipNo = equipNo;
    }

    @Basic
    @Column(name = "EquipName")
    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "Reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "Fee")
    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    @Basic
    @Column(name = "repairTime")
    public Timestamp getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(Timestamp repairTime) {
        this.repairTime = repairTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repairchart that = (Repairchart) o;
        return Objects.equals(idRepairChart, that.idRepairChart) &&
                Objects.equals(equipNo, that.equipNo) &&
                Objects.equals(equipName, that.equipName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(fee, that.fee) &&
                Objects.equals(repairTime, that.repairTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idRepairChart, equipNo, equipName, description, reason, fee, repairTime);
    }
}
