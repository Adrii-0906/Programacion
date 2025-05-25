package com.agencia.reservas.controller;

import com.agencia.reservas.model.vueloModel;
import com.agencia.reservas.repository.vueloRepository;
import com.agencia.reservas.service.vueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class vueloController {

    @Autowired
    private vueloService vueloService;

    @Autowired
    private vueloRepository vueloRepository;

    @GetMapping
    public List<vueloModel> listarVuelos() {
        return vueloService.listarVuelo();
    }

    @PostMapping
    public ResponseEntity<vueloModel> crearVuelo(@RequestBody vueloModel vuelo) {
        vueloModel nuevoVuelo = vueloRepository.save(vuelo);
        return ResponseEntity.ok(nuevoVuelo);
    }



}
