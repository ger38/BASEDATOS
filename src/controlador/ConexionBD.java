
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBD {
  
    Connection con;
    String driver = "com.mysql.cj.jdbc.Driver";
    String dbName = "bd_tacos"; //NOMBRE DE LA BASE DE DATOS
    String url = "jdbc:mysql://localhost:3306/" + dbName + "?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC"; // Url de base de datos
    String usuario = "root";
    String clave = "";

    public Connection ConectarBaseDatos() throws SQLException {
        try {
            Connection con = DriverManager.getConnection(url, usuario, clave);
            //System.out.println("Coneccion Correcta");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La Base de Datos NO esta creada Ó hay algún error en la configuración del archivo ConexionBD.java", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return null;
    }
}



