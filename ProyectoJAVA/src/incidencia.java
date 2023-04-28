public class incidencia {
    private String nombre;
    private String ubicacion;
    private String noincidencia;
    private String iduser;
    private String idprioridad;

    public incidencia(String nombre, String ubicacion, String noincidencia, String iduser, String idprioridad) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.noincidencia = noincidencia;
        this.iduser = iduser;
        this.idprioridad = idprioridad;
    }
    public incidencia(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNoincidencia() {
        return noincidencia;
    }

    public void setNoincidencia(String noincidencia) {
        this.noincidencia = noincidencia;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getIdprioridad() {
        return idprioridad;
    }

    public void setIdprioridad(String idprioridad) {
        this.idprioridad = idprioridad;
    }

    @Override
    public String toString() {
        return "incidencia{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", noincidencia=" + noincidencia +
                ", iduser=" + iduser +
                ", idprioridad='" + idprioridad + '\'' +
                '}';
    }
}
