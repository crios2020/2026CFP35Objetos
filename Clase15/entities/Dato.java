package entities;

public class Dato {
    public int dato;

    public Dato(int dato) {
        this.dato = dato;
    }

    @Override
    public int hashCode() {
        return this.dato+"".hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        return this.toString().equals(obj.toString());
    }

}
