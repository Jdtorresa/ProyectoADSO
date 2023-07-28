package com.lazywork.entidad;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "incidencias")
public class Incidencia {
    @Id
    @Column(name = "noincidencia", length = 20, nullable = false)
    private String noIncidencia;
    @Column(length = 50, nullable = false)
    private String nombre;
    @Column(length = 50, nullable = false)
    private String ubicacion;
    @ManyToOne
    @JoinColumn(name = "iduser", referencedColumnName = "idUser", nullable = false)
    private Usuario usuario;
    @OneToMany(mappedBy = "incidencia")
    private List<Encuentra> encuentras;
    @OneToMany(mappedBy = "incidencia")
    private List<Tiene> tienes;

    public Incidencia(String noIncidencia, String nombre, String ubicacion, Usuario usuario, List<Encuentra> encuentras, List<Tiene> tienes) {
        this.noIncidencia = noIncidencia;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.usuario = usuario;
        this.encuentras = encuentras;
        this.tienes = tienes;
    }

    public Incidencia() {
    }

    public String getNoIncidencia() {
        return noIncidencia;
    }

    public void setNoIncidencia(String noIncidencia) {
        this.noIncidencia = noIncidencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Encuentra> getEncuentras() {
        return encuentras;
    }

    public void setEncuentras(List<Encuentra> encuentras) {
        this.encuentras = encuentras;
    }

    public List<Tiene> getTienes() {
        return tienes;
    }

    public void setTienes(List<Tiene> tienes) {
        this.tienes = tienes;
    }
}
