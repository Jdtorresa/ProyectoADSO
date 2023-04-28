import java.sql.*;
import java.util.ArrayList;

public class gestion_estado {
    Z_conexion con= new Z_conexion();
    ArrayList<estado> datos = new ArrayList<>();
    PreparedStatement ps=null;  // consulta con parametros
    Statement st=null;  // preparar la consulta sin parametros
    ResultSet res=null; // almacenar la consulta
    Connection conec=null; //Z_conexion

    public estado consultarEstado(String idestado){
        estado esta=null;
        try{
            conec=con.conecta();
            String sql="select * from estado where idestado=?";
            ps=conec.prepareStatement(sql);
            ps.setString(1,idestado);
            res=ps.executeQuery();
            while (res.next()){
                esta=new estado(res.getString(1), res.getString(2));
            }
        }catch (SQLException ex){
            System.out.println("No se puede consultar: "+ex);
        }
        return  esta;
    }
    public boolean eliminarEstado(String idestado){
        boolean resultado=false;
        if(this.consultarEstado(idestado)!=null){
            gestion_encuentra encuentraGest=new gestion_encuentra();
            if(encuentraGest.consultarEncuentraPorEstado(idestado).size()<=0) {
                try {
                    String sql = "delete from estado where idestado=?";
                    conec = con.conecta();
                    ps = conec.prepareStatement(sql);
                    ps.setString(1, idestado);
                    resultado = ps.executeUpdate() > 0;
                } catch (SQLException ex) {
                    System.out.println("Error al eliminar: " + ex);
                }
            }else{
                System.out.println("El estado se encuentra dentro de la tabla encuentra, NO se puede eliminar.");
            }
        }else{
            System.out.println("El numero de estado no existe.");
        }
        return  resultado;
    }

    public boolean insertarEstado(estado estad) {
        boolean resultado = false;
        try {
            conec = con.conecta();
            String sql = "INSERT INTO estado VALUES (?,?)";
            ps = conec.prepareStatement(sql);
            ps.setString(1,estad.getIdestado());
            ps.setString(2,estad.getTipo_estado());
            resultado = ps.executeUpdate() > 0;
        }
        catch (SQLException ex) {
            System.out.println("No se pudo insertar el usuario: " + ex);
        }
        return resultado;
    }
    public boolean editarEstado(estado estado) {
        boolean resultado = false;
        try {
            String sql = "UPDATE estado SET tipo_estado=? WHERE idestado=?";
            ps = conec.prepareStatement(sql);
            ps.setString(1, estado.getTipo_estado());
            ps.setString(2, estado.getIdestado());
            resultado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("Error al actualizar: " + ex.getMessage());
        }
        return resultado;
    }
}
