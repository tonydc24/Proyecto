package com.proyecto.dao;

import com.proyecto.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository <User , Long> {
     User findByCorreo(String correo);
}