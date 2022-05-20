/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class koneksi_test {
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/contohsiakad";
    static final String USER = "root";
    static final String PASSWORD = "";

    static Connection connection;

    public static void main(String[] args) throws SQLException {
        try{
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            System.out.println(connection.isClosed());
            connection.close();
            System.out.println(connection.isClosed());

        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
