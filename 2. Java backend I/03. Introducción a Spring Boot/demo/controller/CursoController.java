package com.example.demo.controller;

import com.example.demo.model.CrearCurso;
import com.example.demo.model.Curso;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
public class CursoController {
    private List<Curso> cursos;
    private long ultimoId = 102;
    public CursoController(){
        cursos = new LinkedList<>();
        cursos.add(new Curso(100l,"Full Stack Java"));
        cursos.add(new Curso(101l,"Full Stack JavaScript"));
        cursos.add(new Curso(102l,"Full Stack Python"));
    }
    @GetMapping("/obtenerCursos")
    public List<Curso> obtenerCursos(){
        return cursos;
    }

    @GetMapping("/obtenerCurso/{id}")
    public Curso obtenerCurso(@PathVariable long id){
        for (Curso c : cursos){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }
    @PostMapping("/crearCurso")
    public Curso crearCuso(@RequestBody CrearCurso data){
        Curso nuevo = new Curso(++ultimoId, data.getNombre());
        cursos.add(nuevo);
        return nuevo;
    }
}
