import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Clase16{
    public static void main(String[] args) {
        System.out.println("-- Manejo de Exceptions --");

        //System.out.println(10/0);
        //System.out.println("-- Esta linea no se ejecuta!!!");

        /*

            Estructura Try Catch Finally

            try{                                    //Obligatoria
                - Las sentencias ubicadas en esta parte si se puede, se ejecutan con nomalidad.
                - Si ocurre un error, no se detiene, se lanza una exception y continua la ejecución 
                        en el bloque catch.
                - Si no ocurre error el bloque try termina normalmente y continua la ejecución en el bloque finally
                - Colocar acá las sentencias que pueden lanzar exception.
                - Estas sentencias tiene más costo de hardware.
            } catch(Exception e){                   //Obligatoria
                - Este bloque se ejecuta en caso de existir exception en el bloque try.
                - En este bloque se toman las medidas necesarias para contener el error.
                - Se recibe como parámetro un objeto del tipo exception con las caracteristicas del error.
                - Continua la ejecución en el bloque finally
            } finally {                             //Opcional
                - Este bloque se ejecuta siempre, exista o no expception.
                - Las variables declaradas en try o catch estan fuera alcance (Scope)
            }


        */

        /*
        try {
            System.out.println(10/0);       //Esta sentencia lanza una exception
            System.out.println("Esta linea no se ejecuta!!!");
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
            System.out.println(e);
        } finally {
            System.out.println("El programa termina normalmente!");
        }
        */

        /*
        try {
            System.out.println(10/0);       //Esta sentencia lanza una exception
            System.out.println("Esta linea no se ejecuta!!!");
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
            System.out.println(e);
        }
        System.out.println("El programa termina normalmente!");
        */

        /*
        try {
            //GeneradorDeExceptions.generar();
            //GeneradorDeExceptions.generar(true);
            //GeneradorDeExceptions.generar("22x");
            GeneradorDeExceptions.generar(null, 0);
            GeneradorDeExceptions.generar("hola", 10);
        } catch (Exception e) {
            System.out.println(e);
        }
        */

        //GeneradorDeExceptions.generar(); //no checked Exception
        //System.out.println("Esta linea no se ejecuta!");
        //El progrema se detiene acá

        //FileReader fr=new FileReader("texto.txt");  //Checked Exception


        //Captura de Exceptions personalizada
        /*
        try {
            //GeneradorDeExceptions.generar();
            //GeneradorDeExceptions.generar(true);
            //GeneradorDeExceptions.generar("22x");
            //GeneradorDeExceptions.generar(null, 0);
            //GeneradorDeExceptions.generar("hola", 10);

            FileReader fr=new FileReader("texto.txt"); 
            System.out.println(fr.read());
        //} catch (StringIndexOutOfBoundsException e)     { System.out.println("Índice fuera de rango!");
        } catch (NullPointerException e)                { System.out.println("Puntero Nulo!");
        } catch (NumberFormatException e)               { System.out.println("Error de formato númerico!");
        //} catch (ArrayIndexOutOfBoundsException e)      { System.out.println("Índice fuera de rango!");
        } catch (ArithmeticException e)                 { System.out.println("Error división x 0!");
        } catch (IndexOutOfBoundsException e)           { System.out.println("Índice fuera de rango!");
        //} catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) 
        //                                                { System.out.println("Índice fuera de rango!");
        } catch (FileNotFoundException e)               { System.out.println("Archivo no encontrado!");
        } catch (IOException e)                         { System.out.println("Error de IO!");
        } catch (Exception e)                           { System.out.println("Ocurrio un error no esperado!");
        }
        */


        //Uso de Exceptions para validar reglas de negocio
        Vuelo vuelo1=new Vuelo("AER1000", 100);
        Vuelo vuelo2=new Vuelo("LAT1111", 100);

        System.out.println(vuelo1);
        System.out.println(vuelo2);
        System.out.println("- Inicio de venta de pasajes -");
        try {
            vuelo1.venderPasajes(50);
            vuelo2.venderPasajes(30);   
            vuelo1.venderPasajes(40);
            vuelo2.venderPasajes(20);
            vuelo1.venderPasajes(30);               // Esta venta lanza una Exception
            vuelo2.venderPasajes(20);               // Esta venta no se realiza
        } catch (NoHayMasPasajesException e) {
            System.out.println(e);
        }
    
        System.out.println("- Fin de venta de pasajes -");
        System.out.println(vuelo1);
        System.out.println(vuelo2);
    }
}