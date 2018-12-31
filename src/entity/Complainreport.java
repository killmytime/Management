package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Complainreport {
    private String idComplain;
    private String type;
    private Integer process;
    private String result;
    private Double fee;
    private String information;
    private String contain;

    @Id
    @Column(name = "idComplain")
    public String getIdComplain() {
        return idComplain;
    }

    public void setIdComplain(String idComplain) {
        this.idComplain = idComplain;
    }

    @Basic
    @Column(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "Process")
    public Integer getProcess() {
        return process;
    }

    public void setProcess(Integer process) {
        this.process = process;
    }

    @Basic
    @Column(name = "Result")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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
    @Column(name = "Contain")
    public String getContain() {
        return contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complainreport that = (Complainreport) o;
        return Objects.equals(idComplain, that.idComplain) &&
                Objects.equals(type, that.type) &&
                Objects.equals(process, that.process) &&
                Objects.equals(result, that.result) &&
                Objects.equals(fee, that.fee) &&
                Objects.equals(information, that.information) &&
                Objects.equals(contain, that.contain);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idComplain, type, process, result, fee, information, contain);
    }
}
