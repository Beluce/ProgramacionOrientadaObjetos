import java.util.Scanner;

public class Tarea2_ASCII {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa caracteres de la tabla ASCII: ");
        String usuario = scanner.nextLine();

        boolean consecutividad = true;

        for (int i = 0; i < usuario.length() - 1; i++) {    

            int prueba1 = (int) usuario.charAt(i);          //Al convertir un String a caracter, el programa arroja su valor en la tabla ASCII
            int prueba2 = (int) usuario.charAt(i + 1);
            if (prueba2 - prueba1 != 1) {
                consecutividad = false;
                break;
            }
        }

        System.out.println(consecutividad);
    }
}