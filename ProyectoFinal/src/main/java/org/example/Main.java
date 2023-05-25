package org.example;

import org.example.controlador.ControladorTarjeta;
import org.example.vista.VentanaTarjeta;

public class Main {
    public static void main(String[] args) {
        VentanaTarjeta view = new VentanaTarjeta("Proyecto Final");
        ControladorTarjeta controller = new ControladorTarjeta(view);
    }
}