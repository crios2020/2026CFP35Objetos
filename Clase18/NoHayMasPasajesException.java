public class NoHayMasPasajesException extends Exception{
    
    private String nombre;
    private int cantidadPasajesDisponibles;
    private int cantidadPasajesPedidos;

    public NoHayMasPasajesException(String nombre, int cantidadPasajesDisponibles, int cantidadPasajesPedidos) {
        this.nombre = nombre;
        this.cantidadPasajesDisponibles = cantidadPasajesDisponibles;
        this.cantidadPasajesPedidos = cantidadPasajesPedidos;
    }

    @Override
    public String getMessage() {
        return "El vuelo "+nombre+", no tiene "+cantidadPasajesPedidos+" pasajes, solo tiene "+cantidadPasajesDisponibles+" pasajes";
    }

    @Override
    public String toString() {
        return this.getMessage();
    }
    
}
