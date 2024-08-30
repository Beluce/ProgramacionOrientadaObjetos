import java.awt.*;

public class PlumaDriver {

    public static void main(String[] args) {
        Pluma pen = new Pluma("BIC", "Cristal", Color.BLACK, "Fina");

        System.out.println(pen);
        pen.escribir();
    }
}
