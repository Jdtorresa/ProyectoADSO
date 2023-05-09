public class join_Usuarios_Inicio {
    private String ini_hora;
    private String ini_fecha;
    private String ini_idinicio;
    private String ini_iduser;
    private String user_nombre;
    private String user_apellido;
    private String user_iduser;
    private String user_documento;


    public join_Usuarios_Inicio(String ini_hora, String ini_fecha, String ini_idinicio, String ini_iduser, String user_nombre, String user_apellido, String user_iduser, String user_documento) {
        this.ini_hora = ini_hora;
        this.ini_fecha = ini_fecha;
        this.ini_idinicio = ini_idinicio;
        this.ini_iduser = ini_iduser;
        this.user_nombre = user_nombre;
        this.user_apellido = user_apellido;
        this.user_iduser = user_iduser;
        this.user_documento = user_documento;
    }

    public join_Usuarios_Inicio() {
    }

    public String getIni_hora() {
        return ini_hora;
    }

    public void setIni_hora(String ini_hora) {
        this.ini_hora = ini_hora;
    }

    public String getIni_fecha() {
        return ini_fecha;
    }

    public void setIni_fecha(String ini_fecha) {
        this.ini_fecha = ini_fecha;
    }

    public String getIni_idinicio() {
        return ini_idinicio;
    }

    public void setIni_idinicio(String ini_idinicio) {
        this.ini_idinicio = ini_idinicio;
    }

    public String getIni_iduser() {
        return ini_iduser;
    }

    public void setIni_iduser(String ini_iduser) {
        this.ini_iduser = ini_iduser;
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

    @Override
    public String toString() {
        return "join_Usuarios_Inicio{" +
                "ini_hora='" + ini_hora + '\'' +
                ", ini_fecha='" + ini_fecha + '\'' +
                ", ini_idinicio='" + ini_idinicio + '\'' +
                ", ini_iduser='" + ini_iduser + '\'' +
                ", user_nombre='" + user_nombre + '\'' +
                ", user_apellido='" + user_apellido + '\'' +
                ", user_iduser='" + user_iduser + '\'' +
                ", user_documento='" + user_documento + '\'' +
                '}';
    }
}
