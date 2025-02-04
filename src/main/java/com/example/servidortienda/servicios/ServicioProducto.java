package com.example.servidortienda.servicios;

import com.example.servidortienda.repositorio.RepositorioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioProducto {

    @Autowired
    RepositorioProducto repositorioProducto;

    //guardar producto en bd
    //buscar productos en bd
    //buscar UN producto en bd
    //modificar un producto en bd

}
