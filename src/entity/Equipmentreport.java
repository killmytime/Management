package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Equipmentreport {
    private String idEquipmentReport;
    private String buildingNo;
    private String roomNo;
    private Timestamp time;
    private String equipName;
    private String equipNo;
    private String details;
    private String userName;
    private Integer phoneNum;

    @Id
    @Column(name = "idEquipmentReport")
    public String getIdEquipmentReport() {
        return idEquipmentReport;
    }

    public void setIdEquipmentReport(String idEquipmentReport) {
        this.idEquipmentReport = idEquipmentReport;
    }

    @Basic
    @Column(name = "BuildingNo")
    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    @Basic
    @Column(name = "RoomNo")
    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    @Basic
    @Column(name = "Time")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
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
    @Column(name = "EquipNo")
    public String getEquipNo() {
        return equipNo;
    }

    public void setEquipNo(String equipNo) {
        this.equipNo = equipNo;
    }

    @Basic
    @Column(name = "Details")
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Basic
    @Column(name = "UserName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "PhoneNum")
    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipmentreport that = (Equipmentreport) o;
        return Objects.equals(idEquipmentReport, that.idEquipmentReport) &&
                Objects.equals(buildingNo, that.buildingNo) &&
                Objects.equals(roomNo, that.roomNo) &&
                Objects.equals(time, that.time) &&
                Objects.equals(equipName, that.equipName) &&
                Objects.equals(equipNo, that.equipNo) &&
                Objects.equals(details, that.details) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(phoneNum, that.phoneNum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idEquipmentReport, buildingNo, roomNo, time, equipName, equipNo, details, userName, phoneNum);
    }
}
