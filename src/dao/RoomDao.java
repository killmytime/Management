package dao;

import entity.Room;

import java.util.ArrayList;

/**
 * 住户信息的录入查询，查询住户当前待处理的任务（报修，意见），闲置房屋的统计
 */
public interface RoomDao {
    public boolean register(Room room);
    public ArrayList<Room> getEmptyRooms();
    public ArrayList<Room> getRoomByID(String idRoom);//可能还需要根据用户名字，用户身份查询，多个房子，同名的情况
    public ArrayList<Object> getallTasks(Room room,String taskType,String processingType);//taskType控制查询任务的类型,processingType处理状态

}
