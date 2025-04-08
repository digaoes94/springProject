package com.educandoweb.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springProject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}