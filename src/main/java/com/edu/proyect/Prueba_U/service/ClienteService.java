/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.edu.proyect.Facturacion.service;

import com.edu.proyect.Facturacion.model.Cliente;
import com.edu.proyect.Facturacion.service.GenericService;

/**
 *
 * @author MAWIL
 */
public interface ClienteService extends GenericService<Cliente, Integer>{
    
    Cliente buscarCliente (String a);
}
