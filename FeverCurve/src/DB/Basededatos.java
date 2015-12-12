package DB;
import java.sql.*;

public class Basededatos {
private Connection conexion;
static String bd="Base_de_Datos";
static String user="Usuario_Base_de_Datos";
static String password="Contraseña";
static String server="jdbc:mysql://localhost/"+bd;

/** Creates a new instance of BasedeDatos */
public Basededatos() {
}

public void establecerConexion(){
try{
Class.forName("com.mysql.jdbc.Driver");
conexion = DriverManager.getConnection(server,user,password);
}
catch(Exception e){
System.out.println("Imposible realizar conexion con la BD");
e.printStackTrace();
}
}

public Connection getConexion(){
return conexion;
}

public void cerrar(ResultSet rs){
if(rs !=null){
try{
rs.close();
}
catch(Exception e){
System.out.print("No es posible cerrar la Conexion");
}
}
}

public void cerrar(java.sql.Statement stmt){
if(stmt !=null){
try{
stmt.close();
}
catch(Exception e){}
}
}

public void destruir(){

if(conexion !=null){

try{
conexion.close();
}
catch(Exception e){}
}
}
}