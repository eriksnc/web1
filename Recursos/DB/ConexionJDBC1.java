package conexionjdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Aaron
 */
public class ConexionJDBC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * host: 127.0.0.1
         * nombreDB: fes_ico
         * user:root
         * pass:123456
         * 
         * 
         **/
        
        String host;
        String dbName;
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            //vamos a definir la URL
            
            host="jdbc:mysql://localhost:3306/";
            dbName="fes_ico";
            
            //Establecer nuestra conexion
            Connection db = DriverManager.getConnection(host+dbName,"root","24032001");
            
            /**
             * El objeto Statement (sentencia) sirve para procesar una sentencia 
             * SQL estática y obtener los resultados producidos por ella. 
             * Solo puede haber un ResultSet abierto para cada objeto Statement 
             * en un momento dado. Todos los métodos statement que procesan una 
             * sentencia SQL cierran implícitamente el ResultSet actual de una 
             * sentencia si existe uno abierto.
             * 
            **/
            Statement st = db.createStatement();
            
            
            /**
             * Un ResultSet contiene todas las filas que satisfacen las condiciones de una sentencia SQL 
             * y proporciona el acceso a los datos de estas filas mediante un conjunto
             * de métodos get que permiten el acceso a las diferentes columnas de la
             * filas. El método ResultSet.next se usa para moverse a la siguiente
             * fila del result set, convirtiendo a ésta en la fila actual. Simplificando,
             * un Result Set es una tabla, pero no hay garantía de que los datos lleguen 
             * en orden, por lo que se puede usar la sentencia ORDER BY para asignar un 
             * determinado orden establecido en las filas del ResultSet.
             */
            ResultSet rs=st.executeQuery("SELECT * FROM ALUMNO");
            // Vamos a leer los resultados
            while(rs.next()){
                System.out.println(rs.getString("Nombre_usuario"));            
            }
            
            
            
            
        } catch (Exception e) {
        
            System.out.println("Problema con la conexion"+e);
        
        
        }
        
        
    }
    
}