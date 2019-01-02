package dao;

import java.sql.SQLException;

/**
 * equipment 的id用IN和OU区分里外
 */
public interface EquipmentDao {
    public Object getEquipmentById(String idEquipment) throws SQLException;
}
