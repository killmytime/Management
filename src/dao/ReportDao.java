package dao;

import entity.Complainreport;
import entity.Equipmentreport;
import entity.Repairchart;

import java.util.ArrayList;

/**
 * 查询未处理的意见，更新意见状态
 * 查询未处理的报修，更新处理状态，更新设备状态，生成报修表
 * idReport 用ER（equipmentReport）,CR(complainReport),RR（repairReport）,SR(SeasonReport)区分
 */
public interface ReportDao {
    public ArrayList<Object> getComplainReport(String process);
    public ArrayList<Object> getRepairChart(String process);
    public boolean updateComplainReport(Complainreport complainreport);
    public boolean updateRepairChart(Repairchart repairchart);
    public boolean updateEquipmentReport(Equipmentreport equipmentreport);
    public Object getReportByID(String idReport);
    public boolean generateSeasonReport();
}
