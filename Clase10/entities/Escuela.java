package entities;

import java.util.List;
import java.util.ArrayList;

public class Escuela {
    private String nombre;
    private List<Estudiante>estudiantes=new ArrayList();
    
    public Escuela(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public void listaEstudiates(){
        System.out.println(estudiantes);
    }

    @Override
    public String toString() {
        return "Escuela [nombre=" + nombre + ", estudiantes=" + estudiantes + "]";
    }

}
