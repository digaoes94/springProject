package com.educandoweb.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springProject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}