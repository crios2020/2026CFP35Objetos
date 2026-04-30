package entities;

public class Cliente extends Persona{
    private int nroCliente;
    private Cuenta cuenta;
    
    public Cliente(String nombre, int edad, Direccion direccion, int nroCliente, Cuenta cuenta) {
        super(nombre, edad, direccion);
        this.nroCliente = nroCliente;
        this.cuenta = cuenta;
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy 1 cliente!");
    }

    @Override
    public String toString() {
        return "Cliente [nroCliente=" + nroCliente + ", cuenta=" + cuenta + ", Persona=" + super.toString() + "]";
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

}
