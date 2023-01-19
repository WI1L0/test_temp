/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.proyect.Facturacion.service;

import com.edu.proyect.Facturacion.repository.FacturaRepository;
import com.edu.proyect.Facturacion.model.Factura;
import com.edu.proyect.Facturacion.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAWIL
 */
@Service
public class FacturaServiceImpl extends GenericServiceImpl<Factura, Integer> implements FacturaService {

    @Autowired
    FacturaRepository facturaRepository;

    @Override
    public CrudRepository<Factura, Integer> getDao() {
        return facturaRepository;
    }

}
