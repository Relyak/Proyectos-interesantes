/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundaeva.practica2mysql;

import java.sql.*;
/**
 *
 * @author iesjdc
 */
public class Ejercicio2 {

    public static void main(String args[]) throws SQLException {

        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "profe", "profe");
        // driver@machineName:port:SID           ,  userid,  password

        Statement sm = conn.createStatement();
        ResultSet rs
                = sm.executeQuery("select * from emp where deptno=30");
        while (rs.next()) {
            
            int empno = rs.getInt("empno");
            String ename= rs.getString("ename");
            String job= rs.getString("job");
            int mgr= rs.getInt("mgr");
            Date fecha= rs.getDate("hiredate");
            int sal= rs.getInt("sal");
            int comm= rs.getInt("comm");
            int deptno= rs.getInt("deptno");
            
            System.out.println("Numero: "  + empno + " Nombre: " + ename + " Funcion:" + job+ " Jefe: "+
                    mgr+" F.Incorporacion: "+ fecha+ " Sueldo: "+sal+" Comision: "+comm+" Departamento: "+deptno);// Print col 1
        }
        sm.close();

    }
}
