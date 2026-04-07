package entities;
public class Rectangulo{ 
    private double lado1;
    private double lado2;
    
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo [lado1=" + lado1 + ", lado2=" + lado2 + "]";
    }

    public double getPerimetro(){
        return (lado1+lado2)*2;
    }

    public double getSuperficie(){
        return lado1*lado2;
    }
}