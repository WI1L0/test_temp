/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.proyect.Facturacion.controller;

import com.edu.proyect.Facturacion.model.Factura;
import com.edu.proyect.Facturacion.service.FacturaService;
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
public class FacturaController {

    @Autowired
    FacturaService Service;

    @GetMapping("/listarF")
    public ResponseEntity< List<Factura>> obtenerLista() {
        return new ResponseEntity<>(Service.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crearF")
    public ResponseEntity<Factura> crear(@RequestBody Factura c){
        return new ResponseEntity<>(Service.save(c), HttpStatus.CREATED);
    }
    
    @GetMapping("/buscarF/{id}")
    public ResponseEntity<Factura> buscar(@PathVariable("id") Integer id){
        return new ResponseEntity<>(Service.findById(id),HttpStatus.OK);
    }
    
    @DeleteMapping("/deleteF/{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id){
        return new ResponseEntity<>(Service.delete(id),HttpStatus.OK);
    }
    
    @PutMapping("/actualizarF/{id}")
    public ResponseEntity<Factura> actualizar(@PathVariable("id") Integer id, @RequestBody Factura c){
        return new ResponseEntity<>(Service.update(id, c), HttpStatus.OK);
    }
}
