package entities;

public class Vendedor extends Persona {
    private int nroLegajo;
    private double sueldoBasico;

    public Vendedor(String nombre, int edad, Direccion direccion, int nroLegajo, double sueldoBasico) {
        super(nombre, edad, direccion);
        this.nroLegajo = nroLegajo;
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy 1 vendedor!");
    }

    @Override
    public String toString() {
        return "Vendedor [nroLegajo=" + nroLegajo + ", sueldoBasico=" + sueldoBasico + ", Persona="
                + super.toString() + "]";
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }   

    
}
