import java.util.Scanner;

public class Perico {

    private String nombre;
    private float altura;
    private String color;
    private boolean sobrepeso;
    private byte edad;

    public Perico() {
    }

    public Perico(String nombre, float altura, String color, boolean sobrepeso, byte edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.color = color;
        this.sobrepeso = sobrepeso;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura > 0 && altura <= 30){
            this.altura = altura;
        } else {
            System.out.println("Esa altura no es posible");
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSobrepeso() {
        return sobrepeso;
    }

    public void setSobrepeso(boolean sobrepeso) {
        this.sobrepeso = sobrepeso;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        if (edad > 0 && edad <= 8) {
            this.edad = edad;
        } else {
            System.out.println("Esa edad no es posible");
        }
    }

    @Override
    public String toString() {
        return "Perico{" +
                "nombre='" + nombre + '\'' +
                ", altura=" + altura +
                ", color='" + color + '\'' +
                ", sobrepeso=" + sobrepeso +
                ", edad=" + edad +
                '}';
    }

    public void cantar(){
        double rand = Math.random();

        if(rand <= .7){
            System.out.println("A " + nombre + " le gusta cantar para ti!");
        } else{
            System.out.println("Parece que " + nombre + " prefiere estar callado...");
        }
    }

    public void hablar(){
        double rand = Math.random();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dile algo a " + nombre + "!");
        String entrada = teclado.nextLine();

        if (rand >.1){
            System.out.println(entrada);
            System.out.println(nombre + " repitio lo que dijiste!");
        } else{
            System.out.println("Parece que " + nombre + " no te entendio...");
        }
    }

    public void volar(){
        double rand = Math.random();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dejas salir de su jaula a " + nombre + "? (0 = NO, 1 = SI)");
        String entrada = teclado.nextLine();

        int prueba = entrada.charAt(0);

        if(prueba == 49){
            if(rand >.5){
                System.out.println(nombre + " se puso en tu hombro");
            } else{
                System.out.println(nombre + " se fue volando para nunca regresar...");
            }
        }

        if(prueba == 48){
            if(rand >.5){
                System.out.println(nombre + " esta a gusto en su jaula");
            } else {
                System.out.println(nombre + " esta picoteando para que lo dejes salir!");
            }
        }
    }
}
