package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Moneycontrol {
    private String idMoneyControl;
    private Double income;
    private Double outcome;
    private Time day;

    @Id
    @Column(name = "idMoneyControl")
    public String getIdMoneyControl() {
        return idMoneyControl;
    }

    public void setIdMoneyControl(String idMoneyControl) {
        this.idMoneyControl = idMoneyControl;
    }

    @Basic
    @Column(name = "Income")
    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    @Basic
    @Column(name = "Outcome")
    public Double getOutcome() {
        return outcome;
    }

    public void setOutcome(Double outcome) {
        this.outcome = outcome;
    }

    @Basic
    @Column(name = "Day")
    public Time getDay() {
        return day;
    }

    public void setDay(Time day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moneycontrol that = (Moneycontrol) o;
        return Objects.equals(idMoneyControl, that.idMoneyControl) &&
                Objects.equals(income, that.income) &&
                Objects.equals(outcome, that.outcome) &&
                Objects.equals(day, that.day);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idMoneyControl, income, outcome, day);
    }
}
