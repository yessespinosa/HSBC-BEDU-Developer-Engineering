package com.example.demo.model;

public class CrearCurso {
    private String nombre;

    public CrearCurso(String name){
        this.nombre = name;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }
}
