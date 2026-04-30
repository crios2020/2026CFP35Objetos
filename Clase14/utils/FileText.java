package utils;

import interfaces.I_File;

public class FileText implements I_File{

    @Override
    public String getText() {
        return "Archivo de Texto!";
    }

    @Override
    public void setText(String text) {
        System.out.println("Escribiendo Archivo de texto");
    }
    
}
