import java.sql.*;
import java.util.ArrayList;

public class  gestion_incidencia {
    Z_conexion con= new Z_conexion();
    ArrayList<incidencia> datos = new ArrayList<>();
    PreparedStatement ps=null;  // consulta con parametros
    Statement st=null;  // preparar la consulta sin parametros
    ResultSet res=null; // almacenar la consulta
    Connection conec=null; //Z_conexion

    public incidencia consultarIncidencia(String NoIncidencia){

        incidencia inci=null;
        try{
            conec=con.conecta();
            String sql="select * from incidencia where noincidencia=?";
            ps=conec.prepareStatement(sql);
            ps.setString(1, NoIncidencia);
            res=ps.executeQuery();
            while(res.next()){
                inci=new incidencia(res.getString(1),res.getString(2), res.getString(3), res.getString(4), res.getString(5));
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);

        }
        return  inci;
    }

    public ArrayList<incidencia> C1 (String fecha){
        datos.clear();
        try{
            conec=con.conecta();
            String sql = "select * from incidencia inner join inicio on incidencia.iduser = inicio.iduser where inicio.fecha = ?";
            ps=conec.prepareStatement(sql);
            ps.setString(1, fecha);
            res= ps.executeQuery();
            while(res.next()){
                incidencia inci = new incidencia(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5));
                datos.add(inci);
            }

        }catch (Exception ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }
    public ArrayList<incidencia> C2(String prioridad){
        datos.clear();
        try{
            conec=con.conecta();
            String sql = "select * from incidencia where idprioridad = ?";
            ps=conec.prepareStatement(sql);
            ps.setString(1, prioridad);
            res= ps.executeQuery();
            while(res.next()){
                incidencia inci = new incidencia(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5));
                datos.add(inci);
            }
        }catch (Exception ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }
    public ArrayList<incidencia> C3(String estado){
        datos.clear();
        try{
            conec=con.conecta();
            String sql = "select * from incidencia, encuentra where\n" +
                    "    incidencia.noincidencia=encuentra.noincidencia and idestado=?";
            ps=conec.prepareStatement(sql);
            ps.setString(1, estado);
            res= ps.executeQuery();
            while(res.next()){
                incidencia inci = new incidencia(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5));
                datos.add(inci);
            }
        }catch (Exception ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }
    public ArrayList<incidencia> C4(String estado){
        datos.clear();
        try{
            conec=con.conecta();
            String sql = "select * from incidencia, encuentra where\n" +
                    "    incidencia.noincidencia=encuentra.noincidencia and idestado=?";
            ps=conec.prepareStatement(sql);
            ps.setString(1, estado);
            res= ps.executeQuery();
            while(res.next()){
                incidencia inci = new incidencia(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5));
                datos.add(inci);
            }
        }catch (Exception ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }

    public boolean eliminarIncidencia(String noIncidencia){
        boolean resultado=false;
        if(this.consultarIncidencia(noIncidencia)!=null){
            gestion_tiene tieneGest=new gestion_tiene();
            if(tieneGest.consultarTienePorIncidencia(noIncidencia).size()==0) {
                gestion_encuentra encuentraGest=new gestion_encuentra();
                if(encuentraGest.consultarEncuentraPorIncidencia(noIncidencia)==null) {
                    try {
                        String sql = "delete from incidencia where noincidencia=?";
                        conec = con.conecta();
                        ps = conec.prepareStatement(sql);
                        ps.setString(1, noIncidencia);
                        resultado = ps.executeUpdate() > 0;
                    } catch (SQLException ex) {
                        System.out.println("Error al eliminar: " + ex);
                    }
                }else{
                    System.out.println("La incidencia se encuentra en la tabla Encuentra, NO se puede eliminar");
                }
            }else{
                System.out.println("La incidencia se encuentra en la tabla Tiene, NO se puede eliminar");
            }
        }else{
            System.out.println("El numero de la incidencia no existe.");
        }
        return  resultado;

    }
    public boolean insertarIncidencia(incidencia incidencia) {
        boolean resultado = false;
        try {
            conec = con.conecta();
            String sql = "INSERT INTO incidencia (nombre, ubicacion, noincidencia, iduser, idprioridad) VALUES (?, ?, ?, ?, ?)";
            ps = conec.prepareStatement(sql);
            ps.setString(1, incidencia.getNombre());
            ps.setString(2, incidencia.getUbicacion());
            ps.setString(3, incidencia.getNoincidencia());
            ps.setString(4, incidencia.getIduser());
            ps.setString(5, incidencia.getIdprioridad());
            resultado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("No se pudo insertar la incidencia: " + ex);
        }
        return resultado;
    }
    public boolean editarIncidencia(incidencia incidencia) {
        boolean resultado = false;
        try {
            String sql = "UPDATE incidencia SET nombre=?, ubicacion=?, iduser=?, idprioridad=? WHERE noincidencia=?";
            ps = conec.prepareStatement(sql);
            ps.setString(1, incidencia.getNombre());
            ps.setString(2, incidencia.getUbicacion());
            ps.setString(3, incidencia.getIduser());
            ps.setString(4, incidencia.getIdprioridad());
            ps.setString(5, incidencia.getNoincidencia());
            resultado = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("Error al actualizar: " + ex.getMessage());
        }
        return resultado;
    }

    public incidencia consultarIncidenciaPorPrioridad(String idprioridad){
        incidencia inci=null;
        try{
            conec=con.conecta();
            String sql="select * from incidencia where idprioridad=?";
            ps=conec.prepareStatement(sql);
            ps.setString(1, idprioridad);
            res=ps.executeQuery();
            while(res.next()){
                inci=new incidencia(res.getString(1),res.getString(2), res.getString(3), res.getString(4), res.getString(5));
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);

        }
        return  inci;
    }

}
