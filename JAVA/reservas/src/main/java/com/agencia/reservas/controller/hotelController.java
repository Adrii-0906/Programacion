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

    /**
     * Instanciamos las clases service y repository para poder trabajar con ellas y crear los metodos de manera mas sencilla
     */

    @Autowired
    private final hotelService hotelService;

    @Autowired
    private final hotelRepository hotelRepository;


    /**
     * Creamos un constructor con los dos atributos instanciados
     * @param hotelService
     * @param hotelRepository
     */

    public hotelController(hotelService hotelService, hotelRepository hotelRepository) {
        this.hotelService = hotelService;
        this.hotelRepository = hotelRepository;
    }

    /**
     * Hacemos el metodo del get para poder listar todos los hoteles que hay guardados en la base de datos, con la ayuda de los servicios
     * @return
     */

    @GetMapping
    public List<hotelModel> listarHoteles() {
        return hotelService.listarHoteles();
    }

    /**
     * Creamos el metodo para crear nuevos hoteles donde poder hacer reservas, osea anadimos hoteles a la base de datos, con la yuda de los servicios
     * @param hotel
     * @return
     */

    @PostMapping
    public ResponseEntity<hotelModel> crearHotel(@RequestBody hotelModel hotel) {
        hotelModel nuevo = hotelRepository.save(hotel);
        return ResponseEntity.ok(nuevo);
    }
}