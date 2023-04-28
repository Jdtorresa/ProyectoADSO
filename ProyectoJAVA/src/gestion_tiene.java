import java.sql.*;
import java.util.ArrayList;

public class gestion_tiene {
    Z_conexion con= new Z_conexion();
    ArrayList<tiene> datos = new ArrayList<>();
    PreparedStatement ps=null;  // consulta con parametros
    Statement st=null;  // preparar la consulta sin parametros
    ResultSet res=null; // almacenar la consulta
    Connection conec=null; //Z_conexion


    public tiene ConsultarTiene(int nRegistro){
        tiene tien=null;
        try{
            conec=con.conecta();
            String sql="select * from tiene where N°registro=?";
            ps=conec.prepareStatement(sql);
            ps.setInt(1, nRegistro);
            res=ps.executeQuery();
            while(res.next()){
                tien=new tiene(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5));
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);
        }
        return  tien;
    }
    public ArrayList<tiene> consultarTienePorPrioridad(String prioridad){
        datos.clear();
        try{
            conec=con.conecta();
            String sql="select * from tiene where idprioridad=?";
            ps=conec.prepareStatement(sql);
            ps.setString(1, prioridad);
            res=ps.executeQuery();
            while(res.next()){
                tiene tien=new tiene(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5));
                datos.add(tien);
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }
    public ArrayList<tiene> consultarTienePorIncidencia(String noincidencia){
        datos.clear();
        try{
            conec=con.conecta();
            String sql="select * from tiene where noincidencia=?";
            ps=conec.prepareStatement(sql);
            ps.setString(1, noincidencia);
            res=ps.executeQuery();
            while(res.next()){
                tiene tien=new tiene(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5));
                datos.add(tien);
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }
    public boolean eliminarTiene(int nRegistro){
        boolean resultado=false;
        if(this.ConsultarTiene(nRegistro)!=null){
            try {
                String sql = "delete from tiene where N°registro=?";
                conec = con.conecta();
                ps=conec.prepareStatement(sql);
                ps.setInt(1, nRegistro);
                resultado = ps.executeUpdate() > 0;
            } catch (SQLException ex) {
                System.out.println("Error al eliminar: " + ex);
            }
        }else{
            System.out.println("El registro de la tabla Tiene no existe.");
        }
        return  resultado;

    }
    public boolean insertarTiene(tiene tien) {
        boolean resultado = false;
        if (this.ConsultarTiene(tien.getNºregitro())==null){
            try {
                conec = con.conecta();
                String sql = "INSERT INTO tiene (N°registro, noincidencia, idprioridad, descripcion, fecha_registro) VALUES (?,?,?,?,?)";
                ps = conec.prepareStatement(sql);
                ps.setInt(1, tien.getNºregitro());
                ps.setString(2, tien.getNoincidencia());
                ps.setString(3, tien.getIdprioridad());
                ps.setString(4, tien.getDescripcion());
                ps.setString(5, tien.getFecha_registro());
                resultado = ps.executeUpdate() > 0;
            }
            catch (SQLException ex) {
                System.out.println("No se pudo insertar el usuario: " + ex);
            }
        }else {
            System.out.println("El id " + tien.getNºregitro() + " ya existe, no se puede insertar el usuario.");
        }
        return resultado;
    }
    public boolean editarTiene(tiene tiene) {
        boolean resultado = false;
        try {
            String sql = "UPDATE tiene SET noincidencia=?, idprioridad=?, descripcion=?, fecha_registro=? WHERE N°registro=?";
            ps = conec.prepareStatement(sql);
            ps.setString(1, tiene.getNoincidencia());
            ps.setString(2, tiene.getIdprioridad());
            ps.setString(3, tiene.getDescripcion());
            ps.setTimestamp(4, Timestamp.valueOf(tiene.getFecha_registro()));
            ps.setInt(5, tiene.getNºregitro());
            resultado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("Error al actualizar: " + ex.getMessage());
        }
        return resultado;
    }



}
