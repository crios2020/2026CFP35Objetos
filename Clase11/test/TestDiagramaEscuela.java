package test;

import entities.Escuela;
import entities.Estudiante;

public class TestDiagramaEscuela {
    public static void main(String[] args) {
        System.out.println("-- Test Diagrama Escuela --");

        System.out.println("-- estudiante1 --");
        Estudiante estudiante1=new Estudiante("Juan", 20);
        System.out.println(estudiante1);

        System.out.println("-- escuela1 --");
        Escuela escuela1=new Escuela("escuela1");
        escuela1.agregarEstudiante(estudiante1);
        escuela1.agregarEstudiante(new Estudiante("Ana", 22));
        escuela1.agregarEstudiante(new Estudiante("Javier", 23));

        System.out.println(escuela1);
        escuela1.listaEstudiates();
        
    }
}
