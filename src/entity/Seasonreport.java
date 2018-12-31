package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Seasonreport {
    private String idSeasonReport;
    private Timestamp time;
    private Double income;
    private Double outcome;

    @Id
    @Column(name = "idSeasonReport")
    public String getIdSeasonReport() {
        return idSeasonReport;
    }

    public void setIdSeasonReport(String idSeasonReport) {
        this.idSeasonReport = idSeasonReport;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seasonreport that = (Seasonreport) o;
        return Objects.equals(idSeasonReport, that.idSeasonReport) &&
                Objects.equals(time, that.time) &&
                Objects.equals(income, that.income) &&
                Objects.equals(outcome, that.outcome);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idSeasonReport, time, income, outcome);
    }
}
