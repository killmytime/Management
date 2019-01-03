package dao;

import entity.Complainreport;
import entity.Equipmentreport;
import entity.Repairchart;

import java.util.ArrayList;

/**
 * 查询未处理的意见，更新意见状态             process 0处理前 1处理中 2处理完
 * 查询未处理的报修，更新处理状态，更新设备状态，生成报修表
 * idReport 用ER（equipmentReport）,CR(complainReport),RR（repairReport）,SR(SeasonReport)区分
 */
public interface ReportDao {
    public ArrayList<Complainreport> getComplainReport(int process);
    public ArrayList<Repairchart> getRepairChart(int process);
    public boolean updateComplainReport(Complainreport complainreport);
    public boolean insertRepairChart(Repairchart repairchart);
    public boolean insertComplainReport(Complainreport complainreport);
    public boolean insertEquipmentReport(Equipmentreport equipmentreport);
    public boolean generateSeasonReport();
}
