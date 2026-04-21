package entities;

public class ClientePersona {
    private int nro;
    private String nombre;
    private int edad;
    private Cuenta cuenta;

    /*
     * Un clientePersona, puede crearse sin una cuenta
     */
    public ClientePersona(int nro, String nombre, int edad) {
        this.nro = nro;
        this.nombre = nombre;
        this.edad = edad;
    }

    /*
     * Un cliente persona, siempre tiene una cuenta,
     * Una cuenta puede pertenecer a más de un cliente
    */
    public ClientePersona(int nro, String nombre, int edad, Cuenta cuenta) {
        this.nro = nro;
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = cuenta;
    }

    /*
     * Un cliente persona, siempre tiene una cuenta,
     * Una cuenta solo pertenece a un solo cliente.
    */
    public ClientePersona(int nro, String nombre, int edad, int nroCuenta, String moneda) {
        this.nro = nro;
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = new Cuenta(nroCuenta, moneda);
    }

    public Cuenta getCuenta(){
        return this.cuenta;
    }

    public void comprar(){
        System.out.println("Cliente realizando compra!");
    }

    @Override
    public String toString() {
        return "ClientePersona [nro=" + nro + ", nombre=" + nombre + ", edad=" + edad + ", cuenta=" + cuenta + "]";
    }
    
}
