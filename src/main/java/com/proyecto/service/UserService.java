
package com.proyecto.service;

import com.proyecto.domain.User;

public interface UserService {
    
    public User getUser(String correo , String  contrasena);
    
    public void save(User user );
    
    
  
}
