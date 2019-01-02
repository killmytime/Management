package dao;


import java.sql.SQLException;
import java.util.ArrayList;

/**
 * idPark用BP，RP，TP区分买的，租的，临时的
 */
//ToDO 查询空车位（针对temp车位），针对空闲租用车位，
public interface ParkDao {
    //find a empty park must have been done in an other system
    public Object getParkById(String idPark) throws SQLException;
    public double getFeeByCarNo(String CarNo);//only in temp
    public boolean deleteCarNo(String CarNo);//only in temp and rent
    public ArrayList<String> getEmptyTempPark();//get empty temp park list
    public ArrayList<String> getEmptyRentPark();//get rent park which haven't been rented
}