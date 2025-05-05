package Connexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertarUsuario {
    public static void main(String[] args) throws SQLException{
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_demo", "root", "8888");
            System.out.println("Conexion correcta...");

            String sql = "INSERT INTO usuarios (nombre, ameil) VALUES (?,?)";

            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, "Carlos");
            statement.setString(2, "carlos@asdasd.com");

            statement.execute();
            System.out.println("Usuario registrado.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}