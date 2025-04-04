package com.educandoweb.springProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.springProject.entities.Order;
import com.educandoweb.springProject.entities.User;
import com.educandoweb.springProject.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepo;
	
	public List<Order> findAll() {
		return orderRepo.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = orderRepo.findById(id);
		return obj.get();
	}
}
