package entities;

public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private static int velocidad;

    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
    }

    public static void acelerar(){
        velocidad=velocidad+10;
    }

    public static int getVelocidad(){
        return velocidad;
    }
    
}
