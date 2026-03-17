public class Clase03{
    public static void main(String[] args) {
        //Clase 03
        System.out.println("-- Clase 03 --");
        System.out.println("Versión de JAVA: "+System.getProperty("java.version"));
        System.out.println("Provedoor de JAVA: "+System.getProperty("java.vm.name"));

        //System.out.println(System.getProperties());

        //Estructuras de programación


        String texto="Hola a todos!! Buen día, Buen Año de estudios!!!";

        //recorrido del vector texto
        for(int a=0;a<texto.length();a++){
            System.out.print(texto.charAt(a));
        }
        System.out.println();
        System.out.println(texto);


        //Imprimir el vector texto todo en minúsculas
        for(int a=0;a<texto.length();a++){
            char car=texto.charAt(a);
            if(car>=65 && car<=90){
                car+=32;
            }
            System.out.print(car);
        }
        System.out.println();   

        //Operador condicional ternario ?
        for(int a=0;a<texto.length();a++){
            char car=texto.charAt(a);
            System.out.print((car>=65 && car<=90)?(car+=32):(car));
        }
        System.out.println();

        //Imprimir el vector texto todo en mayúsculas
        for(int a=0;a<texto.length();a++){
            char car=texto.charAt(a);
            System.out.print((car>=97 && car<=122)?(car-=32):(car));
        }
        System.out.println();

        //Métodos .toLowerCase() .toUpperCase()  
        System.out.println(texto.toLowerCase());
        System.out.println(texto.toUpperCase());

    }
}