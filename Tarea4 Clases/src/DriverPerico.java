public class DriverPerico {

    public static void main(String[] args) {
        Perico parakeet = new Perico("Chicharito" , (float) 15.00 , "Verde" , false , (byte) 3);

        System.out.println(parakeet);
        System.out.println();
        parakeet.cantar();
        System.out.println();
        parakeet.hablar();
        System.out.println();
        parakeet.volar();
    }
}