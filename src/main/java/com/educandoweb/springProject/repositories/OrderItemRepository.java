package com.educandoweb.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springProject.entities.OrderItem;
import com.educandoweb.springProject.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}