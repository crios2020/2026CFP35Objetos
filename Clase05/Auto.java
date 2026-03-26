//Declaración de clase
public class Auto {
    
    //Atributos
    String marca;
    String modelo;
    String color;
    int velocidad;

    //Método constructor
    Auto(){}        //Constructor vacio

    Auto(String marca, String modelo, String color){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
    }

    //Métodos
    void acelerar(){
        //velocidad+=10;
        //if(velocidad>100)       velocidad=100;      //Reglas de negocio
        acelerar(10);       //llamado a método de la misma clase
    }

    //Sobrecarga de métodos
    //Método con parámetros de entrada
    /**
     * Método para acelerar el auto
     * @param kilometros Cantidad de kilometros por hora a aumentar la velocidad 
    */
    void acelerar(int kilometros){
        velocidad+=kilometros;
        if(velocidad>100)       velocidad=100;      //Reglas de negocio
    }

    void frenar(){
        velocidad-=10;
    }

    //Método sin devolución de valor
    void imprimirVelocidad(){
        System.out.println(velocidad);
    }

    //Método con devolución de valor
    int obtenerVelocidad(){
        return velocidad;
    }

    @Override
    public String toString(){
        return marca+", "+modelo+", "+color+", "+velocidad;
    }

}//end class Auto
