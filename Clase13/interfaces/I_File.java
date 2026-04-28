package interfaces;

public interface I_File {
    /*
        Interface en Java
        - No contienen atributos ni constructores.
        - No tiene miembros privados ni protected ni default, Todos los
            miembros de la interface son publicos.
        - Puede tener atributos estaticos.
        - Todos los métodos son abstractos.
        - Una clase puede implementar muchas interfaces.
    */

    public abstract void setText(String text);
    public abstract String getText(); 

    /*
        Métodos default (JDK 8 o superior): Los métodos default son métodos no abstractos con código.
        Como una clase puede implementar muchas interfaces, se genera una especie de herencia multiple
    */
    public default void info(){
        System.out.println("Interface I_File");
    }

}
