package com.lazywork.entidad;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @Column(name = "idestado", length = 20, nullable = false)
    private String idEstado;
    @Column(name = "tipo_estado", length = 50, nullable = false)
    private String tipoEstado;
    @OneToMany(mappedBy = "estado")
    private List<Encuentra> encuentras;

    public Estado(String idEstado, String tipoEstado, List<Encuentra> encuentras) {
        this.idEstado = idEstado;
        this.tipoEstado = tipoEstado;
        this.encuentras = encuentras;
    }

    public Estado() {
    }

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    public String getTipoEstado() {
        return tipoEstado;
    }

    public void setTipoEstado(String tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public List<Encuentra> getEncuentras() {
        return encuentras;
    }

    public void setEncuentras(List<Encuentra> encuentras) {
        this.encuentras = encuentras;
    }
}
