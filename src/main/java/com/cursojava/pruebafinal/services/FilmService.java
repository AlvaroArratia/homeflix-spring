package com.cursojava.pruebafinal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cursojava.pruebafinal.models.Film;
import com.cursojava.pruebafinal.repositories.FilmRepository;

@Service
public class FilmService {
	private FilmRepository filmRepository;

	public FilmService(FilmRepository filmRepository) {
		this.filmRepository = filmRepository;
	}
	
	public Film createCategory(Film newFilm) {
		return filmRepository.save(newFilm);
	}

	public void deleteCategory(Long filmId) {
		filmRepository.deleteById(filmId);
	}

	public void updateCategory(Film updatedFilm) {
		filmRepository.save(updatedFilm);
	}

	public List<Film> getAll() {
		return (List<Film>) filmRepository.findAll();
	}

	public Film findTaskById(Long filmId) {
		Optional<Film> film = filmRepository.findById(filmId);
		if (film.isPresent()) {
			return film.get();
		} else {
			return null;
		}
	}
}
