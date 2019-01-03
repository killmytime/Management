package dao.Impl;

import dao.ParkDao;
import entity.Boughtpark;
import entity.Rentpark;
import entity.Temppark;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ParkDaoImpl implements ParkDao {
    JDBCUtils utils = new JDBCUtils();


    @Override
    public Object getParkById(String idPark) throws SQLException {
        Connection conn = utils.getConnection();
        PreparedStatement pst = null;
        ResultSet rst = null;
        String sql = "";
        String type = idPark.substring(0, 2);
        if (type.equals("BP")) {
            sql = "SELECT * FROM boughtpark WHERE idBoughtPark=" + idPark;
            pst = conn.prepareStatement(sql);
            rst = pst.executeQuery();
            if (rst.next()) {
                Boughtpark park = new Boughtpark();
                park.setCardNo(rst.getString("CardNo"));
                park.setFee(rst.getDouble("Fee"));
                park.setIdBoughtPark(rst.getString("IdBoughtPark"));
                park.setPrice(rst.getDouble("Price"));
                park.setStartTime(rst.getTimestamp("StartTime"));
                park.setUserName(rst.getString("UserName"));
                park.setPhoneNum(rst.getInt("PhoneNum"));
                utils.close(rst, pst, conn);
                return park;
            }
            return null;
        } else if (type.equals("RP")) {
            sql = "SELECT * FROM rentpark WHERE idRentPark=" + idPark;
            pst = conn.prepareStatement(sql);
            rst = pst.executeQuery();
            if (rst.next()) {
                Rentpark park = new Rentpark();
                park.setCardNo(rst.getString("CardNo"));
                park.setIdRentPark(rst.getString("idRentPark"));
                park.setRentTime(rst.getInt("RentTime"));
                park.setTotalFee(rst.getDouble("TotalFee"));
                park.setPrice(rst.getDouble("Price"));
                park.setStartTime(rst.getTimestamp("StartTime"));
                park.setUserName(rst.getString("UserName"));
                park.setPhoneNum(rst.getInt("PhoneNum"));
                utils.close(rst, pst, conn);
                return park;
            }
            return null;
        } else if (type.equals("TP")) {
            sql = "SELECT * FROM temppark WHERE idTempPark=" + idPark;
            pst = conn.prepareStatement(sql);
            rst = pst.executeQuery();
            if (rst.next()){
            Temppark park = new Temppark();
            park.setCardNo(rst.getString("CardNo"));
            park.setFee(rst.getDouble("Fee"));
            park.setStartTime(rst.getTimestamp("StartTime"));
            park.setIdTempPark(rst.getString("idTempPark"));
            park.setUsedTime(rst.getInt("UsedTime"));
            park.setEndTime(rst.getTimestamp("EndTime"));
            utils.close(rst, pst, conn);
            return park;}
            return null;
        } else {
            System.out.println("lei");
            return null;
        }

    }

    @Override
    public double getFeeByCarNo(String CarNo) {
        Connection conn = utils.getConnection();
        PreparedStatement pst = null;
        ResultSet rst = null;
        String sql = "SELECT Fee FROM temppark WHERE CardNo=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, CarNo);
            rst = pst.executeQuery();
            utils.close(rst, pst, conn);
            if (rst.next()){
            return rst.getDouble("Fee");
            }return 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        utils.close(rst, pst, conn);
        return 0;
    }

    @Override
    public boolean deleteCarNo(String CarNo) {
        Connection conn = utils.getConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE temppark set CardNo=? WHERE CardNo=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, "");
            pst.setString(2, CarNo);
            pst.executeUpdate();
            sql = "UPDATE  rentpark set CardNo=? WHERE CardNo=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, "");
            pst.setString(2, CarNo);
            pst.executeUpdate();
            utils.close(null, pst, conn);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        utils.close(null, pst, conn);
        return false;
    }

    @Override
    public ArrayList<String> getEmptyTempPark() {
        Connection conn = utils.getConnection();
        PreparedStatement pst = null;
        ResultSet rst = null;
        ArrayList<String> array = new ArrayList<>();
        String sql = "SELECT idTempPark FROM temppark WHERE CardNo=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, "");
            rst = pst.executeQuery();
            while (rst.next()) {
                array.add(rst.getString("idTempPark"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        utils.close(rst, pst, conn);
        return array.size() == 0 ? null : array;
    }

    @Override
    public ArrayList<String> getEmptyRentPark() {
        Connection conn = utils.getConnection();
        PreparedStatement pst = null;
        ResultSet rst = null;
        ArrayList<String> array = new ArrayList<>();
        String sql = "SELECT idRentPark FROM rentpark WHERE CardNo=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, "");
            rst = pst.executeQuery();
            while (rst.next()) {
                array.add(rst.getString("idRentPark"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        utils.close(rst, pst, conn);
        return array.size() == 0 ? null : array;
    }
}
