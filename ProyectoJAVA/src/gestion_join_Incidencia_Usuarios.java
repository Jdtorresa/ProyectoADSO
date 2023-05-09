import java.sql.*;
import java.util.*;
public class gestion_join_Incidencia_Usuarios {
    Z_conexion con= new Z_conexion();
    ArrayList<join_Incidencia_Usuarios> datos = new ArrayList<>();
    PreparedStatement ps=null;  // consulta con parametros
    Statement st=null;  // preparar la consulta sin parametros
    ResultSet res=null; // almacenar la consulta
    Connection conec=null; //Z_conexion

    public ArrayList<join_Incidencia_Usuarios> C1(String prioridad){
        datos.clear();
        try{
            conec=con.conecta();
            String sql = "select * from usuarios \n" +
                    "inner join incidencia on usuarios.iduser = incidencia.iduser \n" +
                    "where incidencia.idprioridad = ?;";
            ps=conec.prepareStatement(sql);
            ps.setString(1, prioridad);
            res= ps.executeQuery();
            while(res.next()){
                join_Incidencia_Usuarios usua = new join_Incidencia_Usuarios(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9));
                datos.add(usua);
            }
        }catch (Exception ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }
}
