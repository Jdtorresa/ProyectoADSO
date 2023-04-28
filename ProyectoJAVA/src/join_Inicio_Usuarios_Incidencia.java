public class join_Inicio_Usuarios_Incidencia {
    // TABLA INICIO
    private String inicio_hora;
    private String inicio_fecha;
    private  int inicio_idinicio;
    private  int inicio_iduser;
    // TABLA USUARIOS
    private String usuarios_nombre;
    private String usuarios_apellido;
    private  int usuarios_iduser;
    private  int usuarios_documento;
    // TABLA INCIDENCIA
    private String incidencia_nombre;
    private String incidencia_ubicacion;
    private  int incidencia_noincidencia;
    private  int incidencia_iduser;
    private String incidencia_idprioridad;

    public join_Inicio_Usuarios_Incidencia(String inicio_hora, String inicio_fecha, int inicio_idinicio, int inicio_iduser, String usuarios_nombre, String usuarios_apellido, int usuarios_iduser, int usuarios_documento, String incidencia_nombre, String incidencia_ubicacion, int incidencia_noincidencia, int incidencia_iduser, String incidencia_idprioridad) {
        this.inicio_hora = inicio_hora;
        this.inicio_fecha = inicio_fecha;
        this.inicio_idinicio = inicio_idinicio;
        this.inicio_iduser = inicio_iduser;
        this.usuarios_nombre = usuarios_nombre;
        this.usuarios_apellido = usuarios_apellido;
        this.usuarios_iduser = usuarios_iduser;
        this.usuarios_documento = usuarios_documento;
        this.incidencia_nombre = incidencia_nombre;
        this.incidencia_ubicacion = incidencia_ubicacion;
        this.incidencia_noincidencia = incidencia_noincidencia;
        this.incidencia_iduser = incidencia_iduser;
        this.incidencia_idprioridad = incidencia_idprioridad;
    }

    public join_Inicio_Usuarios_Incidencia() {
    }

    public String getInicio_hora() {
        return inicio_hora;
    }

    public void setInicio_hora(String inicio_hora) {
        this.inicio_hora = inicio_hora;
    }

    public String getInicio_fecha() {
        return inicio_fecha;
    }

    public void setInicio_fecha(String inicio_fecha) {
        this.inicio_fecha = inicio_fecha;
    }

    public int getInicio_idinicio() {
        return inicio_idinicio;
    }

    public void setInicio_idinicio(int inicio_idinicio) {
        this.inicio_idinicio = inicio_idinicio;
    }

    public int getInicio_iduser() {
        return inicio_iduser;
    }

    public void setInicio_iduser(int inicio_iduser) {
        this.inicio_iduser = inicio_iduser;
    }

    public String getUsuarios_nombre() {
        return usuarios_nombre;
    }

    public void setUsuarios_nombre(String usuarios_nombre) {
        this.usuarios_nombre = usuarios_nombre;
    }

    public String getUsuarios_apellido() {
        return usuarios_apellido;
    }

    public void setUsuarios_apellido(String usuarios_apellido) {
        this.usuarios_apellido = usuarios_apellido;
    }

    public int getUsuarios_iduser() {
        return usuarios_iduser;
    }

    public void setUsuarios_iduser(int usuarios_iduser) {
        this.usuarios_iduser = usuarios_iduser;
    }

    public int getUsuarios_documento() {
        return usuarios_documento;
    }

    public void setUsuarios_documento(int usuarios_documento) {
        this.usuarios_documento = usuarios_documento;
    }

    public String getIncidencia_nombre() {
        return incidencia_nombre;
    }

    public void setIncidencia_nombre(String incidencia_nombre) {
        this.incidencia_nombre = incidencia_nombre;
    }

    public String getIncidencia_ubicacion() {
        return incidencia_ubicacion;
    }

    public void setIncidencia_ubicacion(String incidencia_ubicacion) {
        this.incidencia_ubicacion = incidencia_ubicacion;
    }

    public int getIncidencia_noincidencia() {
        return incidencia_noincidencia;
    }

    public void setIncidencia_noincidencia(int incidencia_noincidencia) {
        this.incidencia_noincidencia = incidencia_noincidencia;
    }

    public int getIncidencia_iduser() {
        return incidencia_iduser;
    }

    public void setIncidencia_iduser(int incidencia_iduser) {
        this.incidencia_iduser = incidencia_iduser;
    }

    public String getIncidencia_idprioridad() {
        return incidencia_idprioridad;
    }

    public void setIncidencia_idprioridad(String incidencia_idprioridad) {
        this.incidencia_idprioridad = incidencia_idprioridad;
    }

    @Override
    public String toString() {
        return "join_Inicio_Usuarios_Incidencia{" +
                "inicio_hora='" + inicio_hora + '\'' +
                ", inicio_fecha='" + inicio_fecha + '\'' +
                ", inicio_idinicio=" + inicio_idinicio +
                ", inicio_iduser=" + inicio_iduser +
                ", usuarios_nombre='" + usuarios_nombre + '\'' +
                ", usuarios_apellido='" + usuarios_apellido + '\'' +
                ", usuarios_iduser=" + usuarios_iduser +
                ", usuarios_documento=" + usuarios_documento +
                ", incidencia_nombre='" + incidencia_nombre + '\'' +
                ", incidencia_ubicacion='" + incidencia_ubicacion + '\'' +
                ", incidencia_noincidencia=" + incidencia_noincidencia +
                ", incidencia_iduser=" + incidencia_iduser +
                ", incidencia_idprioridad='" + incidencia_idprioridad + '\'' +
                '}';
    }
}
