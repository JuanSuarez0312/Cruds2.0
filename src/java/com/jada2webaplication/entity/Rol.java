package com.jada2webaplication.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Roles")
public class Rol implements Serializable{
    
    private static final long SerialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Rol;
    @Column(name = "Nombre_Rol")
    private String nombre;
    
    @OneToMany(mappedBy = "Id_Rol")
    private List<Usuario> listUsuarios;

    public Rol() {
    }

    public Rol(int Id_Rol, String nombre, List<Usuario> listUsuarios) {
        this.Id_Rol = Id_Rol;
        this.nombre = nombre;
        this.listUsuarios = listUsuarios;
    }

    public int getId_Rol() {
        return Id_Rol;
    }

    public void setId_Rol(int Id_Rol) {
        this.Id_Rol = Id_Rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(List<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }
    
    
    
}
