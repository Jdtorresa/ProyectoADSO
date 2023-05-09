import java.sql.*;
import java.util.*;
public class gestion_join_Usuarios_Inicio {
    Z_conexion con= new Z_conexion();
    ArrayList<join_Usuarios_Inicio> datos = new ArrayList<>();
    PreparedStatement ps=null;  // consulta con parametros
    Statement st=null;  // preparar la consulta sin parametros
    ResultSet res=null; // almacenar la consulta
    Connection conec=null; //Z_conexion

    public join_Usuarios_Inicio C1 (String fecha){
        join_Usuarios_Inicio joinUI = null;
        try{
            conec=con.conecta();
            String sql = "select * from inicio inner join usuarios on inicio.iduser = usuarios.iduser where inicio.fecha = ?";
            ps=conec.prepareStatement(sql);
            ps.setString(1, fecha);
            res= ps.executeQuery();
            while(res.next()){
                joinUI = new join_Usuarios_Inicio(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8));
            }

        }catch (Exception ex){
            System.out.println("Error al consultar: "+ex);
        }
        return joinUI;
    }
}
