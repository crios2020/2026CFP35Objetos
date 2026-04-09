package entities;

public class Cuenta {
    private int nro;
    private String moneda;
    private double saldo;
    
    public Cuenta(int nro, String moneda) {
        this.nro = nro;
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return "Cuenta [nro=" + nro + ", moneda=" + moneda + ", saldo=" + saldo + "]";
    }

    public void depositar(double monto){
        this.saldo+=monto;
    }

    public void debitar(double monto){
        if(monto<=saldo)    saldo-=monto;
        else                System.out.println("Saldo insuficiente!");
    }

}