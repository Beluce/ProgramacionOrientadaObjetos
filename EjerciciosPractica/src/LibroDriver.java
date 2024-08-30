public class LibroDriver {
    public static void main(String[] args) {
        Libro book = new Libro("Don Quijote de la Mancha", "$500", "El ingenioso hidalgo don Quijote de la Mancha narra las aventuras " +
                "de Alonso Quijano, un hidalgo pobre que de tanto leer novelas de caballería acaba enloqueciendo y creyendo ser un caballero andante, " +
                "nombrándose a sí mismo como don Quijote de la Mancha.");

        System.out.println(book);
        book.guardar();
    }
}
