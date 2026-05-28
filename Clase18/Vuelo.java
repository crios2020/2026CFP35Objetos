public class Vuelo {

    private String nombre;
    private int cantidadPasajes;

    public Vuelo(String nombre, int cantidadPasajes) {
        this.nombre = nombre;
        this.cantidadPasajes = cantidadPasajes;
    }

    public synchronized void venderPasajes(int cantidadPasajesPedidos) throws NoHayMasPasajesException {
        if(cantidadPasajesPedidos>cantidadPasajes) 
            throw new NoHayMasPasajesException(nombre, cantidadPasajes, cantidadPasajesPedidos);
        this.cantidadPasajes-=cantidadPasajesPedidos;
    }

    @Override
    public String toString() {
        return "Vuelo [nombre=" + nombre + ", cantidadPasajes=" + cantidadPasajes + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadPasajes() {
        return cantidadPasajes;
    }

}
