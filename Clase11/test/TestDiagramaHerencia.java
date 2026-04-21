package test;

import entities.Cliente;
import entities.Cuenta;
import entities.Direccion;
import entities.Persona;
import entities.Vendedor;

public class TestDiagramaHerencia {
    public static void main(String[] args) {
        System.out.println("-- Test Diagrama Herencia --");

        System.out.println("-- cuenta1 --");
        Cuenta cuenta1=new Cuenta(1,"arg$");
        cuenta1.depositar(250000);
        cuenta1.depositar(360000);
        cuenta1.debitar(35000);
        System.out.println(cuenta1);

        System.out.println("-- direccion1 --");
        Direccion direccion1=new Direccion("Lima", 120, "4", "e");
        System.out.println(direccion1);

        System.out.println("-- direccion2 --");
        Direccion direccion2=new Direccion("Belgrano", 150, null, null, "Morón");
        System.out.println(direccion2);

        /*
        System.out.println("-- persona1 --");
        Persona persona1 = new Persona("Juan", 28, direccion2);
        System.out.println(persona1);
        persona1.saludar();
        */

        System.out.println("-- vendedor1 --");
        Vendedor vendedor1 = new Vendedor("Javier", 32, direccion1, 1, 250000);
        System.out.println(vendedor1);
        vendedor1.saludar();

        System.out.println("-- cliente1 --");
        Cliente cliente1 = new Cliente("Ana", 40, direccion2, 1, cuenta1);
        cliente1.getCuenta().depositar(480000);
        System.out.println(cliente1);
        cliente1.saludar();

    }
}
