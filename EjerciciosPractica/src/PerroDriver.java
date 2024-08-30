import java.awt.*;

public class PerroDriver {
    public static void main(String[] args) {
        Perro dog = new Perro("Schnauzer", "Pequeno", Color.GRAY);
        System.out.println(dog);
        dog.ladrar();
        System.out.println(dog.dormir() + " minutos fue el tiempo que durmio!");
        dog.comer();
    }
}
