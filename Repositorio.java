package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Repositorio extends JpaRepository<Ponto,Integer> {
	List<Ponto> findPontosByNome(String nome);
}
