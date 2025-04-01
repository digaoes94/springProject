package com.educandoweb.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}