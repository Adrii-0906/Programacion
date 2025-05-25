package com.agencia.reservas.service;

import com.agencia.reservas.model.vueloModel;
import com.agencia.reservas.repository.vueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class vueloService {

    /**
     * Inicializamos el vueloRepository para trabajar con el a la hora de crear los servicios
     */

    @Autowired
    private vueloRepository vueloRepository;

    /**
     * Creamos el metodo para listar los vuelos que tengamos registrados en la base de datos
     * @return
     */

    public List<vueloModel> listarVuelo() {
        return vueloRepository.findAll();
    }

    /**
     * Creamos el metodo para poder anadir mas vuelos a la base de datos
     * @param vuelo
     * @return
     */

    public vueloModel crearVuelo(vueloModel vuelo) {
        return vueloRepository.save(vuelo);
    }

}
