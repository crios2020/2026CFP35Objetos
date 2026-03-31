public class Circulo {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }

    double getPerimetro(){
        return Math.PI*radio*2;
    }

    double getSuperficie(){
        //return Math.PI*radio*radio;
        return Math.PI*Math.pow(radio, 2);
    }
}
