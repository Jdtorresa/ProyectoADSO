package com.lazywork.entidad;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @Column(name = "iduser", length = 20, nullable = false)
    private String idUser;
    @Column(length = 30, nullable = false)
    private String nombre;
    @Column(length = 30, nullable = false)
    private String apellido;
    @Column(length = 50, nullable = false)
    private String documento;
    @OneToMany(mappedBy = "usuario")
    private List<Inicio> inicios;
    @OneToMany(mappedBy = "usuario")
    private List<Incidencia> incidencias;

    public Usuario(String idUser, String nombre, String apellido, String documento, List<Inicio> inicios, List<Incidencia> incidencias) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.inicios = inicios;
        this.incidencias = incidencias;
    }

    public Usuario() {
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public List<Inicio> getInicios() {
        return inicios;
    }

    public void setInicios(List<Inicio> inicios) {
        this.inicios = inicios;
    }

    public List<Incidencia> getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(List<Incidencia> incidencias) {
        this.incidencias = incidencias;
    }
}