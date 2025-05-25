package com.agencia.reservas.service;

import com.agencia.reservas.model.hotelModel;
import com.agencia.reservas.repository.hotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class hotelService {

    /**
     * Inicializamos el hotelRepository para trabajar con el a la hora de crear los servicios
     * Le creamos su constructor
     */

    @Autowired
    private final hotelRepository hotelRepository;

    public hotelService(hotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    /**
     * Creamos el metodo para listar los hoteles que tengamos registrados en la base de datos
     * @return
     */
    public List<hotelModel> listarHoteles() {
        return hotelRepository.findAll();
    }

    /**
     * Creamos el metodo para poder anadir mas hoteles a la base de datos
     */
    public hotelModel crearHotel(hotelModel hotel) {
        return hotelRepository.save(hotel);
    }

}
