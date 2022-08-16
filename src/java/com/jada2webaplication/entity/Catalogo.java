package com.jada2webaplication.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "catalogo")
public class Catalogo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Catalogo;
    @Column(name = "Nombre_Catalogo")
    private String nomCatalogo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Fecha_Inicio_Catalogo")
    private Date fechaIni;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Fecha_Fin_Catalogo")
    private Date fechaFin;
    
    @OneToMany (mappedBy = "Id_Catalogo")
    private List<Producto> listProductos;
    
    
}
