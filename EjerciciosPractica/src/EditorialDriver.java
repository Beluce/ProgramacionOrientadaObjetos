import java.util.Scanner;

public class EditorialDriver {
    public static void main(String[] args) {
        Editorial editorial1 = new Editorial("Acantilado", "Espania", "Muntaner, 462 E-08006 Barcelona");

        System.out.println(editorial1);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Publicar el libro? (0 = NO, 1 = SI)");
        String entrada = teclado.nextLine();

        int prueba = entrada.charAt(0);
        boolean publicado = false;

        if (prueba == 49) {
            editorial1.Publicar();
            publicado = true;
        }
        if (prueba == 48) {
            System.out.println("El libro no fue publicado");
            publicado = false;
        }
        if (prueba != 49 && prueba != 48) {
            System.out.println("Elige solo 0 y 1!");
        }

        if (publicado == true) {
            editorial1.vender();
        } else {
            System.out.println("El libro no puede ser vendido!");
        }
    }
}
