package com.agencia.reservas.repository;

import com.agencia.reservas.model.reservaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Permite realizar operaciones CRUD y puede contener consultas personalizadas.
 */

@Repository
public interface reservaRepository extends JpaRepository<reservaModel, Long> {


}
