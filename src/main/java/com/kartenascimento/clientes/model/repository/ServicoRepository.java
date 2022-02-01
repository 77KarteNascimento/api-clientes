package com.kartenascimento.clientes.model.repository;

import com.kartenascimento.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
