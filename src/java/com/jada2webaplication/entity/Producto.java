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
@Table(name = "producto")
public class Producto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Producto;
    @Column(name = "Nombre_Producto")
    private String nomProd;
    @Column(name = "Descripcion_Producto")
    private String descProd;
    @Column(name = "Precio")
    private int precio;
    @Column(name = "Cantidad_Stock")
    private int cantStock;
    
    @OneToMany(mappedBy = "Id_Producto")
    private List<Venta> listVenta;
    
    @ManyToOne
    @JoinColumn(name = "Id_CatalogoFk", referencedColumnName = "Id_Catalogo")
    private Catalogo Id_CatalogoFk;

    public Producto() {
    }

    public Producto(int Id_Producto, String nomProd, String descProd, int precio, int cantStock, List<Venta> listVenta) {
        this.Id_Producto = Id_Producto;
        this.nomProd = nomProd;
        this.descProd = descProd;
        this.precio = precio;
        this.cantStock = cantStock;
        this.listVenta = listVenta;
    }

    public int getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(int Id_Producto) {
        this.Id_Producto = Id_Producto;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public String getDescProd() {
        return descProd;
    }

    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    public List<Venta> getListVenta() {
        return listVenta;
    }

    public void setListVenta(List<Venta> listVenta) {
        this.listVenta = listVenta;
    }
    
    
    
}
