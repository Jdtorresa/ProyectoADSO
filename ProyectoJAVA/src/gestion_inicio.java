import java.sql.*;
import java.util.ArrayList;

public class gestion_inicio {
    Z_conexion con= new Z_conexion();
    ArrayList<inicio> datos = new ArrayList<>();
    PreparedStatement ps=null;  // consulta con parametros
    Statement st=null;  // preparar la consulta sin parametros
    ResultSet res=null; // almacenar la consulta
    Connection conec=null; //Z_conexion

    public inicio ConsultarInicio(int idinicio){
        inicio inic=null;
        try{
            conec=con.conecta();
            String sql="select * from inicio where idinicio=?";
            ps=conec.prepareStatement(sql);
            ps.setInt(1, idinicio);
            res=ps.executeQuery();
            while(res.next()){
                inic=new inicio(res.getString(1), res.getString(2), res.getInt(3), res.getString(4));
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);
        }
        return  inic;
    }
    public ArrayList<inicio> consultarIniciosPorUsuario(String iduser){
        datos.clear();
        try {
            conec=con.conecta();
            String sql="select * from inicio where iduser=?";
            ps=conec.prepareStatement(sql);
            ps.setString(1, iduser);
            res=ps.executeQuery();
            while (res.next()){
                inicio inic=new inicio(res.getString(1), res.getString(2), res.getInt(3), res.getString(4));
                datos.add(inic);
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }

    public inicio C1 (String fecha){
        inicio inic = null;
        try{
            conec=con.conecta();
            String sql = "select * from inicio where fecha = ?";
            ps=conec.prepareStatement(sql);
            ps.setString(1, fecha);
            res= ps.executeQuery();
            while(res.next()){
                inic = new inicio(res.getString(1),res.getString(2),res.getInt(3),res.getString(4));
            }

        }catch (Exception ex){
            System.out.println("Error al consultar: "+ex);
        }
        return inic;
    }
    public boolean eliminarInicio(int idInicio){
        boolean resultado=false;
        if(this.ConsultarInicio(idInicio)!=null){
            try{
                conec=con.conecta();
                String sql="delete from inicio where idInicio=?";
                ps=conec.prepareStatement(sql);
                ps.setInt(1, idInicio);
                resultado=ps.executeUpdate()>0;
            }catch (SQLException ex){}
        }else{
            System.out.println("El id de inicio "+idInicio+" no existe, por lo tanto, no se puede eliminar.");
        }
        return resultado;
    }

    public boolean insertarInicio(inicio inic) {
        boolean resultado = false;
        try {
            conec = con.conecta();
            String sql = "INSERT INTO inicio (hora, fecha, idinicio, iduser) VALUES (?,?,?,?)";
            ps = conec.prepareStatement(sql);
            ps.setString(1, inic.getHora());
            ps.setString(2, inic.getFecha());
            ps.setInt(3, inic.getIdinicio());
            ps.setString(4, inic.getIduser());
            resultado = ps.executeUpdate() > 0;
        }
        catch (SQLException ex) {
            System.out.println("No se pudo insertar el usuario: " + ex);
        }
        return resultado;
    }
    public boolean editarInicio(inicio inicio) {
        boolean resultado = false;
        try {
            String sql = "UPDATE inicio SET hora=?, fecha=?, iduser=? WHERE idinicio=?";
            ps = conec.prepareStatement(sql);
            ps.setString(1, inicio.getHora());
            ps.setString(2, inicio.getFecha());
            ps.setString(3, inicio.getIduser());
            ps.setInt(4, inicio.getIdinicio());
            resultado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("Error al actualizar: " + ex.getMessage());
        }
        return resultado;
    }
}
