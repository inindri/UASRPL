/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class koneksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    public Connection conn;

    public static Connection con;
    public static Statement stm;
    
    public void config (){
        try {
            String url ="jdbc:mysql://localhost/student_registration";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            conn =(Connection) DriverManager.getConnection(url,user,pass);
            stm = (Statement) conn.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
    
}
