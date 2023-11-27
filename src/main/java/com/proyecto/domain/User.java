package com.proyecto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "tab_users")
public class User implements Serializable{
    private static final long serialVersionUID= 1L; 
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name="id_user")
        
    private long idUser;
    private String correo;
    private String contrasena;
    private String direccion;

    public User() {
    }

    public User(String correo, String contrasena, String direccion) {
        this.correo = correo;
        this.contrasena = contrasena;
        this.direccion = direccion;
    }

    
    
}
