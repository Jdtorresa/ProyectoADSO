public class tiene {
    private String Nºregitro;
    private String noincidencia;
    private String idprioridad;
    private String descripcion;
    private String fecha_registro;

    public tiene(String nºregitro, String noincidencia, String idprioridad, String descripcion, String fecha_registro) {
        Nºregitro = nºregitro;
        this.noincidencia = noincidencia;
        this.idprioridad = idprioridad;
        this.descripcion = descripcion;
        this.fecha_registro = fecha_registro;
    }

    public tiene() {
    }

    public String getNºregitro() {
        return Nºregitro;
    }

    public void setNºregitro(String nºregitro) {
        Nºregitro = nºregitro;
    }

    public String getNoincidencia() {
        return noincidencia;
    }

    public void setNoincidencia(String noincidencia) {
        this.noincidencia = noincidencia;
    }

    public String getIdprioridad() {
        return idprioridad;
    }

    public void setIdprioridad(String idprioridad) {
        this.idprioridad = idprioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
    public String toString() {
        return "tiene{" +
                "Nºregitro='" + Nºregitro + '\'' +
                ", noincidencia='" + noincidencia + '\'' +
                ", idprioridad='" + idprioridad + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha_registro='" + fecha_registro + '\'' +
                '}';
    }
}
