package com.scrumPoker.server;

import com.scrumPoker.domain.User;

/**
 * @author Maxim Korkuts
 */
public interface UserService {

    /**Delete user by login*/
    void delete(String login);

    /**Save user data*/
    User save(User user);

    /**get user by login*/
    User findByLogin(String login);

    /**return true, if user with this login exist in DB, else - false*/
    boolean isExist(String login);

}
