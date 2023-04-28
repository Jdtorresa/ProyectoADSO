import java.sql.*;
import java.util.ArrayList;

public class gestion_encuentra {
    Z_conexion con= new Z_conexion();
    ArrayList<encuentra> datos = new ArrayList<>();
    PreparedStatement ps=null;  // consulta con parametros
    Statement st=null;  // preparar la consulta sin parametros
    ResultSet res=null; // almacenar la consulta
    Connection conec=null; //Z_conexion


    public encuentra ConsultarEncuentra(String nRegistro){
        encuentra encuen=null;
        try{
            conec=con.conecta();
            String sql="select * from encuentra where N°registro=?";
            ps=conec.prepareStatement(sql);
            ps.setString(1, nRegistro);
            res=ps.executeQuery();
            while(res.next()){
                encuen=new encuentra(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5));
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);
        }
        return  encuen;
    }
    public ArrayList<encuentra> consultarEncuentraPorEstado(String estado){
        datos.clear();
        try{
            conec=con.conecta();
            String sql="select * from encuentra where idestado=?";
            ps=conec.prepareStatement(sql);
            ps.setString(1, estado);
            res=ps.executeQuery();
            while(res.next()){
                encuentra encuen=new encuentra(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5));
                datos.add(encuen);
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);
        }
        return  datos;
    }
    public encuentra consultarEncuentraPorIncidencia(String noincidencia) {
        encuentra encuen = null;
        try {
            conec = con.conecta();
            String sql = "select * from encuentra where noincidencia=?";
            ps = conec.prepareStatement(sql);
            ps.setString(1, noincidencia);
            res = ps.executeQuery();
            while (res.next()) {
                encuen = new encuentra(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5));
            }
        } catch (SQLException ex) {
            System.out.println("Error al consultar: " + ex);
        }
        return encuen;
    }
    public boolean eliminarEncuentra(String nRegistro){
        boolean resultado=false;
        if(this.ConsultarEncuentra(nRegistro)!=null){
            try {
                String sql = "delete from encuentra where N°registro=?";
                conec = con.conecta();
                ps=conec.prepareStatement(sql);
                ps.setString(1, nRegistro);
                resultado = ps.executeUpdate() > 0;
            } catch (SQLException ex) {
                System.out.println("Error al eliminar: " + ex);
            }
        }else{
            System.out.println("El numero de registro "+nRegistro+" no existe.");
        }
        return  resultado;
    }
    public boolean insertarEncuentra(encuentra enc){
        boolean result = false;
        try{
            conec=con.conecta();
            String sql = "INSERT INTO encuentra VALUES (?, ?, ?, ?, ?)";
            ps = conec.prepareStatement(sql);
            ps.setString(1, enc.getNºregistro());
            ps.setString(2, enc.getNoincidencia());
            ps.setString(3, enc.getIdestado());
            ps.setString(4, enc.getDescripcion());
            ps.setString(5, enc.getFecha_registro());
            result = ps.executeUpdate()>0;
        }
        catch (Exception ex){
            System.out.println("Error al insertar: "+ex);
        }
        return result;
    }
    public boolean editarEncuentra(encuentra encuentra) {
        boolean resultado = false;
        try {
            String sql = "UPDATE encuentra SET noincidencia=?, idestado=?, descripcion=?, fecha_registro=? WHERE N°registro=?";
            ps = conec.prepareStatement(sql);
            ps.setString(1, encuentra.getNoincidencia());
            ps.setString(2, encuentra.getIdestado());
            ps.setString(3, encuentra.getDescripcion());
            ps.setString(4, encuentra.getFecha_registro());
            ps.setString(5, encuentra.getNºregistro());
            resultado = ps.executeUpdate() > 0;
        } catch (SQLException ex){
            System.out.println("Error al actualizar: " + ex.getMessage());
        }
        return resultado;
    }
}
