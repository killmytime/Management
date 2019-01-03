package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(RoomPK.class)
public class Room {
    private String buildingNo;
    private String roomNo;
    private Integer checkIn;
    private Double fee;
    private String information;
    private String userName;
    private Integer phomeNum;
    private String identify;

    @Id
    @Column(name = "BuildingNo")
    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    @Id
    @Column(name = "RoomNo")
    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    @Basic
    @Column(name = "CheckIN")
    public Integer getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Integer checkIn) {
        this.checkIn = checkIn;
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
    @Column(name = "Information")
    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
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
    @Column(name = "PhomeNum")
    public Integer getPhomeNum() {
        return phomeNum;
    }

    public void setPhomeNum(Integer phomeNum) {
        this.phomeNum = phomeNum;
    }

    @Basic
    @Column(name = "Identify")
    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(buildingNo, room.buildingNo) &&
                Objects.equals(roomNo, room.roomNo) &&
                Objects.equals(checkIn, room.checkIn) &&
                Objects.equals(fee, room.fee) &&
                Objects.equals(information, room.information) &&
                Objects.equals(userName, room.userName) &&
                Objects.equals(phomeNum, room.phomeNum) &&
                Objects.equals(identify, room.identify);
    }

    @Override
    public int hashCode() {

        return Objects.hash(buildingNo, roomNo, checkIn, fee, information, userName, phomeNum, identify);
    }
}
