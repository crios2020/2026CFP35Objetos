import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Clase19{
    public static void main(String[] args) {
        
        //Vector - Array - Arreglo 
        Auto[] autos=new Auto[4];

        //Carga del vector
        autos[0]=new Auto("Ford", "Fiesta", "Rojo");            // 0
        autos[1]=new Auto("Citroen", "C4", "Negro");            // 1
        autos[2]=new Auto("Dodge", "Caravan", "Amarilla");      // 2
        autos[3]=new Auto("Fiat", "Mobi", "Blanco");            // 3

        //Recorrido por indices del vector
        //for(int a=0; a<autos.length; a++)   System.out.println(autos[a]);
        //Recorrido foreach
        for(Auto auto : autos)  System.out.println(auto);

        
        //Framework Collections
        //Interface List
        List<Auto> lista=new ArrayList();
        //List<Auto> lista=new LinkedList();
        //List<Auto> lista=new Vector();
        lista.add(new Auto("Renault", "Capture", "Azul"));      // 0
        lista.add(new Auto("Chevrolet", "Onix", "Gris"));       // 1
        lista.add(new Auto("BYD", "Dolphin", "Blanco"));        // 2
        lista.add(new Auto("Jetour", "X70", "Rojo"));           // 3

        lista.add(1, new Auto("Ford", "EcoSport", "Negro"));
        lista.remove(3);

        System.out.println("-----------------------------------------------");
        //Recorrido por indices de la List
        //for(int a=0; a<lista.size(); a++)   System.out.println(lista.get(a));
        //Recorrido foreach
        //for(Auto auto : lista)  System.out.println(auto);

        //Recorrido con método .forEach()
        //Lamda Expression
        //lista.forEach(auto->System.out.println(auto));
        //lista.forEach(auto->{
        //    System.out.println("-------------------------------------------");
        //    System.out.println(auto);
        //    System.out.println("-------------------------------------------");
        //});
        lista.forEach(System.out::println);

        //Lista de Días de la semana
        List<String>semana=new ArrayList();
        semana.add("Lunes");
        semana.add("Martes");
        semana.add("Miércoles");
        semana.add("Jueves");
        semana.add("Viernes");
        semana.add("Sábado");
        semana.add("Domingo");
        semana.add("Lunes");
        semana.add("Lunes");
        semana.forEach(System.out::println);
        System.out.println("Cantidad de Elementos en semana: "+semana.size());
        System.out.println(semana.get(3));

        System.out.println("-------------------------------------------");
        //Interface Set
        //Toda clase extendida (hija) de Set no permite valores duplicados
        
        System.out.println("-- Interface Set --");

        Set<String>week=null;

        //Implementación HashSet:   Es la implementación más veloz que existe
        //                          No se garantiza el orden de los elementos
        //week=new HashSet();

        //Implementación LinkedHashSet: Almacena los elementos por orden de ingreso
        week=new LinkedHashSet();

        //Implementación TreeSet:   Almacena elementos por orden natural, orden Alfabetico
        //week=new TreeSet();


        week.add("Lunes");
        week.add("Martes");
        week.add("Miércoles");
        week.add("Jueves");
        week.add("Viernes");
        week.add("Sábado");
        week.add("Domingo");
        week.add("Lunes");
        week.add("Lunes");
        week.forEach(System.out::println);
        System.out.println("Cantidad de Elementos en semana: "+week.size());


        System.out.println("-------------------------------------------");
        System.out.println("-- Polimorfismo --");
        Collection<String>nombres=null;

        //nombres=new ArrayList();            //Permite valores duplciados, almacena elementos por orden de ingreso
        //nombres=new LinkedHashSet();        //No Permite valores duplciados, almacena elementos por orden de ingreso
        nombres=new TreeSet();            //No Permite valores duplicados, almacena elementos por orden natural

        nombres.add("Lorena");
        nombres.add("Juan");
        nombres.add("Martin");
        nombres.add("Cristian");
        nombres.add("Laura");
        nombres.add("Lorena");
        nombres.add("Victor");
        nombres.add("Beatriz");
        nombres.add("Ana");
        nombres.add("Florencia");
        nombres.add("Micaela");
        nombres.add("Monica");
        nombres.add("Lorena");
        nombres.add("Hernan");
        nombres.add("Susana");
        nombres.add("Lorena");

        System.out.println("-------------------------------------------");
        System.out.println("Cantidad de Nombres: "+nombres.size());
        nombres.forEach(System.out::println);


        System.out.println("-------------------------------------------");
        System.out.println("-- Pila y Colas --");

        /*
                Estructura Pila     LIFO    Last In First Out
                Estructura Cola     FIFO    First In First Out
        
        */

        //Clase Stack - Pila
        Stack<Auto>pilaAutos=new Stack();
        
        //método .push() apila un elemento
        pilaAutos.push(new Auto("Dodge", "Polara", "Naranja"));

        pilaAutos.addAll(lista);

        System.out.println("-------------------------------------------");
        pilaAutos.forEach(System.out::println);
        System.out.println("-------------------------------------------");

        System.out.println("-- Longitud de Pila: "+pilaAutos.size());
        while (!pilaAutos.isEmpty()) {
            System.out.println(pilaAutos.pop());
            // método .pop() desapila un elemento
        }
        System.out.println("-- Longitud de Pila: "+pilaAutos.size());

        //Clase ArrayDeque - Cola
        ArrayDeque<Auto>colaAutos=new ArrayDeque();
        colaAutos.offer(new Auto("Renault", "4L", "Blanco"));
        //método .offer() encola un elemento
        colaAutos.addAll(lista);
        System.out.println("-------------------------------------------");
        colaAutos.forEach(System.out::println);
        System.out.println("-------------------------------------------");
        
        System.out.println("-- Longitud de Cola: "+colaAutos.size());
        while (!colaAutos.isEmpty()) {
            System.out.println(colaAutos.poll());
            //método .poll() desencola un elemento
        }
        System.out.println("-- Longitud de Cola: "+colaAutos.size());



    }
}