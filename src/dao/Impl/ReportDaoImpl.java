package dao.Impl;

import dao.ReportDao;
import entity.Complainreport;
import entity.Equipmentreport;
import entity.Repairchart;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReportDaoImpl implements ReportDao {
    JDBCUtils utils=new JDBCUtils();
    @Override
    public ArrayList<Complainreport> getComplainReport(int process) {
        Connection conn=utils.getConnection();
        PreparedStatement pst=null;
        ResultSet rst=null;
        ArrayList<Complainreport> complainreports=new ArrayList<>();
        String sql="SELECT * FROM complainreport WHERE Process=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setInt(1,process);
            rst=pst.executeQuery();
            while (rst.next()){
                Complainreport complainreport=new Complainreport();
                complainreport.setContain(rst.getString("Contain"));
                complainreport.setFee(rst.getDouble("Fee"));
                complainreport.setIdComplain(rst.getString("idComplain"));
                complainreport.setInformation(rst.getString("Information"));
                complainreport.setProcess(rst.getInt("Process"));
                complainreport.setType(rst.getString("Type"));
                complainreport.setResult(rst.getString("Result"));
                complainreports.add(complainreport);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        utils.close(rst,pst,conn);
        return complainreports.size()==0?null:complainreports;
    }

    @Override
    public ArrayList<Repairchart> getRepairChart(int process) {
        Connection conn=utils.getConnection();
        PreparedStatement pst=null;
        ResultSet rst=null;
        ArrayList<Repairchart> repaircharts=new ArrayList<>();
        String sql="SELECT * FROM repairchart WHERE Process=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setInt(1,process);
            rst=pst.executeQuery();
            while (rst.next()){
                Repairchart repairchart=new Repairchart();
                repairchart.setIdRepairChart(rst.getString("idRepairChart"));
                repairchart.setFee(rst.getDouble("Fee"));
                repairchart.setEquipNo(rst.getString("EquipNo"));
                repairchart.setEquipName(rst.getString("EquipName"));
                repairchart.setReason(rst.getString("Reason"));
                repairchart.setFee(rst.getDouble("Fee"));
                repairchart.setRepairTime(rst.getTimestamp("repairTime"));
                repairchart.setDescription(rst.getString("Description"));
                repaircharts.add(repairchart);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        utils.close(rst,pst,conn);
        return repaircharts.size()==0?null:repaircharts;
    }

    @Override
    public boolean updateComplainReport(Complainreport complainreport) {
        Connection conn=utils.getConnection();
        PreparedStatement pst=null;
        String sql="UPDATE complainreport SET Type=?,Process=?,Result=?,Fee=?,Information=?,Contain=? WHERE idComplain=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,complainreport.getType());
            pst.setInt(2,complainreport.getProcess());
            pst.setString(3,complainreport.getResult());
            pst.setDouble(4,complainreport.getFee());
            pst.setString(5,complainreport.getInformation());
            pst.setString(6,complainreport.getContain());
            pst.setString(7,complainreport.getIdComplain());
            pst.executeUpdate();
            utils.close(null,pst,conn);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        utils.close(null,pst,conn);
        return false;
    }

    @Override
    public boolean insertRepairChart(Repairchart repairchart) {
        Connection conn=utils.getConnection();
        PreparedStatement pst=null;
        String sql="INSERT INTO repairchart(idRepairChart, EquipNo, EquipName, Description, Reason, Fee,repairTime) VALUES(?,?,?,?,?,?,?)";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,repairchart.getIdRepairChart());
            pst.setString(2,repairchart.getEquipNo());
            pst.setString(3,repairchart.getEquipName());
            pst.setString(4,repairchart.getDescription());
            pst.setString(5,repairchart.getReason());
            pst.setDouble(6,repairchart.getFee());
            pst.setTimestamp(7,repairchart.getRepairTime());
            pst.executeUpdate();
            utils.close(null,pst,conn);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        utils.close(null,pst,conn);
        return false;
    }

    @Override
    public boolean insertComplainReport(Complainreport complainreport) {
        Connection conn=utils.getConnection();
        PreparedStatement pst=null;
        String sql="INSERT INTO complainreport(idComplain, Type, Process, Result, Fee, Information, Contain) VALUES (?,?,?,?,?,?,?)";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,complainreport.getIdComplain());
            pst.setString(2,complainreport.getType());
            pst.setInt(3,complainreport.getProcess());
            pst.setString(4,complainreport.getResult());
            pst.setDouble(5,complainreport.getFee());
            pst.setString(6,complainreport.getInformation());
            pst.setString(7,complainreport.getContain());
            pst.executeUpdate();
            utils.close(null,pst,conn);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        utils.close(null,pst,conn);
        return false;
    }

    @Override
    public boolean insertEquipmentReport(Equipmentreport equipmentreport) {

        Connection conn=utils.getConnection();
        PreparedStatement pst=null;
        String sql="INSERT INTO equipmentreport(idEquipmentReport, BuildingNo, RoomNo, Time, EquipName, EquipNo, Details, UserName, PhoneNum) VALUES (?.?,?,?,?,?,?,?,?)";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,equipmentreport.getIdEquipmentReport());
            pst.setString(2,equipmentreport.getBuildingNo());
            pst.setString(3,equipmentreport.getRoomNo());
            pst.setTimestamp(4,equipmentreport.getTime());
            pst.setString(5,equipmentreport.getEquipName());
            pst.setString(6,equipmentreport.getEquipNo());
            pst.setString(7,equipmentreport.getDetails());
            pst.setString(8,equipmentreport.getUserName());
            pst.setInt(9,equipmentreport.getPhoneNum());
            
            pst.executeUpdate();
            utils.close(null,pst,conn);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        utils.close(null,pst,conn);
        return false;
    }
    

    @Override
    public boolean generateSeasonReport() {
        return false;
    }
}
