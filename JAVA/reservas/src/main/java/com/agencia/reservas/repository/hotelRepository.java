package com.agencia.reservas.repository;

import com.agencia.reservas.model.hotelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  Permite realizar operaciones CRUD y puede contener consultas personalizadas.
 */

@Repository
public interface hotelRepository extends JpaRepository<hotelModel, Long> {

}
