package entities;

import java.util.ArrayList;
import java.util.List;

public class ClienteEmpresa {
    private int nro;
    private String razonSocial;
    private String direccion;
    private List<Cuenta>cuentas = new ArrayList();
    
    public ClienteEmpresa(int nro, String razonSocial, String direccion) {
        this.nro = nro;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "ClienteEmpresa [nro=" + nro + ", razonSocial=" + razonSocial + ", direccion=" + direccion + ", cuentas="
                + cuentas + "]";
    }

    public void comprar(){
        System.out.println("Cliente Empresa realizando compra!");
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

}
