package com.jada2webaplication.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "respuesta_pqrs")
public class RespuestaPqr implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Respuesta;
    @Column(name = "Descripcion_Respuesta")
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name = "Id_UsuarioFk", referencedColumnName = "Id_Usuario")
    private Usuario Id_UsuarioFk;
    
    @ManyToOne
    @JoinColumn(name = "Id_PqrsFk", referencedColumnName = "Id_Pqrs")
    private Pqr Id_PqrsFk;

    public RespuestaPqr() {
    }

    public RespuestaPqr(int Id_Respuesta, String descripcion, Usuario Id_UsuarioFk, Pqr Id_PqrsFk) {
        this.Id_Respuesta = Id_Respuesta;
        this.descripcion = descripcion;
        this.Id_UsuarioFk = Id_UsuarioFk;
        this.Id_PqrsFk = Id_PqrsFk;
    }

    public int getId_Respuesta() {
        return Id_Respuesta;
    }

    public void setId_Respuesta(int Id_Respuesta) {
        this.Id_Respuesta = Id_Respuesta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getId_UsuarioFk() {
        return Id_UsuarioFk;
    }

    public void setId_UsuarioFk(Usuario Id_UsuarioFk) {
        this.Id_UsuarioFk = Id_UsuarioFk;
    }

    public Pqr getId_PqrsFk() {
        return Id_PqrsFk;
    }

    public void setId_PqrsFk(Pqr Id_PqrsFk) {
        this.Id_PqrsFk = Id_PqrsFk;
    }
    
    
    
}
