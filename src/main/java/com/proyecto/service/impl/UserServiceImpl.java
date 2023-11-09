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
    public User getUser(String correo , String contrasena  ) {
        User user = userDao.findByCorreo(correo);

        if (user != null && user.getContrasena().equals(contrasena)) {
            return user; 
        }

        return null;
    }
    

    @Override
    @Transactional
    public void save(User user ) {
        userDao.save(user);
    }
}