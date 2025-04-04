package com.educandoweb.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springProject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}