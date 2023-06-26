package com.after.ClienteApi.Entidades;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Producto {

    @Id
    //incluimos estrategia para que nos de la entidad
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer idProducto;

    private String nombre;

    private Integer categoria;

    private String codigoBarras;

    private Double precioVenta;

    private Integer cantidadProductos;



    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(Integer cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto producto)) return false;
        return Objects.equals(getIdProducto(), producto.getIdProducto()) && Objects.equals(getNombre(), producto.getNombre()) && Objects.equals(getCategoria(), producto.getCategoria()) && Objects.equals(getCodigoBarras(), producto.getCodigoBarras()) && Objects.equals(getPrecioVenta(), producto.getPrecioVenta()) && Objects.equals(getCantidadProductos(), producto.getCantidadProductos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdProducto(), getNombre(), getCategoria(), getCodigoBarras(), getPrecioVenta(), getCantidadProductos());
    }
}
