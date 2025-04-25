package com.example.bibliotecaduoc.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.bibliotecaduoc.model.Prestamo;
import com.example.bibliotecaduoc.repository.PrestamoRepository;

import java.util.List;

@Service
public class PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;

    public List<Prestamo> getPrestamos(){
        return prestamoRepository.obtenerListaPrestanmos();
    }

    public Prestamo  savePrestamo(Prestamo prestamo){
        return prestamoRepository.guardar(prestamo);
    }

    public Prestamo getPrestamoId(int id){
        return prestamoRepository.buscarPorId(id);
    }

    public Prestamo update(Prestamo prestamo){
        return prestamoRepository.actualizar(prestamo);
    }

    public String delete(int id){
        prestamoRepository.eliminar(id);
        return "Prestamo eliminado";
    }

}
