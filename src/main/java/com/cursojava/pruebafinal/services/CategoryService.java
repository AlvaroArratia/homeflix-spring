package com.cursojava.pruebafinal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cursojava.pruebafinal.models.Category;
import com.cursojava.pruebafinal.repositories.CategoryRepository;

@Service
public class CategoryService {

	private final CategoryRepository categoryRepository;

	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	public Category createCategory(Category newCategory) {
		return categoryRepository.save(newCategory);
	}

	public void deleteCategory(Long categoryId) {
		categoryRepository.deleteById(categoryId);
	}

	public void updateCategory(Category updatedCategory) {
		categoryRepository.save(updatedCategory);
	}

	public List<Category> getAll() {
		return (List<Category>) categoryRepository.findAll();
	}

	public Category findTaskById(Long categoryId) {
		Optional<Category> category = categoryRepository.findById(categoryId);
		if (category.isPresent()) {
			return category.get();
		} else {
			return null;
		}
	}
}
