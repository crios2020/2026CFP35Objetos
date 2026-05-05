package test;

import java.util.Scanner;

public class TestSystem {
    public static void main(String[] args) {
        System.out.println("-- Test Clase System --");

        //Esta clase representa nuestro sistema y nos abstrae del sistema

        // Atributos static out err in
        // out: representa el stream de salida en consola en forma sincronica
        // err: representa el stream de salida en consola en forma no sincronica
        // in:  representa el stream de ingresos de datos sincronico

        System.out.println("-- Impresión Sincronica -- 01");
        System.out.println("-- Impresión Sincronica -- 02");
        System.out.println("-- Impresión Sincronica -- 03");
        System.out.println("-- Impresión Sincronica -- 04");
        System.out.println("-- Impresión Sincronica -- 05");
        System.out.println("-- Impresión Sincronica -- 06");
        System.out.println("-- Impresión Sincronica -- 07");
        System.out.println("-- Impresión Sincronica -- 08");
        System.out.println("-- Impresión Sincronica -- 09");
        System.out.println("-- Impresión Sincronica -- 10");
        System.out.println("-- Impresión Sincronica -- 11");
        System.out.println("-- Impresión Sincronica -- 12");
        System.out.println("-- Impresión Sincronica -- 13");
        System.out.println("-- Impresión Sincronica -- 14");
        System.out.println("-- Impresión Sincronica -- 15");
        System.out.println("-- Impresión Sincronica -- 16");
        System.out.println("-- Impresión Sincronica -- 17");
        System.out.println("-- Impresión Sincronica -- 18");
        System.out.println("-- Impresión Sincronica -- 19");
        System.out.println("-- Impresión Sincronica -- 20");
        
        System.err.println("-- Impresión No Sincronica --");

        //System.out.print("Ingrese su nombre: ");
        //String nombre=new Scanner(System.in).next();
        //System.out.println("Hola "+nombre);

        //Mapas de configuraciones
        //método getProperties()
        String mapa=System.getProperties().toString();
        String[] propiedades=mapa.split(", ");
        //System.out.println(mapa);
        for(int a=0; a<propiedades.length; a++) System.out.println(propiedades[a]);

        System.out.println("----------------------------------------------");
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.language"));
        System.out.println(System.getProperty("user.dir"));


    }
}
