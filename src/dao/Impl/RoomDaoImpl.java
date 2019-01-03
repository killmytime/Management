package dao.Impl;

import dao.RoomDao;
import entity.Room;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RoomDaoImpl implements RoomDao {
    JDBCUtils utils=new JDBCUtils();
    @Override
    public boolean register(Room room) {
        Connection conn=utils.getConnection();
        PreparedStatement pst=null;
        String sql="UPDATE room SET CheckIN=?,Fee=?,Information=?,UserName=?,PhomeNum=?,Identify=? WHERE BuildingNo=? AND RoomNo=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setInt(1,room.getCheckIn());
            pst.setDouble(2,room.getFee());
            pst.setString(3,room.getInformation());
            pst.setString(4,room.getUserName());
            pst.setInt(5,room.getPhomeNum());
            pst.setString(6,room.getIdentify());
            pst.setString(7,room.getBuildingNo());
            pst.setString(8,room.getRoomNo());
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
    public ArrayList<Room> getEmptyRooms() {
        Connection conn=utils.getConnection();
        PreparedStatement pst=null;
        ResultSet rst=null;
        ArrayList<Room> rooms=new ArrayList<>();
        String sql="SELECT * FROM room WHERE CheckIN=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setInt(1,0);
            rst=pst.executeQuery();
            while (rst.next()){
                Room room=new Room();
                room.setBuildingNo(rst.getString("BuildingNo"));
                room.setRoomNo(rst.getString("RoomNo"));
                rooms.add(room);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        utils.close(rst,pst,conn);
        return rooms.size()==0?null:rooms;
    }

    @Override
    public ArrayList<Room> getRoomByID(int phoneNum) {
        Connection conn=utils.getConnection();
        PreparedStatement pst=null;
        ResultSet rst=null;
        ArrayList<Room> rooms=new ArrayList<>();
        String sql="SELECT * FROM room WHERE PhomeNum=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setInt(1,phoneNum);
            rst=pst.executeQuery();
            while (rst.next()){
                Room room=new Room();
                room.setBuildingNo(rst.getString("BuildingNo"));
                room.setRoomNo(rst.getString("RoomNo"));
                room.setUserName(rst.getString("UserName"));
                room.setPhomeNum(phoneNum);
                rooms.add(room);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        utils.close(rst,pst,conn);
        return rooms.size()==0?null:rooms;
    }

    @Override
    public ArrayList<Object> getAllTasks(int phoneNum, String taskType, String processingType) {

        return null;
    }
}
