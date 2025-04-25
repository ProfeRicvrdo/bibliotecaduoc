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

    public Prestamo actualizar(Prestamo prestamo){
        int id = 0;
        int  idPosicion =0;

        for (int i =0 ; i < listaPrestamos.size(); i++) {
            if (listaPrestamos.get(i).getIdPrestamo() == prestamo.getIdPrestamo()) {
                id = prestamo.getIdPrestamo();
                idPosicion = i;
            }
        }
        Prestamo nuevoPrestamo = new Prestamo();
        nuevoPrestamo.setIdPrestamo(prestamo.getIdPrestamo());
        nuevoPrestamo.setIdLibro(prestamo.getIdLibro());
        nuevoPrestamo.setRunSolicitante(prestamo.getRunSolicitante());
        nuevoPrestamo.setFechaSolicitud(prestamo.getFechaSolicitud());
        nuevoPrestamo.setCantidadDias(prestamo.getCantidadDias());
        nuevoPrestamo.setMultas(prestamo.getMultas());

        listaPrestamos.set(idPosicion, nuevoPrestamo);
        return nuevoPrestamo;
    }

    public void eliminar(int id){
        Prestamo prestamo =buscarPorId(id);
        listaPrestamos.remove(prestamo);
    }

}
