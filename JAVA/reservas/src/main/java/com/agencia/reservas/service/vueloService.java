package com.agencia.reservas.service;

import com.agencia.reservas.model.vueloModel;
import com.agencia.reservas.repository.vueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class vueloService {

    @Autowired
    private vueloRepository vueloRepository;

    public List<vueloModel> listarVuelo() {
        return vueloRepository.findAll();
    }

    public vueloModel crearVuelo(vueloModel vuelo) {
        return vueloRepository.save(vuelo);
    }

    public vueloModel buscarVuelo(Long id) {
        return vueloRepository.findById(id).orElse(null);
    }
}
