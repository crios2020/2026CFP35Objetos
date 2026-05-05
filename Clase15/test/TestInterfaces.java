package test;

import interfaces.I_File;
import utils.FileBinary;
import utils.FileText;

public class TestInterfaces {
    public static void main(String[] args) {
        System.out.println("Versión de Java: "+System.getProperty("java.version"));
        System.out.println("-- Interfaces --");

        I_File file=null;

        //Inicialización
        //file=new FileText();
        file=new FileBinary();

        //App
        file.setText("hola");
        System.out.println(file.getText());
        file.info();

    }
}
