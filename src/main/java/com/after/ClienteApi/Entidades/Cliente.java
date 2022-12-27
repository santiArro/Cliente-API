package com.after.ClienteApi.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "CLIENTE")
public class Cliente {



    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)



    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "FECHA DE NACIMIENTO")
    private String fechaDeNacimiento;

//Creamos  de los Set y get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
//creamos los Set y Get pa
}
