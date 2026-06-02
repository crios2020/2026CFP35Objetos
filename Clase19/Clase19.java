import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
        semana.forEach(System.out::println);
        System.out.println("Cantidad de Elementos en semana: "+semana.size());
        System.out.println(semana.get(3));


    }
}