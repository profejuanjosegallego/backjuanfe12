package com.example.servidortienda.servicios;

import com.example.servidortienda.modelos.Producto;
import com.example.servidortienda.repositorio.RepositorioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioProducto {

    @Autowired
    RepositorioProducto repositorioProducto;

    //guardar producto en bd
    public Producto guardarProducto(Producto datosProducto)throws Exception{
        try{
            return repositorioProducto.save(datosProducto);
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //buscar productos en bd
    public List<Producto> buscarProductos()throws Exception{
        try{
            return repositorioProducto.findAll();
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //buscar UN producto en bd
    public Producto buscarProducto(Integer id)throws Exception{
        try{
            Producto encontrado=repositorioProducto.findById(id).get();
            return encontrado;
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }


    //modificar un producto en bd

}
