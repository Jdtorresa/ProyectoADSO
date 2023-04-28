public class join_Encuentra_Incidencia_Tiene_Prioridad {
    // TABLA ENCUENTRA
    private int encuentra_Nºregistro;
    private int encuentra_noincidencia;
    private String encuentra_idestado;
    private String encuentra_descripcion;
    private String encuentra_fecha_registro;

    // TABLA INCIDENCIA
    private String incidencia_nombre;
    private String incidencia_ubicacion;
    private int incidencia_noincidencia;
    private int incidencia_iduser;
    private String incidencia_idprioridad;
    // TABLA TIENE
    private int tiene_Nºregistro;
    private int tiene_noincidencia;
    private String tiene_idprioridad;
    private String tiene_descripcion;
    private String tiene_fecha_registro;
    // TABLA PRIORIDAD
    private String prioridad_idprioridad;
    private String prioridad_tipo_prioridad;


    public join_Encuentra_Incidencia_Tiene_Prioridad(int encuentra_Nºregistro, int encuentra_noincidencia, String encuentra_idestado, String encuentra_descripcion, String encuentra_fecha_registro, String incidencia_nombre, String incidencia_ubicacion, int incidencia_noincidencia, int incidencia_iduser, String incidencia_idprioridad, int tiene_Nºregistro, int tiene_noincidencia, String tiene_idprioridad, String tiene_descripcion, String tiene_fecha_registro, String prioridad_idprioridad, String prioridad_tipo_prioridad) {
        this.encuentra_Nºregistro = encuentra_Nºregistro;
        this.encuentra_noincidencia = encuentra_noincidencia;
        this.encuentra_idestado = encuentra_idestado;
        this.encuentra_descripcion = encuentra_descripcion;
        this.encuentra_fecha_registro = encuentra_fecha_registro;
        this.incidencia_nombre = incidencia_nombre;
        this.incidencia_ubicacion = incidencia_ubicacion;
        this.incidencia_noincidencia = incidencia_noincidencia;
        this.incidencia_iduser = incidencia_iduser;
        this.incidencia_idprioridad = incidencia_idprioridad;
        this.tiene_Nºregistro = tiene_Nºregistro;
        this.tiene_noincidencia = tiene_noincidencia;
        this.tiene_idprioridad = tiene_idprioridad;
        this.tiene_descripcion = tiene_descripcion;
        this.tiene_fecha_registro = tiene_fecha_registro;
        this.prioridad_idprioridad = prioridad_idprioridad;
        this.prioridad_tipo_prioridad = prioridad_tipo_prioridad;
    }

    public join_Encuentra_Incidencia_Tiene_Prioridad() {
    }

    public int getEncuentra_Nºregistro() {
        return encuentra_Nºregistro;
    }

    public void setEncuentra_Nºregistro(int encuentra_Nºregistro) {
        this.encuentra_Nºregistro = encuentra_Nºregistro;
    }

    public int getEncuentra_noincidencia() {
        return encuentra_noincidencia;
    }

    public void setEncuentra_noincidencia(int encuentra_noincidencia) {
        this.encuentra_noincidencia = encuentra_noincidencia;
    }

    public String getEncuentra_idestado() {
        return encuentra_idestado;
    }

    public void setEncuentra_idestado(String encuentra_idestado) {
        this.encuentra_idestado = encuentra_idestado;
    }

    public String getEncuentra_descripcion() {
        return encuentra_descripcion;
    }

    public void setEncuentra_descripcion(String encuentra_descripcion) {
        this.encuentra_descripcion = encuentra_descripcion;
    }

    public String getEncuentra_fecha_registro() {
        return encuentra_fecha_registro;
    }

    public void setEncuentra_fecha_registro(String encuentra_fecha_registro) {
        this.encuentra_fecha_registro = encuentra_fecha_registro;
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

    public int getTiene_Nºregistro() {
        return tiene_Nºregistro;
    }

    public void setTiene_Nºregistro(int tiene_Nºregistro) {
        this.tiene_Nºregistro = tiene_Nºregistro;
    }

    public int getTiene_noincidencia() {
        return tiene_noincidencia;
    }

    public void setTiene_noincidencia(int tiene_noincidencia) {
        this.tiene_noincidencia = tiene_noincidencia;
    }

    public String getTiene_idprioridad() {
        return tiene_idprioridad;
    }

    public void setTiene_idprioridad(String tiene_idprioridad) {
        this.tiene_idprioridad = tiene_idprioridad;
    }

    public String getTiene_descripcion() {
        return tiene_descripcion;
    }

    public void setTiene_descripcion(String tiene_descripcion) {
        this.tiene_descripcion = tiene_descripcion;
    }

    public String getTiene_fecha_registro() {
        return tiene_fecha_registro;
    }

    public void setTiene_fecha_registro(String tiene_fecha_registro) {
        this.tiene_fecha_registro = tiene_fecha_registro;
    }

    public String getPrioridad_idprioridad() {
        return prioridad_idprioridad;
    }

    public void setPrioridad_idprioridad(String prioridad_idprioridad) {
        this.prioridad_idprioridad = prioridad_idprioridad;
    }

    public String getPrioridad_tipo_prioridad() {
        return prioridad_tipo_prioridad;
    }

    public void setPrioridad_tipo_prioridad(String prioridad_tipo_prioridad) {
        this.prioridad_tipo_prioridad = prioridad_tipo_prioridad;
    }

    @Override
    public String toString() {
        return "join_Encuentra_Incidencia_Tiene_Prioridad{" +
                "encuentra_Nºregistro=" + encuentra_Nºregistro +
                ", encuentra_noincidencia=" + encuentra_noincidencia +
                ", encuentra_idestado='" + encuentra_idestado + '\'' +
                ", encuentra_descripcion='" + encuentra_descripcion + '\'' +
                ", encuentra_fecha_registro='" + encuentra_fecha_registro + '\'' +
                ", incidencia_nombre='" + incidencia_nombre + '\'' +
                ", incidencia_ubicacion='" + incidencia_ubicacion + '\'' +
                ", incidencia_noincidencia=" + incidencia_noincidencia +
                ", incidencia_iduser=" + incidencia_iduser +
                ", incidencia_idprioridad='" + incidencia_idprioridad + '\'' +
                ", tiene_Nºregistro=" + tiene_Nºregistro +
                ", tiene_noincidencia=" + tiene_noincidencia +
                ", tiene_idprioridad='" + tiene_idprioridad + '\'' +
                ", tiene_descripcion='" + tiene_descripcion + '\'' +
                ", tiene_fecha_registro='" + tiene_fecha_registro + '\'' +
                ", prioridad_idprioridad='" + prioridad_idprioridad + '\'' +
                ", prioridad_tipo_prioridad='" + prioridad_tipo_prioridad + '\'' +
                '}';
    }
}
