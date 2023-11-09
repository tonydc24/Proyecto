
package com.proyecto.service;

import com.proyecto.domain.User;
import java.util.List;

public interface UserService {
    public List<User> getUsers(int id);
    
    public User getUser(String correo , String  contrasena);
    
    public void save(User user);
    
    
  
}
