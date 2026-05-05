package test;

import java.text.DecimalFormat;

import entities.Circulo;
import entities.Cliente;
import entities.Cuenta;
import entities.Direccion;
import entities.Figura;
import entities.Persona;
import entities.Rectangulo;
import entities.Triangulo;
import entities.Vendedor;

public class TestPolimorfismo{
    public static void main(String[] args) {
    
        //Polimorfismo - Poliformismo
        /*
            Que es polimorfismo: es cuando una clase cambia de comportamiento, 
            (sus métodos se comportan distinto en cada instancia)
        */
        
        System.out.println("-- vendedor v1 --");
        Vendedor v1=new Vendedor(
                                    "Lorena",                                               
                                    40,                                                       
                                    new Direccion("Lima", 222, "1", "a"), 
                                    1, 
                                    2500000
                                );
        System.out.println(v1);
        v1.saludar();
        
        System.out.println("-- cliente c1 --");
        Cliente c1=new Cliente(
                                    "Jose",
                                    32,
                                    new Direccion("Viel", 102, null, null),
                                    1,
                                    new Cuenta(1,"arg$")
                                );
        c1.getCuenta().depositar(650000);
        System.out.println(c1);
        c1.saludar();
    
        System.out.println("-- persona p1 --");
        //Persona p1=new Persona("Juan",34,new Direccion("Jujuy", 10, null, null));                        
        // Error no se puede crear un objeto de una clase abstracta 
        Persona p1=new Cliente(
                                "Pedro",
                                44,
                                new Direccion("Lima", 22, null, null),
                                2,
                                new Cuenta(2,"arg$")
                            );
        
        System.out.println("-- persona p2 --");
        Persona p2=new Vendedor(
                                "Nicolas", 
                                24, 
                                null, 
                                2, 
                                1000000
                            );

        System.out.println("------------------------------------------------------------------");
        System.out.println(p1);
        p1.saludar();               //saluda como cliente

        System.out.println("------------------------------------------------------------------");
        System.out.println(p2);
        p2.saludar();               //saluda como vendedor

        System.out.println("------------------------------------------------------------------");
        p1=v1;                      //se contiene un vendedor
        p2=c1;                      //se contiene un cliente
        p1.saludar();               //saluda como vendedor
        p2.saludar();               //saluda como cliente

        System.out.println("------------------------------------------------------------------");
        System.out.println("-- figura f1 --");
        Figura f1;
        //f1=new Rectangulo(20, 20);
        //f1=new Triangulo(20, 20);
        f1=new Circulo(20);

        DecimalFormat df=new DecimalFormat("0.00");
        System.out.println("Estado: "+f1.getEstado());
        System.out.println("Perímetro: "+df.format(f1.getPerimetro()));
        System.out.println("Superficie: "+df.format(f1.getSuperficie()));

        //Operador de Casteo ()
        v1=(Vendedor)p1;
        c1=(p2 instanceof Cliente)?(Cliente)p2:null;

        //Subtipos
        String texto="hola";

        System.out.println(p1.getClass());
        System.out.println(p1.getClass().getName());
        System.out.println(p1.getClass().getSimpleName());
        System.out.println(f1.getClass().getName());
        System.out.println(texto.getClass().getName());
        System.out.println(p1.getClass().getSuperclass().getName());
        System.out.println(p1.getClass().getSuperclass().getSuperclass().getName());
        System.out.println(f1.getClass().getSuperclass().getSuperclass().getName());
        System.out.println(texto.getClass().getSuperclass().getName());
        System.out.println(p1.getClass().getSuperclass().getSuperclass().getSuperclass());
        
        Object o;
        o=2;
        o=3.4;
        o=texto;
        o=p1;
        o=f1;
        System.out.println(o.toString());

        //Polimorfismo por interfaces
        //Static
        //Métodos de la clase Object
        //TODO Métodos de la clase String
        //TODO Clase System
        //TODO Trabajo1
        


    }
}