package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	// método padrão do SprinData JPA, o DBA já faz  a busca por email
	User findByEmail(String email); 
}