package co.edu.udea.udea_ruta2_ciclo2.db;

import java.sql.*;

public class EjemploBaseDatosInsert {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/concesionario";
            Connection conexion = DriverManager.getConnection(url, "root", "");
            String sentencia = "INSERT INTO vendedores (documento,nombres,apellidos,ciudad) VALUES ('1379','Pepito','Pérez','Barranquilla');";
            Statement consulta = conexion.createStatement();
            consulta.executeQuery(sentencia);
            conexion.close();
        } catch (ClassNotFoundException e) {
            System.out.println("No fue posible cargar el driver.");
        } catch (SQLException e) {
            System.out.println("Hubo un error al acceder a la base de datos: " + e.getMessage());
        }

    }
}
