package dao.Impl;

import dao.MoneyDao;
import entity.Moneycontrol;
import utils.JDBCUtils;

import java.sql.*;

public class MoneyDaoImpl implements MoneyDao {
    JDBCUtils utils=new JDBCUtils();

    @Override
    public boolean addnewRecord(Moneycontrol moneycontrol) {
        Connection conn=utils.getConnection();
        PreparedStatement pst=null;
        String sql="INSERT INTO moneycontrol(idMoneyControl, Income,Outcome, recordTime) VALUES (?,?,?,?)";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,moneycontrol.getIdMoneyControl());
            pst.setDouble(2,moneycontrol.getIncome());
            pst.setDouble(3,moneycontrol.getOutcome());
            pst.setTime(4,moneycontrol.getRecordTime());
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
    public Double getMoneyByTime(Time startTime, Time endTime) {
        Connection conn=utils.getConnection();
        PreparedStatement pst=null;
        ResultSet rst=null;
        String sql="SELECT COUNT (moneycontrol.Balance) AS money FROM moneycontrol WHERE recordTime>=? AND recordTime<=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setTime(1,startTime);
            pst.setTime(2,endTime);
            rst=pst.executeQuery();
            if (rst.next()){
                Double balance=rst.getDouble("money");
                utils.close(rst,pst,conn);
                return balance;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        utils.close(rst,pst,conn);
        return null;
    }
}
