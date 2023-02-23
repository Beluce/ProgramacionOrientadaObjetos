import java.util.Scanner;

public class Tarea3_JuegoGato {

     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa tu jugada en 9 caracteres: ");
            String entrada = scanner.nextLine();
            if(entrada == "X"  entrada == "O" || entrada == "_"){
                String[] sep = entrada.trim().split("");

                String a = sep[0];
                String b = sep[1];
                String c = sep[2];
                String d = sep[3];
                String e = sep[4];
                String f = sep[5];
                String g = sep[6];
                String h = sep[7];
                String j = sep[8];

                System.out.println("_ _ _");
                System.out.println("| " + a + b + c + " |");
                System.out.println("| " + d + e + f + " |");
                System.out.println("| " + g + h + j + " |");
                System.out.println("- --- -");
            }
            else{
                System.out.println("Ingrese los caracteres validos");
         }
        }
    
    }