public class Auto implements Comparable<Auto> {
    private String marca;
    private String modelo;
    private String color;

    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public int compareTo(Auto auto) {
        int resultado = this.marca.compareTo(auto.marca);
        if (resultado == 0)     resultado = this.modelo.compareTo(auto.modelo);
        if (resultado == 0)     resultado = this.color.compareTo(auto.color);
        return resultado;
    }

}
