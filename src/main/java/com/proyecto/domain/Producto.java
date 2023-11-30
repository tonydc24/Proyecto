package com.proyecto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "tab_producto")
public class Producto implements Serializable{ //serializacion guarda disco en memoria volatil
    private static final long serialVersionUID= 1L; //suma automatica del autoIncrement
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //que sean igual en la bd y en la clase 
    @Column (name="id_producto")
    
    
    private long idProducto;
    private String nombre;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    private String detalle;
    private double precio;
    private int existencias;
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    Categoria categoria;

    public Producto() {
    }

    public Producto(String nombre, String descripcion, boolean activo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activo = activo;
    }
    
}
