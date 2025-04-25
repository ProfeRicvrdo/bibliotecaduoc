package com.example.bibliotecaduoc.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo {


    private int idPrestamo;
    private int idLibro;
    private String runSolicitante;
    private Date fechaSolicitud = new Date();
    private int cantidadDias;
    private int multas=0;
}
