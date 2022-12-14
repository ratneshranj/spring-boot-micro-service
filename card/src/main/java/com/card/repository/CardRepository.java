package com.card.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.card.model.Cards;

public interface CardRepository extends CrudRepository<Cards, Long> {
	
	List<Cards> findByCustomerId(int customerId);

}
