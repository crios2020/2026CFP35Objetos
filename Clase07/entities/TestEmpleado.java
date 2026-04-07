package entities;

public class TestEmpleado {

        //una acción hacker es colocar una clase ejecutiva en este paqueta

        public static void main(String[] args) {
        System.out.println("-- empleado1 --");
        Empleado empleado1=new Empleado(1, "Carlos", "Rios", 800000);
        //empleado1.sueldoBasico=900000000;
        System.out.println(empleado1);
    }
}
