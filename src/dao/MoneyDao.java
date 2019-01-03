package dao;

import entity.Moneycontrol;

import java.sql.Time;

public interface MoneyDao {
    public boolean addnewRecord(Moneycontrol moneycontrol);
    public Double getMoneyByTime(Time startTime,Time endTime);
}
