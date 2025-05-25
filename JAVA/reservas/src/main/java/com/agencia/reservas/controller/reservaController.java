package com.agencia.reservas.controller;

import com.agencia.reservas.model.reservaModel;
import com.agencia.reservas.service.reservaService;
import com.agencia.reservas.repository.reservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class reservaController {

    @Autowired
    private reservaService reservaService;

    @Autowired
    private reservaRepository reservaRepository;


    @GetMapping
    public List<reservaModel> obtenerReservas() {
        return reservaService.listarReservas();
    }


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