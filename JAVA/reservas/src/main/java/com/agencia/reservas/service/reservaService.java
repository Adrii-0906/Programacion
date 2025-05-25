package com.agencia.reservas.service;


import com.agencia.reservas.model.hotelModel;
import com.agencia.reservas.model.reservaModel;
import com.agencia.reservas.model.vueloModel;
import com.agencia.reservas.repository.hotelRepository;
import com.agencia.reservas.repository.reservaRepository;
import com.agencia.reservas.repository.vueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class reservaService {

    @Autowired
    private reservaRepository reservaRepository;

    @Autowired
    private hotelRepository hotelRepository;

    @Autowired
    private vueloRepository vueloRepository;

    public List<reservaModel> listarReservas(){
        return reservaRepository.findAll();
    }

    public reservaModel crearReserva(reservaModel reserva){
        vueloModel vuelo = vueloRepository.findById(reserva.getVuelo().getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Vuelo no encontrado"));

        hotelModel hotel = hotelRepository.findById(reserva.getHotel().getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Hotel no encontrado"));

        if (vuelo.getPlazasDisponibles() <= 0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No hay plazas disponibles");
        }

       vuelo.setPlazasDisponibles(vuelo.getPlazasDisponibles() - 1);
       vueloRepository.save(vuelo);

       reserva.setVuelo(vuelo);
       reserva.setHotel(hotel);

       return reservaRepository.save(reserva);
    }
}
