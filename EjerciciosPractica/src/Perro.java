import java.awt.*;

public class Perro {
    private String raza;
    private String tamano;
    private Color color;

    public Perro() {
    }

    public Perro(String raza, String tamano, Color color) {
        this.raza = raza;
        this.tamano = tamano;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", tamano='" + tamano + '\'' +
                ", color=" + color +
                '}';
    }

    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }

    public int dormir(){
        System.out.println("El perrito duerme placidamente...");
        double rand = Math.random()*100+1;
        int durmio = (int)rand;
        return durmio;
    }

    public void comer(){
        System.out.println("El perro esta comiendo!");
    }
}
