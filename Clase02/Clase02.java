public class Clase02{

    //método main, permite que la clase se ejecute
    public static void main(String[] args) {
        //punto de entrada al programa!

        System.out.println("-- Clase 02 --");
        System.out.println("- Tipo de datos primitivo.");

        // Paradigma de objetos Wikipedia
        // https://en.wikipedia.org/wiki/Object-oriented_programming

        // Tipo de datos primitivos

        // Lenguajes tipado debil: Python, PHP, Javascript
        // Lenguajes tipado fuerte: Java, C++, C#, VisualBasic, Arduino, Typescript, Kotlin

        // Tipo de datos boolean        true(1) false(0) 1 bit      1 byte (8 bits)
        boolean bo=true;                //1
        System.out.println(bo);
        bo=false;                       //0
        System.out.println(bo);         
        //bo="true";                //Error no permitido
        //bo=1;                     //Error no permitido    

        /*
            00000001
            --------
        */

        // Tipo de datos entero byte            1 byte
        byte by=100;
        System.out.println(by);
        by=-100;
        //by=-150;                  //Error fuera de rango numerico
        //by=128;                   //Error fuera de rango numerico

        /*
            by=100;             // signed

            |-------|-------|
          -128      0      127

            Java no tiene tipo de datos unsigned
            byteY byU=100;    
            
            |---------------|
            0              256
            
        */

        // Tipo de datos entero short          2 bytes      65536
        short sh=1000;
        System.out.println(sh);

        // Tipo de datos entero int             4 bytes     4mil, millones
        int in=10000;
        System.out.println(in);
        in=2000000000;
        System.out.println(in);
        //in=2500000000;                        //Error fuera de rando numerico
        //System.out.println(in);

        // Tipo de datos entero long            8 bytes     
        long lo=2500000000L;
        System.out.println(lo);

        // Tipo de datos char unicode           2 bytes unsigned  0-65536
        char ch=65;
        System.out.println(ch);                 //A
        ch+=32;
        System.out.println(ch);                 //a

        ch='S';
        System.out.println(ch);

        // Tipo de datos punto flotante
        // Tipo de datos float 32 bits
        float fl=3.25f;
        System.out.println(fl);

        // Tipo de datos double 64 bits
        double dl=3.25;
        System.out.println(dl);

        //fl=dl;        //Error
        dl=fl;

        fl=10;
        dl=10;
        System.out.println(fl/3);
        System.out.println(dl/3);

        fl=100;
        dl=100;
        System.out.println(fl/3);
        System.out.println(dl/3);

        fl=1000;
        dl=1000;
        System.out.println(fl/3);
        System.out.println(dl/3);

        //Clase String
        String st="hola";
        System.out.println(st);

        

    }
}