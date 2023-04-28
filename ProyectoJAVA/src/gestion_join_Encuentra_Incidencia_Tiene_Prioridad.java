import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class gestion_join_Encuentra_Incidencia_Tiene_Prioridad {
    Z_conexion con= new Z_conexion();
    ArrayList<join_Encuentra_Incidencia_Tiene_Prioridad> datos = new ArrayList<>();
    PreparedStatement ps=null;  // consulta con parametros
    Statement st=null;  // preparar la consulta sin parametros
    ResultSet res=null; // almacenar la consulta
    Connection conec=null; //Z_conexion

    public ArrayList<join_Encuentra_Incidencia_Tiene_Prioridad> C1(String estad){
        datos.clear();
        try{
            conec=con.conecta();
            String sql = "select * from encuentra, incidencia,\n" +
                    "tiene, prioridad where encuentra.idestado=? and\n" +
                    "encuentra.noincidencia=incidencia.noincidencia and\n" +
                    "incidencia.noincidencia=tiene.noincidencia\n" +
                    "and tiene.idprioridad=prioridad.idprioridad";
            ps=conec.prepareStatement(sql);
            ps.setString(1, estad);
            res= ps.executeQuery();
            while(res.next()){
                join_Encuentra_Incidencia_Tiene_Prioridad join = new join_Encuentra_Incidencia_Tiene_Prioridad(res.getInt(1), res.getInt(2), res.getString(3), res.getString(4),res.getString(5), res.getString(6), res.getString(7), res.getInt(8), res.getInt(9), res.getString(10),res.getInt(11), res.getInt(12), res.getString(13), res.getString(14),res.getString(15), res.getString(16), res.getString(17));
                datos.add(join);
            }
        }catch (Exception ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }
}
