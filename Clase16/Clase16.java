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

        try {
            //GeneradorDeExceptions.generar();
            //GeneradorDeExceptions.generar(true);
            //GeneradorDeExceptions.generar("22x");
            GeneradorDeExceptions.generar(null, 0);
            GeneradorDeExceptions.generar("hola", 10);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}