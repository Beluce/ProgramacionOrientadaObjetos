import java.util.Scanner;

public class Libro {
    private String titulo;
    private String precio;
    private String sinopsis;

    public Libro() {
    }

    public Libro(String titulo, String precio, String sinopsis) {
        this.titulo = titulo;
        this.precio = precio;
        this.sinopsis = sinopsis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio='" + precio + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                '}';
    }

    public void guardar(){
        double rand = Math.random();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Decides guardar el libro? (1 = SI, cualquier otra tecla = NO)");
        String entrada = teclado.nextLine();

        int cambio = entrada.charAt(0);

        if(cambio == 49){
            System.out.println("Guardas el libro");
        }else{
            System.out.println("Prefieres quedarte con el libro");
        }
    }
}
