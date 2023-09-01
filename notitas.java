Conexion a DataBase >

package nombreEjercicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sqing.JOptionPane;
    public static void main(String [] args) {
    
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