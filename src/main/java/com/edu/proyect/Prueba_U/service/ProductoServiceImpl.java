/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.proyect.Facturacion.service;

import com.edu.proyect.Facturacion.model.Producto;
import com.edu.proyect.Facturacion.repository.ProductoRepository;
import com.edu.proyect.Facturacion.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAWIL
 */
@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto, Integer> implements ProductoService{

    @Autowired
    ProductoRepository productoRepository;
    
    @Override
    public CrudRepository<Producto, Integer> getDao() {
        return productoRepository;
    }
    
}
