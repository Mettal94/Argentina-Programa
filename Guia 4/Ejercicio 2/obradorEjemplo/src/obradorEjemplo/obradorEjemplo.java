
package obradorEjemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class obradorEjemplo {


    public static void main(String[] args) {
       
        try{
            //CONSIGNA H -- Cargamos el driver
            Class.forName("org.mariadb.jdbc.Driver");
            
            //CONSIGNA I -- Conectar a la base de datos
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/construirsa", "root","");
            
            //CONSIGNA J -- Insertamos 3 empleados
            /*
            String sqlj = "INSERT INTO empleado (dni,nombre,apellido,acceso,estado) VALUES"
                    + "(35674522,'Alejandra','Cordera',2,true),"
                    + "(23889087,'Norberto','Cravero',1,true),"
                    + "(16765432,'Guido','Martelli',3,true);";
            
            PreparedStatement psj = conn.prepareStatement(sqlj);
            
            int filasj = psj.executeUpdate();
            
            if(filasj > 0){
                JOptionPane.showMessageDialog(null, "Se agregaron exitosamente "+filasj+" empleados al registro");
            }
            */
            //CONSIGNA k -- Insertamos 3 herramientas
            /*
            String sqlk = "INSERT INTO herramienta(nombre, descripcion,stock,estado) VALUES"
                    + "('Pala','Pala común',5,true),"
                    + "('Centímetro','Centímetro Bosch',9,true);";
            
            PreparedStatement psk = conn.prepareStatement(sqlk);
            
            int filask = psk.executeUpdate();
            
            if(filask > 0){
                JOptionPane.showMessageDialog(null, "Se agregaron correctamente "+filask+" herramientas");
            }
            */
            
            //CONSIGNA L -- Listar las herramientas con stock superior a 10
            /*
            String sqll = "SELECT * FROM herramienta WHERE stock > 10;";
            
            PreparedStatement psl = conn.prepareStatement(sqll);
            
            ResultSet resultado = psl.executeQuery();
            
            while(resultado.next()){
                System.out.println("ID: "+resultado.getInt("idHerramienta")
                +"\nNombre: "+resultado.getString("nombre")
                +"\nDescripción: "+resultado.getString("descripcion")
                +"\nStock: "+resultado.getInt("stock")
                +"\nEstado: "+resultado.getBoolean("estado"));
            }
            */
            
            //CONSIGNA M -- Dar de baja el primer empleado ingresado
            
            String sqlm = "UPDATE empleado SET estado = false WHERE id_Empleado = 1;";
            
            PreparedStatement psm = conn.prepareStatement(sqlm);
            
            int filasm = psm.executeUpdate();
            
            if(filasm > 0){
                JOptionPane.showMessageDialog(null,"Se actualizó el estado del empleado en la base de datos");
            }
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al cargar el driver"+ex.getMessage());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion de base de datos"+ex.getMessage());
        }
    }
    
}
