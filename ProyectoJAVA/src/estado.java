public class estado {
    private String idestado;
    private String tipo_estado;

    public estado(String idestado, String tipo_estado) {
        this.idestado = idestado;
        this.tipo_estado = tipo_estado;
    }
    public estado(){
    }

    public String getIdestado() {
        return idestado;
    }

    public void setIdestado(String idestado) {
        this.idestado = idestado;
    }

    public String getTipo_estado() {
        return tipo_estado;
    }

    public void setTipo_estado(String tipo_estado) {
        this.tipo_estado = tipo_estado;
    }

    @Override
    public String toString() {
        return "estado{" +
                "idestado='" + idestado + '\'' +
                ", tipo_estado='" + tipo_estado + '\'' +
                '}';
    }
}
