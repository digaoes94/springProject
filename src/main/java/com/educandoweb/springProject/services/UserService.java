package com.educandoweb.springProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.educandoweb.springProject.entities.User;
import com.educandoweb.springProject.repositories.UserRepository;
import com.educandoweb.springProject.services.exceptions.DatabaseException;
import com.educandoweb.springProject.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	public List<User> findAll() {
		return userRepo.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = userRepo.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return userRepo.save(obj);
	}
	
	public void delete(Long id) {
		try {
			userRepo.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
		catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User obj) {
		try {
			User entity = userRepo.getReferenceById(id);
			updateData(entity, obj);
			return userRepo.save(entity);
		}
		catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}