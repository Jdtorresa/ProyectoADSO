public class inicio {
    private String hora;
    private String fecha;
    private int idinicio;
    private String iduser;

    public inicio(String hora, String fecha, int idinicio, String iduser) {
        this.hora = hora;
        this.fecha = fecha;
        this.idinicio = idinicio;
        this.iduser = iduser;
    }
    public inicio(){
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdinicio() {
        return idinicio;
    }

    public void setIdinicio(int idinicio) {
        this.idinicio = idinicio;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    @Override
    public String toString() {
        return "inicio{" +
                "hora='" + hora + '\'' +
                ", fecha='" + fecha + '\'' +
                ", idinicio=" + idinicio +
                ", iduser=" + iduser +
                '}';
    }
}
