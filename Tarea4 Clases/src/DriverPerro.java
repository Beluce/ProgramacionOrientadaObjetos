
public class DriverPerro {
    public static void main(String[] args) {

        Perro doggy = new Perro("Schnauzer" , (byte) 9, "Ramses" , true);

        System.out.println(doggy);

        System.out.println();

        System.out.println(doggy.ladrar());

        System.out.println();

        doggy.olfatear();

        System.out.println();

        doggy.atacar();
    }
}
