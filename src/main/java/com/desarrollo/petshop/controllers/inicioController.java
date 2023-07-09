package com.desarrollo.petshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.desarrollo.petshop.models.producto;
import com.desarrollo.petshop.services.productoService;


@Controller
public class inicioController {

    @Autowired
    productoService productoService;

    @GetMapping("/")
    public String goToCatalogo(Model model){    
        return "index";
    }

    @PostMapping("/crearProducto")
        public String goToCrearProducto(producto producto){
        productoService.guardar(producto);
        return "catalogo";
    }

    @GetMapping("/nosotros")
    public String goToNosotros(Model model){ 
        /* que es esto del model? es un objeto que 
        voy a recibir trabajando con mvc 
        representa los datos que quiero mandarle a la vista, para
        que el me muestre la info en la plantilla*/ 
        return "nosotros"; //redirige plantilla, si es el nombre de un archivo lo devuelve
    }

    @GetMapping("/catalogo")
    public String goTocatalogo(Model model){
        var productos = productoService.listarProdutos();
       model.addAttribute("productos", productos);  //variable que hemos compartido "entre comillas"
        return "catalogo";
    }
}
