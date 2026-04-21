package entities;

public class Rectangulo extends Figura{
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo [base=" + base + ", altura=" + altura + "]";
    }

    @Override
    public String getEstado() {
        return this.toString();
    }

    @Override
    public double getPerimetro() {
        return (base+altura)*2;
    }

    @Override
    public double getSuperficie() {
        return base*altura;
    }
    
}
