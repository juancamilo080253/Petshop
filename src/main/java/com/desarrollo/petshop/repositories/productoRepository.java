package com.desarrollo.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desarrollo.petshop.models.producto;

@Repository
public interface productoRepository extends JpaRepository<producto,Integer> {
    
}
