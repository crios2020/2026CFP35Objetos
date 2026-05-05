package entities;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", altura=" + altura + "]";
    }

    @Override
    public String getEstado() {
        return this.toString();
    }
    @Override
    public double getPerimetro() {
        return base+altura+Math.hypot(base, altura);
    }
    @Override
    public double getSuperficie() {
        return base*altura/2;
    }


}
