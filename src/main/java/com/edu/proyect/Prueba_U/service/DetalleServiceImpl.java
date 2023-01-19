/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.proyect.Facturacion.service;

import com.edu.proyect.Facturacion.model.Detalle;
import com.edu.proyect.Facturacion.repository.DetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAWIL
 */
@Service
public class DetalleServiceImpl extends GenericServiceImpl<Detalle, Integer> implements DetalleService {

    @Autowired
    DetalleRepository detalleRepository;

    @Override
    public CrudRepository<Detalle, Integer> getDao() {
        return detalleRepository;
    }
}
