package com.example.servidortienda.controladores;


import com.example.servidortienda.modelos.Producto;
import com.example.servidortienda.servicios.ServicioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorProducto {

    @Autowired
    ServicioProducto servicioProducto;

    //guardar
    public ResponseEntity guardar(@RequestBody Producto datos){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioProducto.guardarProducto(datos));

        }catch(Exception error){

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(error.getMessage());
        }
    }


    //buscar


}
