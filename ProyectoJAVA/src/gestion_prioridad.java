import java.sql.*;
import java.util.ArrayList;

public class gestion_prioridad {
    Z_conexion con= new Z_conexion();
    ArrayList<prioridad> datos = new ArrayList<>();
    PreparedStatement ps=null;  // consulta con parametros
    Statement st=null;  // preparar la consulta sin parametros
    ResultSet res=null; // almacenar la consulta
    Connection conec=null; //Z_conexion

    public prioridad consultarPrioridad(String idprioridad){
        prioridad priori=null;
        try{
            conec=con.conecta();
            String sql="select * from prioridad where idprioridad=?";
            ps=conec.prepareStatement(sql);
            ps.setString(1,idprioridad);
            res=ps.executeQuery();
            while (res.next()){
                priori=new prioridad(res.getString(1), res.getString(2));
            }
        }catch (SQLException ex){
            System.out.println("No se puede consultar: "+ex);
        }
        return  priori;
    }
    public boolean eliminarPrioridad(String idprioridad){
        boolean resultado=false;
        if(this.consultarPrioridad(idprioridad)!=null){
            gestion_tiene tieneGest=new gestion_tiene();
            if(tieneGest.consultarTienePorPrioridad(idprioridad).size()<=0) {
                try {
                    String sql = "delete from prioridad where idprioridad=?";
                    conec = con.conecta();
                    ps = conec.prepareStatement(sql);
                    ps.setString(1, idprioridad);
                    resultado = ps.executeUpdate() > 0;
                } catch (SQLException ex) {
                    System.out.println("Error al eliminar: " + ex);
                }
            }else{
                System.out.println("La prioridad se encuentra dentro de la tabla tiene, NO se puede eliminar.");
            }
        }else{
            System.out.println("El numero de prioridad no existe.");
        }
        return  resultado;
    }
    public boolean insertarPrioridad(prioridad priori) {
        boolean resultado = false;
            try {
                conec = con.conecta();
                String sql = "INSERT INTO prioridad (idprioridad, tipo_prioridad) VALUES (?,?)";
                ps = conec.prepareStatement(sql);
                ps.setString(1,priori.getIdprioridad());
                ps.setString(2,priori.getTipo_prioridad());
                resultado = ps.executeUpdate() > 0;
            }
            catch (SQLException ex) {
                System.out.println("No se pudo insertar el usuario: " + ex);
            }
        return resultado;
    }
    public boolean editarPrioridad(prioridad prioridad) {
        boolean resultado = false;
        try {
            String sql = "UPDATE prioridad SET tipo_prioridad=? WHERE idprioridad=?";
            ps = conec.prepareStatement(sql);
            ps.setString(1, prioridad.getTipo_prioridad());
            ps.setString(2, prioridad.getIdprioridad());
            resultado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("Error al actualizar: " + ex.getMessage());
        }
        return resultado;
    }
}
