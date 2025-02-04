package com.example.servidortienda.repositorio;

import com.example.servidortienda.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioProducto extends JpaRepository<Producto,Integer> {
}
