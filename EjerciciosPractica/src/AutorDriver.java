public class AutorDriver {
    public static void main(String[] args) {
        Autor author = new Autor("Miguel de Cervantes", "El manco de Lepanto", "Espania");
        System.out.println(author);

        author.promociones();
        author.escribir();
    }
}
