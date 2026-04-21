package entities;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }

    @Override
    public String getEstado() {
        return this.toString();
    }

    @Override
    public double getPerimetro() {
        return Math.PI*radio*2;
    }

    @Override
    public double getSuperficie() {
        return Math.PI*radio*radio;
    }
 
}
