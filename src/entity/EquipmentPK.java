package entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class EquipmentPK implements Serializable {
    private String idEquipment;
    private String name;

    @Column(name = "idEquipment")
    @Id
    public String getIdEquipment() {
        return idEquipment;
    }

    public void setIdEquipment(String idEquipment) {
        this.idEquipment = idEquipment;
    }

    @Column(name = "Name")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipmentPK that = (EquipmentPK) o;
        return Objects.equals(idEquipment, that.idEquipment) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idEquipment, name);
    }
}
