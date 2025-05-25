package com.agencia.reservas.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "vuelo")
public class vueloModel {

    /**
     * Generamos los atributos de la clase vuelo
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String compania;
    private LocalDate fecha;
    private Double precio;
    private Integer plazasDisponibles;

    public vueloModel() {
    }

    /**
     * Ahora vamos a generar los getters & setters de cada atributo genreado anteriormente
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getPlazasDisponibles() {
        return plazasDisponibles;
    }

    public void setPlazasDisponibles(Integer plazasDisponibles) {
        this.plazasDisponibles = plazasDisponibles;
    }
}
