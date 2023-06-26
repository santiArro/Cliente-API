package com.after.ClienteApi.Entidades;

import jakarta.persistence.*;

@Entity

public class Detalle_Factura {
    @Id
    //incluimos estrategia para que nos de la entidad
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer idFactura;

    private Integer idProductol;

    private Integer cantidad;


    @ManyToOne
    @JoinColumn(name = "id_cliente",insertable = false,updatable = false)
    private Cliente cliente;

    public Integer getIdFactura() {
        return idFactura;
    }


    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getIdProductol() {
        return idProductol;
    }

    public void setIdProductol(Integer idProductol) {
        this.idProductol = idProductol;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Detalle_Factura{" +
                "idFactura=" + idFactura +
                ", idProductol=" + idProductol +
                ", cantidad=" + cantidad +
                '}';
    }
}

