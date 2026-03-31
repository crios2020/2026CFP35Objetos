public class Triangulo {
    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", altura=" + altura + "]";
    }

    double getPerimetro(){
        return base+altura+Math.hypot(base, altura);
    }

    double getSuperficie(){
        return base*altura/2;
    }
    
}
