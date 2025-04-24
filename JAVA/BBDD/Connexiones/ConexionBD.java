package Connexiones;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
    public static void main(String[] args) {
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_demo", "root", "8888");
            System.out.println("Conexion correcta...");
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}