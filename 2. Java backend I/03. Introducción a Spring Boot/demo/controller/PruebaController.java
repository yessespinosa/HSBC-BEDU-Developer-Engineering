package com.example.demo.controller;

import com.example.demo.model.Curso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class PruebaController {
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello world";
    }
    @GetMapping("/goodbye")
    public String goodBye() {
        return "Good bye";
    }
    @GetMapping("/curso")
    public Curso enviarCurso(){
        return new Curso(100l,"Backend con Java I");
    }
}
