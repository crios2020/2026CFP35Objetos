package entities;
public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }

    public double getPerimetro(){
        return Math.PI*radio*2;
    }

    public double getSuperficie(){
        //return Math.PI*radio*radio;
        return Math.PI*Math.pow(radio, 2);
    }
}
