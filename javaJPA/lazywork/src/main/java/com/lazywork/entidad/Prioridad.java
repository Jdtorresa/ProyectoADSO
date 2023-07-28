package com.lazywork.entidad;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "prioridad")
public class Prioridad {
    @Id
    @Column(name = "idprioridad", length = 20, nullable = false)
    private String idPrioridad;
    @Column(name = "tipo_prioridad", length = 50, nullable = false)
    private String tipoPrioridad;
    @OneToMany(mappedBy = "prioridad")
    private List<Tiene> tienes;

    public Prioridad(String idPrioridad, String tipoPrioridad, List<Tiene> tienes) {
        this.idPrioridad = idPrioridad;
        this.tipoPrioridad = tipoPrioridad;
        this.tienes = tienes;
    }

    public Prioridad() {
    }

    public String getIdPrioridad() {
        return idPrioridad;
    }

    public void setIdPrioridad(String idPrioridad) {
        this.idPrioridad = idPrioridad;
    }

    public String getTipoPrioridad() {
        return tipoPrioridad;
    }

    public void setTipoPrioridad(String tipoPrioridad) {
        this.tipoPrioridad = tipoPrioridad;
    }

    public List<Tiene> getTienes() {
        return tienes;
    }

    public void setTienes(List<Tiene> tienes) {
        this.tienes = tienes;
    }
}
