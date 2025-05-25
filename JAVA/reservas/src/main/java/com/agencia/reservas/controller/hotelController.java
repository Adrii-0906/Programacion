package com.agencia.reservas.controller;

import com.agencia.reservas.model.hotelModel;
import com.agencia.reservas.repository.hotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.agencia.reservas.service.hotelService;

import java.util.List;

@RestController
@RequestMapping("/hoteles")
public class hotelController {

    @Autowired
    private final hotelService hotelService;

    @Autowired
    private final hotelRepository hotelRepository;


    public hotelController(com.agencia.reservas.service.hotelService hotelService, com.agencia.reservas.repository.hotelRepository hotelRepository) {
        this.hotelService = hotelService;
        this.hotelRepository = hotelRepository;
    }

    @GetMapping
    public List<hotelModel> listarHoteles() {
        return hotelService.listarHoteles();
    }

    @PostMapping
    public ResponseEntity<hotelModel> crearHotel(@RequestBody hotelModel hotel) {
        hotelModel nuevo = hotelRepository.save(hotel);
        return ResponseEntity.ok(nuevo);
    }


}