import java.util.Scanner;

public class Editorial {
    private String nombre;
    private String pais;
    private String direccion;

    public Editorial() {
    }

    public Editorial(String nombre, String pais, String direccion) {
        this.nombre = nombre;
        this.pais = pais;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public void Publicar() {
        System.out.println("Publicas el libro");
    }

    public void vender(){
        System.out.println("Vendes el libro");
    }
}
