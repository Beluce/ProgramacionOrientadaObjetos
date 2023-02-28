import java.util.Scanner;

public class Tarea3_JuegoGato {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena de exactamente 9 caracteres que contenga solo X, O & _: ");
        String entrada = sc.nextLine();
        if (entrada.length() != 9){
            System.out.print("Ingresa una cadena valida de caracteres");
        }
        mostrarGato(entrada);
    }

    public static void mostrarGato(String entrada) {

        System.out.println("\nCadena: " + entrada);
        System.out.println("- - - -");
        System.out.println("| " + entrada.charAt(0) + entrada.charAt(1) + entrada.charAt(2) + " |");
        System.out.println("|-----|");
        System.out.println("| " + entrada.charAt(3) + entrada.charAt(4) + entrada.charAt(5) + " |");
        System.out.println("|-----|");
        System.out.println("| " + entrada.charAt(6) + entrada.charAt(7) + entrada.charAt(8) + " |");
        System.out.println("- - - -");
    }
}