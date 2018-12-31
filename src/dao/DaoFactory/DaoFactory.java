package dao.DaoFactory;

import dao.Impl.ParkDaoImpl;
import dao.ParkDao;

public class DaoFactory {
public static ParkDao getParkDaoInstance(){return new ParkDaoImpl();}
}
