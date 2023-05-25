package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TarjetaNvidia {
    private int id;
    private String url;
    private String nombre;
    private String serie;
    private String fabricante;
    private Double precio;

    public TarjetaNvidia() {
    }

    public TarjetaNvidia(int id, String url, String nombre, String serie, String fabricante, double precio) {
        this.id = id;
        this.url = url;
        this.nombre = nombre;
        this.serie = serie;
        this.fabricante = fabricante;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "TarjetaNvidia{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", nombre='" + nombre + '\'' +
                ", serie='" + serie + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", precio=" + precio +
                '}';
    }

    public ImageIcon getImagen() throws MalformedURLException {
        URL urlImage = new URL(this.url);
        return new ImageIcon(urlImage);
    }
}
