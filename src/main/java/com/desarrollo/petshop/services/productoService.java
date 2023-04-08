package com.desarrollo.petshop.services;

import java.util.List;

import com.desarrollo.petshop.models.producto;

public interface productoService {
    
    public List<producto> listarProdutos();

    public void guardar(producto producto);

    public void eliminar(producto producto);

    public producto encontrarProducto (producto producto);


}
