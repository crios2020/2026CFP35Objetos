//Declaración de clase
public class Auto {
    
    //Atributos
    String marca;
    String modelo;
    String color;
    int velocidad;

    //Métodos
    void acelerar(){
        velocidad+=10;
        if(velocidad>100)       velocidad=100;      //Reglas de negocio
    }

    void frenar(){
        velocidad-=10;
    }

}//end class Auto
