public class prioridad {
    private String idprioridad;
    private String tipo_prioridad;

    public prioridad(String idprioridad, String tipo_prioridad) {
        this.idprioridad = idprioridad;
        this.tipo_prioridad = tipo_prioridad;
    }
    public prioridad() {
    }

    public String getIdprioridad() {
        return idprioridad;
    }

    public void setIdprioridad(String idprioridad) {
        this.idprioridad = idprioridad;
    }

    public String getTipo_prioridad() {
        return tipo_prioridad;
    }

    public void setTipo_prioridad(String tipo_prioridad) {
        this.tipo_prioridad = tipo_prioridad;
    }

    @Override
    public String toString() {
        return "prioridad{" +
                "idprioridad='" + idprioridad + '\'' +
                ", tipo_prioridad='" + tipo_prioridad + '\'' +
                '}';
    }
}
