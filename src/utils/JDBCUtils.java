package utils;

import java.sql.*;

public class JDBCUtils {
    private final static String URL = "jdbc:mysql://localhost:3306/yangjie?characterEncoding=utf8&useUnicode=true&useSSL=false&serverTimezone=UTC";
    private final static String USER = "yangjie";
    private final static String PASSWORD = "jieyang666";

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // 关闭结果集、语句和连接
    public void close(ResultSet rs, Statement st, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
