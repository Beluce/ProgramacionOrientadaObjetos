public class Autor {
    private String nombre;
    private String pseudonimo;
    private String pais;

    public Autor() {
    }

    public Autor(String nombre, String pseudonimo, String pais) {
        this.nombre = nombre;
        this.pseudonimo = pseudonimo;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", pseudonimo='" + pseudonimo + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

    public void escribir(){
        System.out.println("El autor se encuentra escribiendo");
    }

    public void promociones(){
        System.out.println("Rebajas en los libros! Lleva ahora tus libros con un 20% de descuento");
    }
}
