package com.api.raccoltoemoraes.repository;

import com.api.raccoltoemoraes.domain.Consultor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryConsultor extends JpaRepository<Consultor, Long> {
    @Query("SELECT m FROM Consultor m WHERE m.ativo = true")
    List<Consultor> buscarTodosConsultorAtivos();
}
