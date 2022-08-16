package com.jada2webaplication.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ventas")
public class Venta implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Venta;
    @Column(name = "Numero_Factura")
    private int numFactura;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Fecha_Venta")
    private Date fechaVenta;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Fecha_Entrega")
    private Date fechaEntrega;
    @Column(name = "Cantidad")
    private int cantidad;
    @Column(name = "Total_Por_Producto")
    private Double Total;
    
    @ManyToOne
    @JoinColumn(name = "idProductoFk",referencedColumnName = "IdProducto")
    private Producto idProductoFk;
            
    @ManyToOne
    @JoinColumn(name = "idPagoFk",referencedColumnName = "IdPago")
    private Pago idPagoFk;
    
    @OneToMany(mappedBy = "Id_Venta")
    private List<Pqr> listPqrs;

    public Venta() {
    }

    public Venta(int id, int numFactura, Date fechaVenta, Date fechaEntrega, int cantidad, Double Total, Producto idProductoFk, Pago idPagoFk, List<Pqr> listPqrs) {
        this.Id_Venta = id;
        this.numFactura = numFactura;
        this.fechaVenta = fechaVenta;
        this.fechaEntrega = fechaEntrega;
        this.cantidad = cantidad;
        this.Total = Total;
        this.idProductoFk = idProductoFk;
        this.idPagoFk = idPagoFk;
        this.listPqrs = listPqrs;
    }

    public int getId() {
        return Id_Venta;
    }

    public void setId(int id) {
        this.Id_Venta = id;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public Producto getIdProductoFk() {
        return idProductoFk;
    }

    public void setIdProductoFk(Producto idProductoFk) {
        this.idProductoFk = idProductoFk;
    }

    public Pago getIdPagoFk() {
        return idPagoFk;
    }

    public void setIdPagoFk(Pago idPagoFk) {
        this.idPagoFk = idPagoFk;
    }

    public List<Pqr> getListPqrs() {
        return listPqrs;
    }

    public void setListPqrs(List<Pqr> listPqrs) {
        this.listPqrs = listPqrs;
    }
    
    
    
}
