package com.scrumPoker.dao;

import com.scrumPoker.domain.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * User DAO to work with DB
 * Note that this method is not implemented and its working code will be
 * automatically generated from its signature by Spring Data JPA.
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {

    /**
     * This method will find an User instance in the database by its login.
     */
    User findByLogin(String login);

    /**
     *  This method will find an User instance in the database by its login and will delete it.
     */
    @Modifying
    void deleteByLogin(String login);

    /**
     *  This method will try tu find an User instance and if find, return true.
     */
  //  boolean existsByLogin(String login);

}