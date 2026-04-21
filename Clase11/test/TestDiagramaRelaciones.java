package test;
import entities.ClienteEmpresa;
import entities.ClientePersona;
import entities.Cuenta;

public class TestDiagramaRelaciones {
    public static void main(String[] args) {
        System.out.println("-- Test Diagrama Relaciones --");

        System.out.println("-- cuenta1 --");
        Cuenta cuenta1=new Cuenta(1,"arg$");
        cuenta1.depositar(250000);
        cuenta1.depositar(360000);
        cuenta1.debitar(35000);
        System.out.println(cuenta1);

        System.out.println("-- clientePersona1 --");
        ClientePersona clientePersona1=new ClientePersona(1, "Juan Perez", 32, cuenta1);
        clientePersona1.getCuenta().depositar(78000);
        clientePersona1.getCuenta().debitar(50000);
        System.out.println(clientePersona1);

        System.out.println("-- clienteConyuge1 --");
        ClientePersona clienteConyuge1=new ClientePersona(2, "Beatriz Gomez", 31, clientePersona1.getCuenta());
        clienteConyuge1.getCuenta().debitar(600000);
        System.out.println(clienteConyuge1);
        System.out.println(clientePersona1);

        System.out.println("-- clientePersona2 --");
        ClientePersona clientePersona2=new ClientePersona(3, "Cristian Molina", 26, 2, "arg$");
        clientePersona2.getCuenta().depositar(340000);
        clientePersona2.getCuenta().debitar(20000);
        System.out.println(clientePersona2);

        System.out.println("-- clienteEmpresa1 --");
        ClienteEmpresa clienteEmpresa1=new ClienteEmpresa(1, "Todo Limprio srl", "Lima 234");
        clienteEmpresa1.getCuentas().add(new Cuenta(10, "arg$"));           // 0
        clienteEmpresa1.getCuentas().add(new Cuenta(11, "reales"));         // 1
        clienteEmpresa1.getCuentas().add(new Cuenta(12, "U$D"));            // 2
        clienteEmpresa1.getCuentas().get(0).depositar(580000);
        clienteEmpresa1.getCuentas().get(0).debitar(70000);
        clienteEmpresa1.getCuentas().get(1).depositar(25000);
        clienteEmpresa1.getCuentas().get(2).depositar(12000);
        System.out.println(clienteEmpresa1);



    }
}
