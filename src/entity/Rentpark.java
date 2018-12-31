package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Rentpark {
    private String idRentPark;
    private Integer rentTime;
    private Timestamp startTime;
    private String cardNo;
    private Double price;
    private Double totalFee;
    private String userName;
    private Integer phoneNum;

    @Id
    @Column(name = "idRentPark")
    public String getIdRentPark() {
        return idRentPark;
    }

    public void setIdRentPark(String idRentPark) {
        this.idRentPark = idRentPark;
    }

    @Basic
    @Column(name = "RentTime")
    public Integer getRentTime() {
        return rentTime;
    }

    public void setRentTime(Integer rentTime) {
        this.rentTime = rentTime;
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
    @Column(name = "CardNo")
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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
    @Column(name = "TotalFee")
    public Double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Double totalFee) {
        this.totalFee = totalFee;
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
        Rentpark rentpark = (Rentpark) o;
        return Objects.equals(idRentPark, rentpark.idRentPark) &&
                Objects.equals(rentTime, rentpark.rentTime) &&
                Objects.equals(startTime, rentpark.startTime) &&
                Objects.equals(cardNo, rentpark.cardNo) &&
                Objects.equals(price, rentpark.price) &&
                Objects.equals(totalFee, rentpark.totalFee) &&
                Objects.equals(userName, rentpark.userName) &&
                Objects.equals(phoneNum, rentpark.phoneNum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idRentPark, rentTime, startTime, cardNo, price, totalFee, userName, phoneNum);
    }
}
