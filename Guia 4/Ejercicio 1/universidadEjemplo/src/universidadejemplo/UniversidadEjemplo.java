
package universidadejemplo;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;


public class UniversidadEjemplo {

  
    public static void main(String[] args) {
       
        try {
            //CONSIGNA A -- Cargamos el driver
            Class.forName("org.mariadb.jdbc.Driver");
            
            
                //CONSIGNA B -- Conexión a la base de datos
                Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/universidadulp", "root","");
                
                
                // CONSIGNA C -- Insertamos 3 alumnos
                
                /*
                String sqlc = "INSERT INTO alumno (dni,apellido,nombre,fechaNacimiento,estado) VALUES"
                        + "(36778456,'Sánchez','Juana', '"+LocalDate.of(1990, Month.MARCH, 27)+"',true),"
                        + "(40321567,'Manggeri','Alejandro','"+LocalDate.of(1997, Month.JULY,05)+"',true),"
                        + "(37527336,'Domínguez','Abigail','"+LocalDate.of(1994, Month.SEPTEMBER, 12)+"',true)";
                
                PreparedStatement psc = conn.prepareStatement(sqlc);
                
                int filasc = psc.executeUpdate();
                
                if(filasc > 0){
                    JOptionPane.showMessageDialog(null, "Se agregaron correctamente "+filasc+" alumnos");
                }
                */
                
                //CONSIGNA D -- Insertamos 4 materias
                /*
                String sqlb = "INSERT INTO materia (nombre,año,estado) VALUES"
                        + "('Programación',1,true),"
                        + "('Estadística',2,true),"
                        + "('Álgebra',3,true),"
                        + "('Análisis de datos',4,true);";
                
                PreparedStatement psd = conn.prepareStatement(sqlb);
                
                int filasd = psd.executeUpdate();
                
                if(filasd > 0){
                    JOptionPane.showMessageDialog(null, "Se agregaron correctamente "+filasd+" materias");
                }
                   */
                
                //CONSIGNA E -- Inscribir los 3 alumnos en 2 materias cada uno
                /*
                String sqle = "INSERT INTO inscripcion (nota,idMateria,idAlumno) VALUES"
                        + "(7,1,1),"
                        + "(6,3,1),"
                        + "(6,3,2),"
                        + "(8,4,2),"
                        + "(10,1,3),"
                        + "(8,2,3);";
                
                PreparedStatement pse = conn.prepareStatement(sqle);
                
                int filase = pse.executeUpdate();
                
                if(filase > 0){
                    JOptionPane.showMessageDialog(null, filase+" registros de inscripción actualizados");
                }

                */
                
                //CONSIGNA F -- Listar los datos de los alumnos con calificaciones superiores a 8
                /*
                String sqlf = "SELECT * FROM alumno a JOIN inscripcion b ON a.idAlumno = b.idAlumno WHERE nota >= 8; ";
                
                PreparedStatement psf = conn.prepareStatement(sqlf);
                
                ResultSet seleccion = psf.executeQuery();
                
                while(seleccion.next()){
                    System.out.println("ID: "+seleccion.getInt("idAlumno"));
                    System.out.println("Nombre: "+seleccion.getString("nombre"));
                    System.out.println("Apellido: "+seleccion.getString("apellido"));
                    System.out.println("DNI: "+seleccion.getInt("dni"));
                    System.out.println("Fecha de nacimiento: "+seleccion.getDate("fechaNacimiento"));
                    System.out.println("Estado: "+seleccion.getBoolean("estado"));
                    System.out.println("|----------------------------------------------|");
                }
                */
                
                //CONSIGNA G -- Desinscribir 
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Falta cargar el driver");
           
        } catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Error de conexión");
        }
    
    }
    
}
