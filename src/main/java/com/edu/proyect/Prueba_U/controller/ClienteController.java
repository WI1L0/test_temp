/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.proyect.Facturacion.controller;

import com.edu.proyect.Facturacion.model.Cliente;
import com.edu.proyect.Facturacion.service.ClienteService;
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
public class ClienteController {

    @Autowired
    ClienteService Service;

    @GetMapping("/listarC")
    public ResponseEntity< List<Cliente>> obtenerLista() {
        return new ResponseEntity<>(Service.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crearC")
    public ResponseEntity<Cliente> crear(@RequestBody Cliente c){
        return new ResponseEntity<>(Service.save(c), HttpStatus.CREATED);
    }
    
    @GetMapping("/buscarC/{id}")
    public ResponseEntity<Cliente> buscar(@PathVariable("id") Integer id){
        return new ResponseEntity<>(Service.findById(id),HttpStatus.OK);
    }
    
    @DeleteMapping("/deleteC/{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id){
        return new ResponseEntity<>(Service.delete(id),HttpStatus.OK);
    }
    
    @PutMapping("/actualizarC/{id}")
    public ResponseEntity<Cliente> actualizar(@PathVariable("id") Integer id, @RequestBody Cliente c){
        return new ResponseEntity<>(Service.update(id, c), HttpStatus.OK);
    }
}
