package dao;


import java.sql.SQLException;

public interface ParkDao {
    //find a empty park must have been done in an other system
    public boolean addParkInformation(Object parkObject);
    public Object getParkById(String idPark) throws SQLException;
    public double getFeeByCarNo(String CarNo);//only in temp
    public boolean deleteCarNo(String CarNo);//only in temp and rent
}