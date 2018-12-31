package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Boughtpark {
    private String idBoughtPark;
    private String cardNo;
    private Double fee;
    private Double price;
    private Timestamp startTime;
    private String userName;
    private Integer phoneNum;

    @Id
    @Column(name = "idBoughtPark")
    public String getIdBoughtPark() {
        return idBoughtPark;
    }

    public void setIdBoughtPark(String idBoughtPark) {
        this.idBoughtPark = idBoughtPark;
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
    @Column(name = "Fee")
    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    @Basic
    @Column(name = "Price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
        Boughtpark that = (Boughtpark) o;
        return Objects.equals(idBoughtPark, that.idBoughtPark) &&
                Objects.equals(cardNo, that.cardNo) &&
                Objects.equals(fee, that.fee) &&
                Objects.equals(price, that.price) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(phoneNum, that.phoneNum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idBoughtPark, cardNo, fee, price, startTime, userName, phoneNum);
    }
}
