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
@Table(name = "promociones")
public class Promocion implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Producto;
    @Column(name = "Descuento")
    private Float descuento;
    @Column(name = "Puntos_Necesarios")
    private int puntosNecesarios;
    
    @ManyToOne
    @JoinColumn(name = "Id_ProductosFk", referencedColumnName = "Id_Productos")
    private Producto Id_ProductosFk;
}
