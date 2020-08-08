package com.speech.tmt.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.speech.tmt.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {
	
	@Override
	public List<Client> findAll();
}
