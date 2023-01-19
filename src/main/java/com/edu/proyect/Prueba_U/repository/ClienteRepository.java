/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.edu.proyect.Facturacion.repository;

import com.edu.proyect.Facturacion.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author MAWIL
 */
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query(value = "Select * from cliente c where c.cedula = :cedula", nativeQuery = true)
    public Cliente buscarCliente(String cedula);

}
