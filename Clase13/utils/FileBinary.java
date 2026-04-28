package utils;

import interfaces.I_File;

public class FileBinary implements I_File{

    @Override
    public String getText() {
        return "Archivo Binario";
    }

    @Override
    public void setText(String text) {
        System.out.println("Escribiendo Archivo Binario!");
    }

}
