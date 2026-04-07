package test;
import java.text.DecimalFormat;

import entities.Circulo;
import entities.Rectangulo;
import entities.Triangulo;

public class TestDiagramaFiguras {
    public static void main(String[] args) {
        // Objeto Mock - Objeto simulado de prueba

        DecimalFormat df=new DecimalFormat("0.00");

        System.out.println("-- Test Diagrama Fíguras --");

        System.out.println("-- rectangulo1 --");
        Rectangulo rectangulo1=new Rectangulo(30, 50);
        System.out.println(rectangulo1);    //toString()
        System.out.println("Perímetro: "+df.format(rectangulo1.getPerimetro()));
        System.out.println("Superficie: "+df.format(rectangulo1.getSuperficie()));

        System.out.println("-- triangulo1 --");
        Triangulo triangulo1=new Triangulo(30, 50);
        System.out.println(triangulo1);
        System.out.println("Perímetro: "+df.format(triangulo1.getPerimetro()));
        System.out.println("Superficie: "+df.format(triangulo1.getSuperficie()));

        System.out.println("-- circulo1 --");
        Circulo circulo1=new Circulo(60);
        System.out.println(circulo1);
        System.out.println("Perímetro: "+df.format(circulo1.getPerimetro()));
        System.out.println("Superficie: "+df.format(circulo1.getSuperficie()));

    }
}
