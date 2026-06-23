import java.util.Comparator;
import java.util.List;

public class TestApiStream {
    public static void main(String[] args) {
        System.out.println("-- Api Stream --");

        List<Persona> personas=PersonaRepository.getList();

        //select * from personas
        System.out.println("--------------------------------------------------------------");
        //personas.forEach(System.out::println);
        personas.stream().forEach(System.out::println);

        //select * from personas where nombre="Juan"
        System.out.println("--------------------------------------------------------------");
        personas
                .stream()
                //.filter(p->p.getNombre().equals("Juan"))                              //Case Sensitive
                .filter(p->p.getNombre().equalsIgnoreCase("juan"))      //No es Case Sensitive
                .forEach(System.out::println);

        //Consulta usando programación estructurada, solo consulta o recorre colleciones
        //for (Persona p : personas) {
        //    if(p.getNombre().equals("Juan")){
        //        System.out.println(p);
        //    }
        //}

        //select * from personas where nombre="Juan" and edad>=30
        System.out.println("--------------------------------------------------------------");
        //        personas
        //        .stream()
        //        .filter(p->p.getNombre().equalsIgnoreCase("juan") 
        //                && p.getEdad()>=30)
        //        .forEach(System.out::println);

        personas
                .stream()
                .filter(p->p.getNombre().equalsIgnoreCase("juan"))
                .filter(p->p.getEdad()>=30)   
                .forEach(System.out::println);

        //select * from personas where nombre="Juan" or edad>=30
        System.out.println("--------------------------------------------------------------");
        personas
                .stream()
                .filter(p->p.getNombre().equalsIgnoreCase("juan") 
                        || p.getEdad()>=30)
                .forEach(System.out::println);

        //select * from personas where edad>=20 and edad<=30
        //select * from personas where edad between 20 and 30
        System.out.println("--------------------------------------------------------------");
        personas
                .stream()
                .filter(p->p.getEdad()>=20) 
                .filter(p->p.getEdad()<=30)   
                .forEach(System.out::println);    

        //select * from personas where edad<20 or edad>30
        //select * from personas where edad not between 20 and 30
        System.out.println("--------------------------------------------------------------");
        personas
                .stream()
                .filter(p->p.getEdad()<20 || p.getEdad()>30) 
                .forEach(System.out::println); 

        //select * from personas where nombre like "a%"
        System.out.println("--------------------------------------------------------------");
        personas
                .stream()
                .filter(p->p.getNombre().toLowerCase().startsWith("a")) 
                .forEach(System.out::println); 

        //select * from personas where nombre like "%a"
        System.out.println("--------------------------------------------------------------");
        personas
                .stream()
                .filter(p->p.getNombre().toLowerCase().endsWith("a")) 
                .forEach(System.out::println); 

        //select * from personas where nombre like "%ar%"
        System.out.println("--------------------------------------------------------------");
        personas
                .stream()
                .filter(p->p.getNombre().toLowerCase().contains("ar")) 
                .forEach(System.out::println); 

        //select * from personas where nombre not like "%a"
        System.out.println("--------------------------------------------------------------");
        personas
                .stream()
                .filter(p->!p.getNombre().toLowerCase().endsWith("a")) 
                .forEach(System.out::println); 

        //select * from personas order by nombre
        System.out.println("--------------------------------------------------------------");
        personas
                .stream()
                .sorted(Comparator.comparing(Persona::getNombre))
                .forEach(System.out::println); 

        //select * from personas order by nombre desc
        System.out.println("--------------------------------------------------------------");
        personas
                .stream()
                .sorted(Comparator.comparing(Persona::getNombre).reversed())
                .forEach(System.out::println); 


        //select * from personas order by apellido,nombre
        System.out.println("--------------------------------------------------------------");
        personas
                .stream()
                .sorted(
                            Comparator
                                .comparing(Persona::getApellido)
                                .thenComparing(Persona::getNombre)
                        )
                .forEach(System.out::println); 

        //select * from personas where edad>=30 order by apellido,nombre
        System.out.println("--------------------------------------------------------------");
        personas
                .stream()
                .filter(p->p.getEdad()>=30)
                .sorted(
                            Comparator
                                .comparing(Persona::getApellido)
                                .thenComparing(Persona::getNombre)
                        )
                .forEach(System.out::println); 

    }
}
