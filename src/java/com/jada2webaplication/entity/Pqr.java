package com.jada2webaplication.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pqrs")
public class Pqr implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Pqrs;
    @Column(name = "Tipo_Pqrs")
    private String Tipo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Fecha_Inicial")
    private Date fechaInicial;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Fecha_Maxima_Respuesta")
    private Date fechaMaxRespuesta;
    @Column(name = "Descripcion_Pqrs")
    private String descPqrs;
    @Column(name = "Estado")
    private String estado;
    @Column(name = "Soporte")
    private String soporte;
    
    @ManyToOne
    @JoinColumn(name = "Id_UsuarioFk", referencedColumnName = "Id_Usuario")
    private Usuario Id_Usuario;
    
    @ManyToOne
    @JoinColumn(name = "Id_VentaFk", referencedColumnName = "Id_Venta")
    private Venta Id_Venta;
    
}
