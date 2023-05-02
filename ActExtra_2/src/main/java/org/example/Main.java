package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LeerArchivo lectura = new LeerArchivo();

        try{
            lectura.leer("datos.txt");

            lectura.metodoUno("eee.txt"); //archivo no existente, mandara el error
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}