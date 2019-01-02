package dao;

import entity.Moneycontrol;

import java.sql.Time;

public interface MoneyDao {
    public Moneycontrol getDataByDay(Time day);
}
