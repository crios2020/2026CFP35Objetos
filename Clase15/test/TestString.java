package test;

import java.time.ZoneId;

public class TestString {
    public static void main(String[] args) {
        System.out.println("-- Test String --");

        String st="hola";

        //métodos .equals() .equalsIgnoreCase()
        System.out.println(st.equals("hola"));                          //true
        System.out.println(st.equals("Hola"));                          //false
        System.out.println(st.equalsIgnoreCase("HOLA"));            //true
        System.out.println(st.equalsIgnoreCase("chau"));            //false
        
        //métodos .startsWith() .endsWith()
        System.out.println(st.startsWith("h"));                             //true
        System.out.println(st.startsWith("a"));                             //false
        System.out.println(st.endsWith("h"));                               //false
        System.out.println(st.endsWith("a"));                               //true

        //método .trim()
        System.out.println("  hola a todos!!!    ".trim());                         //"hola a todos!!!"

        //métodos .toLowerCase() .toUpperCase()
        System.out.println(st.toUpperCase());                                       //"HOLA"
        System.out.println("CArlos Rios".toLowerCase());                            //"carlos rios"

        String texto="Hola a todos!!!";
        System.out.println(texto.toLowerCase());
        System.out.println(texto.toUpperCase());

        //método .chatAt()
        System.out.println(st.charAt(0));                                   // h
        System.out.println(st.charAt(1));                                   // o
        System.out.println(st.charAt(2));                                   // l
        System.out.println(st.charAt(3));                                   // a

        //método .subString()
        System.out.println(texto.substring(5));
        System.out.println(texto.substring(5, 10));

        //método .containt()
        System.out.println(texto.contains("hola"));                         //false
        System.out.println(texto.toLowerCase().contains("hola"));           //true
        System.out.println(texto.contains("chau"));                         //false

        //método .indexOf()
        System.out.println(texto.indexOf("a"));                             //3
        System.out.println(texto.indexOf("do"));                            //9
        System.out.println(texto.indexOf("z"));                             //-1

        //método .split()
        String[] palabras=texto.split(" ");
        System.out.println(palabras[0]);                                        //Hola
        System.out.println(palabras[1]);                                        //a
        System.out.println(palabras[2]);                                        //todos!!!

        //método .replace()
        System.out.println(texto.replace("a", "x"));

        System.out.println(
                            ZoneId
                                    .systemDefault()
                                    .toString()
                                    .replace("/", ", ")
                                    .replace("_", " ")
                            );

                            


    }
}
