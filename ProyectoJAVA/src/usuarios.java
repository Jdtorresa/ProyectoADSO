public class usuarios {
    private String nombre;
    private String apellido;
    private String iduser;
    private String documento;

    public usuarios(String nombre, String apellido, String iduser, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.iduser = iduser;
        this.documento = documento;
    }

    public usuarios() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "usuarios{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", iduser='" + iduser + '\'' +
                ", documento='" + documento + '\'' +
                '}';
    }
}
