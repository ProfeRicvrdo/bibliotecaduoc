package com.example.bibliotecaduoc.repository;

import java.util.List;
import java.util.ArrayList;

import ch.qos.logback.core.encoder.ByteArrayUtil;
import com.example.bibliotecaduoc.model.Prestamo;
import org.springframework.stereotype.Repository;

public class PrestamoRepository {

    private List<Prestamo> listaPrestamos = new ArrayList<>();

    public List<Prestamo> obtenerListaPrestanmos(){
        return listaPrestamos;
    }

    public Prestamo guardar(Prestamo prestamo){
        listaPrestamos.add(prestamo);
        return prestamo;
    }

    public Prestamo buscarPorId(int id){
        for(Prestamo prestamo : listaPrestamos){
            if (prestamo.getIdPrestamo() ==  id){
                return prestamo;
            }
        }
        return null;
    }

    public List<Prestamo> obtenerPrestamosPorRun(String run){

    }




}
