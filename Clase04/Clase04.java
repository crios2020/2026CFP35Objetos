public class Clase04{
    public static void main(String[] args) {
        System.out.println("-- Clase 04 --");
        System.out.println("-- Paradigma de Objetos --");

        /*
            Que es una clase? Representa ideas sustantivas en forma generica, 
            se detectan las clases como sustantivos. se nombran como sustantivos en singular.
            Ej: Empleado, Alumno, Articulo, Auto
        
            Objetos:    Los Objetos son instancias de la clase y tienen estado propio
                        (Estado=valor de sus atributos)

            Atributos: Son variables contenidas dentro de la clase y describen al objeto, 
                        se detectan como adjetivos y tienen un tipo de datos primitivo asociado

            Métodos: Son acciones que realiza la clase, (se detectan como verbos)


        */

        //Creamos un objeto de la clase Auto
        System.out.println("-- auto1 --");
        Auto auto1=new Auto();                  // new Auto() //Llamar al constructor de la clase
        
        //poner estado al objeto auto1
        auto1.marca="Ford";
        auto1.modelo="Ka";
        auto1.color="Negro";
        auto1.acelerar();           //10
        auto1.acelerar();           //20
        auto1.acelerar();           //30
        auto1.frenar();             //20

        //Imprimo el estado del objeto auto1
        System.out.println(auto1.marca+", "+auto1.modelo+", "+auto1.color+", "+auto1.velocidad);

        System.out.println("-- auto2 --");
        Auto auto2=new Auto();
        auto2.marca="Fiat";
        auto2.modelo="Idea";
        auto2.color="Gris";

        for(int a=0; a<=60; a++)    auto2.acelerar();

        System.out.println(auto2.marca+", "+auto2.modelo+", "+auto2.color+", "+auto2.velocidad);

        //TODO sobrecarga de métodos


    }
}