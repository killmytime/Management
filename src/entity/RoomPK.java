package entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class RoomPK implements Serializable {
    private String buildingNo;
    private String roomNo;

    @Column(name = "BuildingNo")
    @Id
    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    @Column(name = "RoomNo")
    @Id
    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomPK roomPK = (RoomPK) o;
        return Objects.equals(buildingNo, roomPK.buildingNo) &&
                Objects.equals(roomNo, roomPK.roomNo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(buildingNo, roomNo);
    }
}
