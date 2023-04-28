public class encuentra {
    private String nºregistro;
    private String noincidencia;
    private String idestado;
    private String descripcion;
    private String fecha_registro;


    public encuentra(String nºregistro, String noincidencia, String idestado, String descripcion, String fecha_registro) {
        this.nºregistro = nºregistro;
        this.noincidencia = noincidencia;
        this.idestado = idestado;
        this.descripcion = descripcion;
        this.fecha_registro = fecha_registro;
    }
    public encuentra(){
    }

    public String getNºregistro() {
        return nºregistro;
    }

    public void setNºregistro(String nºregistro) {
        this.nºregistro = nºregistro;
    }

    public String getNoincidencia() {
        return noincidencia;
    }

    public void setNoincidencia(String noincidencia) {
        this.noincidencia = noincidencia;
    }

    public String getIdestado() {
        return idestado;
    }

    public void setIdestado(String idestado) {
        this.idestado = idestado;
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
        return "encuentra{" +
                "nºregistro='" + nºregistro + '\'' +
                ", noincidencia='" + noincidencia + '\'' +
                ", idestado='" + idestado + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha_registro='" + fecha_registro + '\'' +
                '}';
    }
}
