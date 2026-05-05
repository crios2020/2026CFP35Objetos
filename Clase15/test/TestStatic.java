package test;

import entities.Auto;

public class TestStatic {
    public static void main(String[] args) {
        System.out.println("-- Static --");

        /*
            Los miembros static pertenecen a la clase y no a los objetos
        */

        Auto.acelerar();                //10

        System.out.println("-- auto1 --");
        Auto auto1=new Auto("Fiat","Palio","Rojo");
        //auto1.acelerar();               //10
        //auto1.acelerar();               //20
        Auto.acelerar();                //20
        System.out.println(auto1);
        //System.out.println(auto1.getVelocidad());
        System.out.println(Auto.getVelocidad());

        System.out.println("-- auto2 --");
        Auto auto2=new Auto("Toyota", "Corolla", "Blanco");
        //auto2.acelerar();               //30
        System.out.println(auto2);
        //System.out.println(auto2.getVelocidad());
        System.out.println(Auto.getVelocidad());

        System.out.println(auto1);
        //System.out.println(auto1.getVelocidad());
        System.out.println(Auto.getVelocidad());


    }
}
