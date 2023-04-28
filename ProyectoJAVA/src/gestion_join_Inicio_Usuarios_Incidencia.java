import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class gestion_join_Inicio_Usuarios_Incidencia {
    Z_conexion con= new Z_conexion();
    ArrayList<join_Inicio_Usuarios_Incidencia> datos = new ArrayList<>();
    PreparedStatement ps=null;  // consulta con parametros
    Statement st=null;  // preparar la consulta sin parametros
    ResultSet res=null; // almacenar la consulta
    Connection conec=null; //Z_conexion

    public ArrayList<join_Inicio_Usuarios_Incidencia> C1(String ubicacion){
        datos.clear();
        try{
            conec=con.conecta();
            String sql = "select * from inicio, usuarios, incidencia where\n" +
                    "inicio.iduser=usuarios.iduser and usuarios.iduser=incidencia.iduser and\n" +
                    "incidencia.ubicacion=?";
            ps=conec.prepareStatement(sql);
            ps.setString(1, ubicacion);
            res= ps.executeQuery();
            while(res.next()){
                join_Inicio_Usuarios_Incidencia join = new join_Inicio_Usuarios_Incidencia(res.getString(1), res.getString(2), res.getInt(3), res.getInt(4),res.getString(5), res.getString(6), res.getInt(7), res.getInt(8), res.getString(9), res.getString(10),res.getInt(11), res.getInt(12), res.getString(13));
                datos.add(join);
            }
        }catch (Exception ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }
}
