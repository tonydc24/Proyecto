/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service.impl;

import com.proyecto.dao.ProductoDao;
import com.proyecto.domain.Producto;
import com.proyecto.service.ProductoService;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService {
    
    
     @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductos(boolean activos, boolean ordenarPrecio) {
    var lista = productoDao.findAll();

    if (activos) {
        lista.removeIf(e -> !e.isActivo());
    }

    if (ordenarPrecio) {
        lista.sort(Comparator.comparing(Producto::getPrecio));
    }

    return lista;
}

    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }
    
      @Override
    @Transactional(readOnly = true)
    public Producto obtenerProductoPorId(Long idProducto) {
        return productoDao.findById(idProducto).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }
    
    
    
}
