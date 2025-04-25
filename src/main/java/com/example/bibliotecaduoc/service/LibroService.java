package com.example.bibliotecaduoc.service;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.repository.LibroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros(){
        return libroRepository.obtenerListaLibros();
    }

    public Libro saveLibro(Libro libro){
        return libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id){
        return libroRepository.buscarPorId(id);
    }

    public Libro updateLibro(Libro libro){
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id){
        libroRepository.eliminar(id);
        return "Libro eliminado";
    }

    public Libro getLibroIsbn(String isbn){
        return libroRepository.buscarPorIsbn(isbn);
    }


    // opcion 1 para saber el total de libros
    // obtenemos la lista de libros y sacamos el .size(), pero la responsabilidad de esa fincion debe ser de librorepository
    public int totalLibrosV1(){
        return libroRepository.obtenerListaLibros().size();
    }

    //opcion 2, creando el motodo total libros en el repository
    public int  totalLibrosV2(){
        return libroRepository.totalLibros();
    }

}
