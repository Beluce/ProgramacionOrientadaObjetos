import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cafetera cafeterina = new Cafetera(5000, 1000.0, 1500, 1, 200.0);
        System.out.println(cafeterina);

        int respuesta = 49;
        int menu;
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        while(respuesta == 49){
            System.out.println("Bienvenido a la cafeteria");
            System.out.println("Aqui tiene nuestro menu:");
            System.out.println("1) Americano");
            System.out.println("2) Expreso");
            System.out.println("3) Capuchino");
            System.out.println("4) Mostrar cantidad restante de ingredientes");
            System.out.println("5) Rellenar todos los ingredientes");
            System.out.println("6) Salir");
            System.out.print("Seleccione el numero de la accion que desea realizar: ");

            String entrada = teclado.nextLine();
            char one = entrada.charAt(0);
            menu = one;

            if(menu == 49){
                cafeterina.hacerAmericano();
                while(true){
                    System.out.println("Desea regresar al menu?");
                    System.out.println("1) Si");
                    System.out.println("2) Salir");

                    String entrada2 = teclado2.nextLine();
                    char two = entrada2.charAt(0);
                    respuesta = two;

                    if(respuesta == 49){
                        break;
                    }
                    if(respuesta == 50){
                        System.out.println("Esperamos que haya disfrutado nuestro servicio");
                        break;
                    }
                    else{
                        System.out.println("Elige una respuesta valida!");
                    }
                }
            }
            if(menu == 50){
                cafeterina.hacerExpreso();
                while(true){
                    System.out.println("Desea regresar al menu?");
                    System.out.println("1) Si");
                    System.out.println("2) Salir");

                    String entrada2 = teclado2.nextLine();
                    char two = entrada2.charAt(0);
                    respuesta = two;

                    if(respuesta == 49){
                        break;
                    }
                    if(respuesta == 50){
                        System.out.println("Esperamos que haya disfrutado nuestro servicio");
                        break;
                    }
                    else{
                        System.out.println("Elige una respuesta valida!");
                    }
                }
            }
            if(menu == 51){
                cafeterina.hacerCapuchino();
                while(true){
                    System.out.println("Desea regresar al menu?");
                    System.out.println("1) Si");
                    System.out.println("2) Salir");

                    String entrada2 = teclado2.nextLine();
                    char two = entrada2.charAt(0);
                    respuesta = two;

                    if(respuesta == 49){
                        break;
                    }
                    if(respuesta == 50){
                        System.out.println("Esperamos que haya disfrutado nuestro servicio");
                        break;
                    }
                    else{
                        System.out.println("Elige una respuesta valida!");
                    }
                }
            }
            if(menu == 52){
                cafeterina.mostrarCantidades();
                while(true){
                    System.out.println("Desea regresar al menu?");
                    System.out.println("1) Si");
                    System.out.println("2) Salir");

                    String entrada2 = teclado2.nextLine();
                    char two = entrada2.charAt(0);
                    respuesta = two;

                    if(respuesta == 49){
                        break;
                    }
                    if(respuesta == 50){
                        System.out.println("Esperamos que haya disfrutado nuestro servicio");
                        break;
                    }
                    else{
                        System.out.println("Elige una respuesta valida!");
                    }
                }
            }
            if(menu == 53){
                cafeterina.rellenarCafetera();
            }


            if(menu == 54){
                System.out.println("Esperamos que haya disfrutado el servicio");
                break;
            }

        }

    }
}
