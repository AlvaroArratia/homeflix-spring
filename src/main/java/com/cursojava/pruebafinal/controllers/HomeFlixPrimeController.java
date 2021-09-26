package com.cursojava.pruebafinal.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import com.cursojava.pruebafinal.models.Category;
import com.cursojava.pruebafinal.models.Film;
import com.cursojava.pruebafinal.services.CategoryService;
import com.cursojava.pruebafinal.services.FilmService;

@Controller
public class HomeFlixPrimeController {
	
	private CategoryService categoryService;
	private FilmService filmService;
	
	public HomeFlixPrimeController(CategoryService categoryService, FilmService filmService) {
		this.categoryService = categoryService;
		this.filmService = filmService;
	}

	@RequestMapping("/")
	public String index(Model model) {
		List<Category> categories = categoryService.getAll();
		model.addAttribute("categories", categories);
		List<Film> films = filmService.getAll();
		model.addAttribute("films", films);
		return "index.jsp";
	}
	
	//@RequestMapping("/search")
	//public String search(@RequestParam("category") String category, @RequestParam("filmTitle") String filmTitle, Model model) {
	//	  return "index.jsp";
	//}
}
