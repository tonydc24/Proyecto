
package com.proyecto.service;

import com.proyecto.domain.User;
import java.util.List;

public interface UserService {
    public List<User> getUsers(int id);
    
    public User getUser(User user);
    
    public void save(User user);
    
  
}
