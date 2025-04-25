package com.example.bibliotecaduoc.controller;


import com.example.bibliotecaduoc.service.PrestamoService;
import com.example.bibliotecaduoc.model.Prestamo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/prestamo")
public class PrestamoControlador {

    @Autowired
    PrestamoService prestamoService;

    @GetMapping
    public List<Prestamo> listarPrestamos(){
        return prestamoService.getPrestamos();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Prestamo agregarPrestamo(@RequestBody Prestamo prestamo){
        return prestamoService.savePrestamo(prestamo);
    }

    @GetMapping("{idPrestamo}")
    public Prestamo buscarPrestamo(@PathVariable int idPrestamo){
        return prestamoService.getPrestamoId(idPrestamo);
    }

    @PutMapping("{id}")
    public Prestamo actualizarPrestamo(@PathVariable int id, @RequestBody Prestamo prestamo){
        return prestamoService.update(prestamo);
    }

    @DeleteMapping("{id}")
    public String eliminarLibro(@PathVariable int id){
        return prestamoService.delete(id);
    }


}
