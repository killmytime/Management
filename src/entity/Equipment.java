package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.util.Objects;

@Entity
@IdClass(EquipmentPK.class)
public class Equipment {
    private String idEquipment;
    private String name;

    @Id
    @Column(name = "idEquipment")
    public String getIdEquipment() {
        return idEquipment;
    }

    public void setIdEquipment(String idEquipment) {
        this.idEquipment = idEquipment;
    }

    @Id
    @Column(name = "Name")
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
        Equipment equipment = (Equipment) o;
        return Objects.equals(idEquipment, equipment.idEquipment) &&
                Objects.equals(name, equipment.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idEquipment, name);
    }
}
