package com.proyecto.controller;
import com.proyecto.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    public String login() {
        return "/user/login"; 
    }
    
    @PostMapping("/login")
public String iniciarSesion() {
    //logica por definir 
    return "redirect:/index"; 
}
 @GetMapping("/create")
    public String create() {
        return "/user/create"; 
    }
    
  @PostMapping("/crear")
public String crearCuenta(User user) {
    
    return "redirect:/index"; 
}
}