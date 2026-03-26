import javax.swing.JOptionPane;

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

            Métodos constructores:  Son métodos, se ejecutan automáticamente al crear un objeto,
            Si la clase no tiene constructor, Java al compilar agrega un costructor vacio.
            Los constructores pueden sobrecargase (Con distinta firma de parámetros de entrada)
            Los constructores sirven para inicializar un objeto (Estado), Los constructores tienen
            el mismo nombre que la clase e inicia su nombre en máyusculas

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
        auto1.acelerar(25);     //45

        //Imprimo el estado del objeto auto1
        System.out.println(auto1.marca+", "+auto1.modelo+", "+auto1.color+", "+auto1.velocidad);

        System.out.println("-- auto2 --");
        Auto auto2=new Auto();
        auto2.marca="Fiat";
        auto2.modelo="Idea";
        auto2.color="Gris";

        for(int a=0; a<=60; a++)    auto2.acelerar();

        System.out.println(auto2.marca+", "+auto2.modelo+", "+auto2.color+", "+auto2.velocidad);

        System.out.println("-- auto3 --");
        Auto auto3=new Auto("Citroen","C4","Bordo");
        auto3.acelerar(56);
        auto3.imprimirVelocidad();
        System.out.println(auto3.obtenerVelocidad());        

        //JOptionPane.showMessageDialog(null, "Hola a todos!!");
        //JOptionPane.showMessageDialog(null, "Velocidad: "+auto3.obtenerVelocidad());

        //Método toString
        System.out.println(auto3.toString());
        System.out.println(auto3);


    }
}