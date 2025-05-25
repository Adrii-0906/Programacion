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

    /**
     * Instanciamos las clases service y repository para poder trabajar con ellas y crear los metodos de manera mas sencilla
     */

    @Autowired
    private vueloService vueloService;

    @Autowired
    private vueloRepository vueloRepository;

    /**
     * Creamos el metodo obtener reservas para poder ver todas las reservas que los usuarios han realizado, con la ayuda de los servicios
     * @return
     */

    @GetMapping
    public List<vueloModel> listarVuelos() {
        return vueloService.listarVuelo();
    }

    /**
     * Creamos el metodo crear vuelos para poder anadir companias de vuelo a la base de datos y que los usuarios al hacer una reseva y listen los vuelos vena los vuelo q hay en la base de datos, con la ayuda de los servicios
     * @param vuelo
     * @return
     */

    @PostMapping
    public ResponseEntity<vueloModel> crearVuelo(@RequestBody vueloModel vuelo) {
        vueloModel nuevoVuelo = vueloRepository.save(vuelo);
        return ResponseEntity.ok(nuevoVuelo);
    }
}
