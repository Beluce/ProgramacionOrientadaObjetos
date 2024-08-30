import java.awt.*;
import java.util.Scanner;

//atributos

public class Perro {
    private String raza;
    private byte edad;
    private String nombre;
    private boolean lider;
    private Color color;

    //metodos constructores

    public Perro() {
    }

    public Perro(String raza, byte edad, String nombre, boolean lider, Color color) {
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
        this.lider = lider;
        this.color = color;
    }

    public Perro(String raza, byte edad, String nombre, boolean lider) {
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
        this.lider = lider;
    }

    public Perro(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    //get + set
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        if (edad > 0 && edad <=13){
            this.edad = edad;
        } else {
            System.out.println("Esa edad no es valida!");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLider() {
        return lider;
    }

    public void setLider(boolean lider) {
        this.lider = lider;
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
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", lider=" + lider +
                ", color=" + color +
                '}';
    }

    //de uso general

    public boolean ladrar(){
        System.out.println(nombre + " acaba de detectar peligro!!");
        boolean resultado = Math.random() > 0.2;
        return resultado;
    }

    public void olfatear() {

        System.out.println(nombre + " te esta olfateando...");

        if (Math.random() > .5) {
            System.out.println("a " + nombre + " le agradas!");
        } else
            System.out.println("a " + nombre + " no le agradas...");

    }
    public void atacar(){

        Scanner teclado = new Scanner(System.in);
        double ataque = Math.random();

        System.out.println("Decides acariciar a " + nombre + "? (S - N)"); //Se debe escribir S o N
        String input = teclado.nextLine();

        int prueba = (int) input.charAt(0);

        if (prueba == 83 && ataque > .5) {
            System.out.println("Acaricias a " + nombre + " exitosamente");
        }
        if (prueba == 78 && ataque > .5){
            System.out.println(nombre + " se ha ido");
        }
        if (prueba == 83 && ataque < .5) {
            System.out.println("a " + nombre + " no le gusto eso y te ataco!");
        }
        if (prueba == 78 && ataque < .5){
            System.out.println(nombre + " se ha enfadado y te ataco!");
        }
        if (prueba != 78 && prueba != 83){
            System.out.println("Introduce una respuesta valida...");
        }
    }


}
