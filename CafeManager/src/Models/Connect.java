/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
	private static String DB_URL = "jdbc:sqlserver://localhost:1434;"
            + "databaseName=QuanLyQuanCaffe;"
            + "integratedSecurity=true";
    private static String USER_NAME = "1";
    private static String PASSWORD = "1";    
    private static Connection conn = null;
    
    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
    public static void close() throws SQLException {
		conn.close();
	}
}
