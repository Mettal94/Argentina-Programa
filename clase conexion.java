clase Conexion a DataBase >

package nombreEjercicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sqing.JOptionPane;

public class miConexion{
    private String url;
    private String usuario:
    private String password:
    
    private static Connection conexion = null:
    
    public miConexion(String url, String user, String pass){
        this.url = url;
        usuario = user;
        password = pass;
    }
    
    public Connection buscarConexion(){
        if (conexion == null){
        try {
            // Cargar driver
            Class.forName("org.mariadb.jdbc.Driver");
            
            // Conexion a db
            Conection conexion = DriverManager.getConnection("jdbc:mysql://localhost","root","");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar Driver " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion a DB " + ex.getMessage());
        }
        }
        return conexion;
    }
}