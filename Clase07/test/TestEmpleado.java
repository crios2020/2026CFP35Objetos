package test;

import entities.Empleado;

public class TestEmpleado {

    public static void main(String[] args) {
        System.out.println("-- empleado1 --");
        Empleado empleado1=new Empleado(1, "Carlos", "Rios", 800000);
        //empleado1.sueldoBasico=900000000;
        empleado1.setSueldoBasico(900000000);        
        empleado1.setSueldoBasico(1999999);      

        System.out.println(empleado1);
    }
    
}
