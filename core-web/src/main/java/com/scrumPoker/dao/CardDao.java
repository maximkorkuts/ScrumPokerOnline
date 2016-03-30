package com.scrumPoker.dao;

import com.scrumPoker.domain.impl.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Card DAO to work with DB
 * Note that this method is not implemented and its working code will be
 * automatically generated from its signature by Spring Data JPA.
 */
@Repository
public interface CardDao extends CrudRepository<Card, Long> {

}