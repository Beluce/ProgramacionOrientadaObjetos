import java.awt.*;

public class Pluma {

    private String marca;
    private String modelo;
    private Color color;
    private String punta;

    public Pluma() {
    }

    public Pluma(String marca, String modelo, Color color, String punta) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.punta = punta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getPunta() {
        return punta;
    }

    public void setPunta(String punta) {
        this.punta = punta;
    }

    @Override
    public String toString() {
        return "Pluma{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +
                ", punta='" + punta + '\'' +
                '}';
    }

    public void escribir(){
        System.out.println("Escribiendo...");
    }

}
