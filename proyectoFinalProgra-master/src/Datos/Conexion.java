package Datos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lsegu
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    public static Connection getConexion() throws SQLException {

        String url = "jdbc:sqlserver://localhost:1433;databaseName=sistemaHoteles;encrypt=false";
        String user = "usuarioSQL";  // Cambia por tu usuario de la base de datos
        String password = "admin";    // Cambia por tu contraseña de la base de datos

        Connection con = null;

        try {
            // Intentar establecer la conexión
            System.out.println("Intentando conectar a la base de datos...");
            con = DriverManager.getConnection(url, user, password);

            if (con != null) {
                System.out.println("Conexion exitosa a la base de datos.");
                return con;
            }
        } catch (SQLException e) {
            // Mostrar el error si no se puede conectar
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            return con = null;
        }

        return con;
    }

    public static void main(String[] args) throws SQLException {
        Conexion conecta = new Conexion();
        Connection c = Conexion.getConexion();
    }
}

