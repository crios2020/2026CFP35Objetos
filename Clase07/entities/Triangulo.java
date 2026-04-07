package entities;
public class Triangulo {
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

    public double getPerimetro(){
        return base+altura+Math.hypot(base, altura);
    }

    public double getSuperficie(){
        return base*altura/2;
    }
    
}
