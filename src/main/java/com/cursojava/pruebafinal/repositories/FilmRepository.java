package com.cursojava.pruebafinal.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cursojava.pruebafinal.models.Film;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {
	List<Film> findAll();
}
