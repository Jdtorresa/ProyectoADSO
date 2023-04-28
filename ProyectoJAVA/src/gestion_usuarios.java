import java.sql.*;
import java.util.ArrayList;

public class gestion_usuarios {
    Z_conexion con= new Z_conexion();
    ArrayList<usuarios> datos = new ArrayList<>();
    PreparedStatement ps=null;  // consulta con parametros
    Statement st=null;  // preparar la consulta sin parametros
    ResultSet res=null; // almacenar la consulta
    Connection conec=null; //Z_conexion

    public usuarios consultarUsuarios(String iduser){
        usuarios user=null;
        try{
            conec=con.conecta();
            String sql="select * from usuarios where iduser=?";
            ps=conec.prepareStatement(sql);
            ps.setString(1, iduser);
            res=ps.executeQuery();
            while(res.next()){
                user= new usuarios(res.getString(1), res.getString(2), res.getString(3), res.getInt(4));
            }
        }catch (SQLException ex){
            System.out.println("Error al consutlar: "+ex );
        }
        return user;
    }
    public ArrayList<usuarios> C1(String prioridad){
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
                usuarios usua = new usuarios(res.getString(1), res.getString(2), res.getString(3), res.getInt(4));
                datos.add(usua);
            }
        }catch (Exception ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }

    public boolean eliminarUsuario(String iduser){
        boolean resultado=false;
        if(this.consultarUsuarios(iduser)!=null){
            gestion_inicio gestionarInicio=new gestion_inicio();
            if(gestionarInicio.consultarIniciosPorUsuario(iduser).size()==0) {
                try {
                    conec = con.conecta();
                    String sql = "delete from usuarios where iduser=?";
                    ps=conec.prepareStatement(sql);
                    ps.setString(1, iduser);
                    resultado = ps.executeUpdate() > 0;
                } catch (SQLException ex) {
                    System.out.println("No se pudo eliminar el usuario: " + ex);
                }
            }else{
                System.out.println("No se puede eliminar el usuario, ya que, se encuentra dentro de la tabla inicios.");
            }
        }else{
            System.out.println("El id "+iduser+" no existe, por lo tanto, no se puede eliminar.");
        }
        return resultado;
    }
    public boolean insertarUsuario(usuarios user) {
        boolean resultado = false;
        if (this.consultarUsuarios(user.getIduser()) == null) {
            try {
                    conec = con.conecta();
                    String sql = "INSERT INTO usuarios (nombre, apellido, iduser, documento) VALUES (?, ?, ?, ?)";
                    ps = conec.prepareStatement(sql);
                    ps.setString(1, user.getNombre());
                    ps.setString(2, user.getApellido());
                    ps.setString(3, user.getIduser());
                    ps.setInt(4, user.getDocumento());
                    resultado = ps.executeUpdate() > 0;
                }
            catch (SQLException ex) {
                System.out.println("No se pudo insertar el usuario: " + ex);
            }
        }else {
            System.out.println("El id " + user.getIduser() + " ya existe, no se puede insertar el usuario.");
        }
        return resultado;
    }

    public boolean editarUsuarios(usuarios usu) {
        boolean resultado = false;
                try {
                    String sql = "UPDATE usuarios SET nombre=?, apellido=?, documento=? WHERE iduser=?";
                    ps = conec.prepareStatement(sql);
                    ps.setString(1, usu.getNombre());
                    ps.setString(2, usu.getApellido());
                    ps.setInt(3, usu.getDocumento());
                    ps.setString(4, usu.getIduser());
                    resultado = ps.executeUpdate() > 0;
                }catch (SQLException ex) {
                    System.out.println("Error al actualizar: " + ex.getMessage());
                }
                return resultado;
    }

}
