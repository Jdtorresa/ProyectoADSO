public class join_Incidencia_Usuarios {
    private String user_nombre;
    private String user_apellido;
    private String user_iduser;
    private String user_documento;
    private String inci_nombre;
    private String inci_ubicacion;
    private String inci_noincidencia;
    private String inci_iduser;
    private String inci_idprioridad;

    public join_Incidencia_Usuarios(String user_nombre, String user_apellido, String user_iduser, String user_documento, String inci_nombre, String inci_ubicacion, String inci_noincidencia, String inci_iduser, String inci_idprioridad) {
        this.user_nombre = user_nombre;
        this.user_apellido = user_apellido;
        this.user_iduser = user_iduser;
        this.user_documento = user_documento;
        this.inci_nombre = inci_nombre;
        this.inci_ubicacion = inci_ubicacion;
        this.inci_noincidencia = inci_noincidencia;
        this.inci_iduser = inci_iduser;
        this.inci_idprioridad = inci_idprioridad;
    }

    public join_Incidencia_Usuarios() {
    }

    public String getUser_nombre() {
        return user_nombre;
    }

    public void setUser_nombre(String user_nombre) {
        this.user_nombre = user_nombre;
    }

    public String getUser_apellido() {
        return user_apellido;
    }

    public void setUser_apellido(String user_apellido) {
        this.user_apellido = user_apellido;
    }

    public String getUser_iduser() {
        return user_iduser;
    }

    public void setUser_iduser(String user_iduser) {
        this.user_iduser = user_iduser;
    }

    public String getUser_documento() {
        return user_documento;
    }

    public void setUser_documento(String user_documento) {
        this.user_documento = user_documento;
    }

    public String getInci_nombre() {
        return inci_nombre;
    }

    public void setInci_nombre(String inci_nombre) {
        this.inci_nombre = inci_nombre;
    }

    public String getInci_ubicacion() {
        return inci_ubicacion;
    }

    public void setInci_ubicacion(String inci_ubicacion) {
        this.inci_ubicacion = inci_ubicacion;
    }

    public String getInci_noincidencia() {
        return inci_noincidencia;
    }

    public void setInci_noincidencia(String inci_noincidencia) {
        this.inci_noincidencia = inci_noincidencia;
    }

    public String getInci_iduser() {
        return inci_iduser;
    }

    public void setInci_iduser(String inci_iduser) {
        this.inci_iduser = inci_iduser;
    }

    public String getInci_idprioridad() {
        return inci_idprioridad;
    }

    public void setInci_idprioridad(String inci_idprioridad) {
        this.inci_idprioridad = inci_idprioridad;
    }

    @Override
    public String toString() {
        return "join_Incidencia_Usuarios{" +
                "user_nombre='" + user_nombre + '\'' +
                ", user_apellido='" + user_apellido + '\'' +
                ", user_iduser='" + user_iduser + '\'' +
                ", user_documento='" + user_documento + '\'' +
                ", inci_nombre='" + inci_nombre + '\'' +
                ", inci_ubicacion='" + inci_ubicacion + '\'' +
                ", inci_noincidencia='" + inci_noincidencia + '\'' +
                ", inci_iduser='" + inci_iduser + '\'' +
                ", inci_idprioridad='" + inci_idprioridad + '\'' +
                '}';
    }
}
