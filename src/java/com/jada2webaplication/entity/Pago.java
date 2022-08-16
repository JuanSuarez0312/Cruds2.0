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
@Table(name = "")
public class Pago implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Pago;
    @Column(name = "Metodo_Pago")
    private String metodo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Fecha_Pago")
    private Date fecha_pago;
    @Column(name = "Total_Factura")
    private Float total;
    
    @ManyToOne
    @JoinColumn(name = "Id_UsuarioFk",referencedColumnName = "Id_Usuario")
    private Usuario Id_UsuarioFk;

    public Pago() {
    }

    public Pago(int Id_Pago, String metodo, Date fecha_pago, Float total, Usuario Id_UsuarioFk) {
        this.Id_Pago = Id_Pago;
        this.metodo = metodo;
        this.fecha_pago = fecha_pago;
        this.total = total;
        this.Id_UsuarioFk = Id_UsuarioFk;
    }

    public int getId_Pago() {
        return Id_Pago;
    }

    public void setId_Pago(int Id_Pago) {
        this.Id_Pago = Id_Pago;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Usuario getId_UsuarioFk() {
        return Id_UsuarioFk;
    }

    public void setId_UsuarioFk(Usuario Id_UsuarioFk) {
        this.Id_UsuarioFk = Id_UsuarioFk;
    }
    
    
    
}
