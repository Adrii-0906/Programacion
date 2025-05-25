package com.agencia.reservas.controller;

import com.agencia.reservas.model.reservaModel;
import com.agencia.reservas.service.reservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class reservaController {

    /**
     * Instanciamos las clases service para poder trabajar con ellas y crear los metodos de manera mas sencilla
     */

    @Autowired
    private reservaService reservaService;

    /**
     * Creamos el metodo obtener reservas para poder ver todas las reservas que los usuarios han realizado
     * @return
     */

    @GetMapping
    public List<reservaModel> obtenerReservas() {
        return reservaService.listarReservas();
    }


    /**
     * Creamos el metodo crear reserva para poder hacer una reserva y que se guarde en la base de datos
     * @param reserva
     * @return
     */


    @PostMapping
    public ResponseEntity<?> crearReserva(@RequestBody reservaModel reserva) {
        try {
            reservaModel reservaCreada = reservaService.crearReserva(reserva);
            return ResponseEntity.ok(reservaCreada);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}