package com.agencia.reservas.model;


import jakarta.persistence.*;

@Entity
@Table(name = "reserva")
public class reservaModel {
    /**
     * Ahora he generado los atributos de la clase reserva
     */


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String usuario;
    private String dni;

    public reservaModel() {
    }

    /**
     * Ahora con el ManyToOne hago la realcion con las demas entidades
     */

    @ManyToOne
    @JoinColumn(name = "vuelo_asociado")
    private vueloModel vuelo;

    @ManyToOne
    @JoinColumn(name = "hotel_asociado")
    private hotelModel hotel;



    /**
     * Ahora vamos a generar los getters & setters
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public vueloModel getVuelo() {
        return vuelo;
    }

    public void setVuelo(vueloModel vuelo) {
        this.vuelo = vuelo;
    }

    public hotelModel getHotel() {
        return hotel;
    }

    public void setHotel(hotelModel hotel) {
        this.hotel = hotel;
    }
}
