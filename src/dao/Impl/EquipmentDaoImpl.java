package dao.Impl;

import dao.EquipmentDao;
import entity.Indoor;
import entity.Outdoor;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EquipmentDaoImpl implements EquipmentDao {
    JDBCUtils utils=new JDBCUtils();
    @Override
    public Object getEquipmentById(String idEquipment) throws SQLException {
        Connection conn=utils.getConnection();
        PreparedStatement pst=null;
        ResultSet rst=null;
        String sql="";
        String type=idEquipment.substring(0,2);
        if (type.equals("IN")){
            sql="SELECT * FROM indoor WHERE idInDoor=?";
            pst=conn.prepareStatement(sql);
            rst=pst.executeQuery();
            Indoor indoor=new Indoor();
            indoor.setIdInDoor(rst.getString("idInDoor"));
            indoor.setLastTime(rst.getTimestamp("LastTime"));
            indoor.setName(rst.getString("Name"));
            indoor.setRepairNum(rst.getInt("RepairNum"));
            indoor.setTotalFee(rst.getDouble("TotalFee"));
            utils.close(rst,pst,conn);
            return indoor;
        }else if(type.equals("OU")){
            sql="SELECT * FROM outdoor WHERE idOutDoor=?";
            pst=conn.prepareStatement(sql);
            rst=pst.executeQuery();
            Outdoor outdoor=new Outdoor();
            outdoor.setIdOutDoor(rst.getString("idOutDoor"));
            outdoor.setLastTime(rst.getTimestamp("LastTime"));
            outdoor.setName(rst.getString("Name"));
            outdoor.setRepairNum(rst.getInt("RepairNum"));
            outdoor.setTotalFee(rst.getDouble("TotalFee"));
            utils.close(rst,pst,conn);
            return outdoor;
        }else {
            return null;
        }
    }
}
