package com.educandoweb.springProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.springProject.entities.Category;
import com.educandoweb.springProject.entities.User;
import com.educandoweb.springProject.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepo;
	
	public List<Category> findAll() {
		return categoryRepo.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = categoryRepo.findById(id);
		return obj.get();
	}
}
