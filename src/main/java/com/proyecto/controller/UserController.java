package com.proyecto.controller;
import com.proyecto.dao.UserDao;
import com.proyecto.domain.User;
import com.proyecto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    
    @Autowired
    private UserDao userDao;

    @GetMapping("/login")
    public String login() {
        return "/user/login";
    }

    @PostMapping("/login")
    public String iniciarSesion(@RequestParam("correo") String correo, @RequestParam("contrasena") String contrasena, Model model) {
        User user = userService.getUser(correo, contrasena);

        if (user != null) {
            return "/index";
        } else {
            model.addAttribute("error", true);
            return "/user/login";
        }
    }

//////////////////////////////////////////////////
    @GetMapping("/create")
    public String create() {
        return "/user/create";
    }

    @PostMapping("/crear")
    public String crearCuenta(User user, Model model) {
        String correo = user.getCorreo();
        User existingUser = userDao.findByCorreo(correo);

        if (existingUser != null) {
            model.addAttribute("existe", true);
            return "/user/create";
        } else {
            userService.save(user);
            return "/index";
        }
    }
}
