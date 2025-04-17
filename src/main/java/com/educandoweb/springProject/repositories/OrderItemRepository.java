package com.educandoweb.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springProject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}