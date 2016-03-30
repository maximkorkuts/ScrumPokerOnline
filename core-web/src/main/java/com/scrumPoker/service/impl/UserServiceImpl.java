package com.scrumPoker.service.impl;

import com.scrumPoker.dao.UserDao;
import com.scrumPoker.domain.impl.User;
import com.scrumPoker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

/**
 * @author Maxim Korkuts
 */
@Service
@Validated
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void delete(String login) {
        userDao.deleteByLogin(login);
    }

    @Transactional
    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User findByLogin(String login) {
        return userDao.findByLogin(login);
    }

    @Transactional(readOnly = true)
    @Override
    public boolean isExist(String login) {
        return true; //userDao.existsByLogin(login);
    }
}
