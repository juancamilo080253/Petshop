package com.desarrollo.petshop.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data // me agrega getter y setters
@Entity
@Table(name="producto")
public class producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_producto;
    
    private String nombre_producto;
    private Integer precio;
    private String descripcion;
    
}
