package test;

import java.text.DecimalFormat;

import entities.Circulo;
import entities.Rectangulo;
import entities.Triangulo;

public class TestDiagraFigura2 {
    public static void main(String[] args) {
        
        DecimalFormat df=new DecimalFormat("0.00");

        System.out.println("-- Test Diagrama Figura 2 --");
        
        System.out.println("-- rectangulo2 --");
        Rectangulo rectangulo1=new Rectangulo(30, 40);
        System.out.println(rectangulo1.getEstado());
        System.out.println("Perímetro: "+df.format(rectangulo1.getPerimetro()));
        System.out.println("Superficie: "+df.format(rectangulo1.getSuperficie()));

        System.out.println("-- triangulo1 --");
        Triangulo triangulo1 = new Triangulo(30, 40);
        System.out.println(triangulo1.getEstado());
        System.out.println("Perímetro: "+df.format(triangulo1.getPerimetro()));
        System.out.println("Superficie: "+df.format(triangulo1.getSuperficie()));

        System.out.println("-- circulo1 --");
        Circulo circulo1=new Circulo(50);
        System.out.println(circulo1.getEstado());
        System.out.println("Perímetro: "+df.format(circulo1.getPerimetro()));
        System.out.println("Superficie: "+df.format(circulo1.getSuperficie()));
    }
}
