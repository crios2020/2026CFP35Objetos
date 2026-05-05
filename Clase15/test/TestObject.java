package test;

import entities.Dato;

public class TestObject {
    public static void main(String[] args) {
        System.out.println("-- Clase Object --");

        Object o=2;

        System.out.println(o.toString());

        Dato d1=new Dato(2);
        Dato d2=d1;
        Dato d3=new Dato(d1.dato);
        String d4="2";
        String d5="2";

        //d2.dato=4;

        //método hashcode()
        System.out.println("d1: "+d1.dato+"\t"+d1.hashCode());
        System.out.println("d2: "+d2.dato+"\t"+d2.hashCode());
        System.out.println("d3: "+d3.dato+"\t"+d3.hashCode());
        System.out.println("d4: "+d4+"\t"+d4.hashCode());
        System.out.println("d5: "+d5+"\t"+d5.hashCode());

        //método equals()
        System.out.println("d1.equals(d1): "+d1.equals(d1));            //true
        System.out.println("d1.equals(d2): "+d1.equals(d2));            //true
        System.out.println("d1.equals(d3): "+d1.equals(d3));            //false //true
        System.out.println("d1.equals(d4): "+d1.equals(d4));            //false
        System.out.println("d4.equals(d5): "+d4.equals(d5));            //true

        //método getClass() getSupeClass()
        System.out.println(d1.getClass().getName());
        System.out.println(d1.getClass().getSuperclass().getName());


    }
}
