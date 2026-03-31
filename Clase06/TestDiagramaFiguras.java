public class TestDiagramaFiguras {
    public static void main(String[] args) {
        // Objeto Mock - Objeto simulado de prueba

        System.out.println("-- Test Diagrama Fíguras --");

        System.out.println("-- rectangulo1 --");
        Rectangulo rectangulo1=new Rectangulo(30, 50);
        System.out.println(rectangulo1);    //toString()
        System.out.println("Perímetro: "+rectangulo1.getPerimetro());
        System.out.println("Superficie: "+rectangulo1.getSuperficie());

    }
}
