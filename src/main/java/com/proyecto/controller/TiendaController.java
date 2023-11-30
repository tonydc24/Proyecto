package com.proyecto.controller;

import com.proyecto.domain.Categoria;
import com.proyecto.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.proyecto.service.ProductoService;

@Controller
@RequestMapping("/tienda")
public class TiendaController {

    @Autowired
    private ProductoService productoService;
    @Autowired
    private CategoriaService categoriaService;

   @GetMapping("/listado")
    public String listado(Model model) {
        var productos = productoService.getProductos(false, true);
        var categorias = categoriaService.getCategorias(false);
        model.addAttribute("productos", productos);
        model.addAttribute("totalProductos", productos.size());
        model.addAttribute("categorias", categorias);
        return "/tienda/listado";
    }

    @GetMapping("/listado/{idCategoria}")
    public String listado(Model model, Categoria categoria) {
        var productos = categoriaService.getCategoria(categoria).getProductos();
        var categorias = categoriaService.getCategorias(false);
        model.addAttribute("productos", productos);
        model.addAttribute("totalProductos", productos.size());
        model.addAttribute("categorias", categorias);
        return "/tienda/listado";
    }
    
     @GetMapping("/listado/{idProducto}")
    public String listado2(Model model) {
        var productos = productoService.getProductos(false, true);
        var categorias = categoriaService.getCategorias(false);
        model.addAttribute("productos", productos);
        model.addAttribute("totalProductos", productos.size());
        model.addAttribute("categorias", categorias);
        return "/tienda/listado";
    } 
}
