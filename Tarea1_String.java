//BERNARDO LUNA CERVANTES - 2258

import java.util.Scanner;

public class Tarea1_String{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Teclea tu NOMBRE, PROFESION y PAIS DE PROCEDENCIA: ");
        String entrada = teclado.nextLine();

        String[] separador = entrada.split(" ");

        String separa1 = separador[0];
        String separa2 = separador[1];
        String separa3 = separador[2];

        System.out.println(separa1);
        System.out.println(separa2);
        System.out.println(separa3);

    }
}