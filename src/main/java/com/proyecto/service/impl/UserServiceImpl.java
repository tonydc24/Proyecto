package com.proyecto.service.impl;

import com.proyecto.dao.UserDao;
import com.proyecto.domain.User;
import com.proyecto.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public List<User> getUsers(int activos) {
        var lista = userDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public User getUser(User user) {
        return userDao.findById(user.getIdUser()).orElse(null);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }
}