/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.proyect.Facturacion.controller;

import com.edu.proyect.Facturacion.model.Producto;
import com.edu.proyect.Facturacion.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MAWIL
 */
@RestController
@RequestMapping("/api")
public class ProductoController {

    @Autowired
    ProductoService Service;

    @GetMapping("/listarP")
    public ResponseEntity< List<Producto>> obtenerLista() {
        return new ResponseEntity<>(Service.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crearP")
    public ResponseEntity<Producto> crear(@RequestBody Producto c){
        return new ResponseEntity<>(Service.save(c), HttpStatus.CREATED);
    }
    
    @GetMapping("/buscarP/{id}")
    public ResponseEntity<Producto> buscar(@PathVariable("id") Integer id){
        return new ResponseEntity<>(Service.findById(id),HttpStatus.OK);
    }
    
    @DeleteMapping("/deleteP/{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id){
        return new ResponseEntity<>(Service.delete(id),HttpStatus.OK);
    }
    
    @PutMapping("/actualizarP/{id}")
    public ResponseEntity<Producto> actualizar(@PathVariable("id") Integer id, @RequestBody Producto c){
        return new ResponseEntity<>(Service.update(id, c), HttpStatus.OK);
    }
}
