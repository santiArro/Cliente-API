package com.after.ClienteApi.Entidades;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Factura {

    @Id
    //incluimos estrategia para que nos de la entidad
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer idCliente;

    private String total;

    private Integer fecha;


    @ManyToOne
    @JoinColumn(name = "id_cliente",insertable = false,updatable = false)
    private Cliente cliente;



    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Integer getFecha() {
        return fecha;
    }

    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Factura factura)) return false;
        return getIdCliente().equals(factura.getIdCliente()) && getTotal().equals(factura.getTotal()) && getFecha().equals(factura.getFecha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdCliente(), getTotal(), getFecha());
    }
}
