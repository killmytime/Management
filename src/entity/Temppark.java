package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Temppark {
    private String idTempPark;
    private String cardNo;
    private Integer usedTime;
    private Double fee;
    private Timestamp startTime;
    private Timestamp endTime;

    @Id
    @Column(name = "idTempPark")
    public String getIdTempPark() {
        return idTempPark;
    }

    public void setIdTempPark(String idTempPark) {
        this.idTempPark = idTempPark;
    }

    @Basic
    @Column(name = "CardNo")
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Basic
    @Column(name = "UsedTime")
    public Integer getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
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
    @Column(name = "StartTime")
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "EndTime")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temppark temppark = (Temppark) o;
        return Objects.equals(idTempPark, temppark.idTempPark) &&
                Objects.equals(cardNo, temppark.cardNo) &&
                Objects.equals(usedTime, temppark.usedTime) &&
                Objects.equals(fee, temppark.fee) &&
                Objects.equals(startTime, temppark.startTime) &&
                Objects.equals(endTime, temppark.endTime) ;
    }

    @Override
    public int hashCode() {

        return Objects.hash(idTempPark, cardNo, usedTime, fee, startTime, endTime);
    }
}
