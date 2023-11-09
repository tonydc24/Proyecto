package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/info")
public class ProductoController {
  
    @GetMapping("/producto")
    public String productos() {
        return "/producto/listado";
    }
    }