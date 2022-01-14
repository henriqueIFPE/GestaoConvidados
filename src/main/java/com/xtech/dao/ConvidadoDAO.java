package com.xtech.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xtech.model.Convidado;

public interface ConvidadoDAO extends JpaRepository<Convidado, Long> {

}
