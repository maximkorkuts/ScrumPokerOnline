package com.scrumPoker.server.impl;

import com.scrumPoker.domain.User;
import com.scrumPoker.server.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

/**
 * @author Maxim Korkuts
 */
@Service
@Validated
public class UserServiceImpl implements UserService {

//    @Autowired
//    @Qualifier("userDao")
//    private UserDao userDao;

    @Transactional
    @Override
    public void delete(String login) {
       // userDao.deleteByLogin(login);
    }

    @Transactional
    @Override
    public User save(User user) {
        return null;//userDao.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User findByLogin(String login) {
        return null;//userDao.findByLogin(login);
    }

    @Transactional(readOnly = true)
    @Override
    public boolean isExist(String login) {
        return true; //userDao.existsByLogin(login);
    }
}
