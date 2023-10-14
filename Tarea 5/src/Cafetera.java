import java.util.Scanner;

public class Cafetera {
    private double agua;
    private double cafe;
    private double crema;
    private int vaso;
    private double capacidadVaso;

    public Cafetera() {
    }

    public Cafetera(double agua, double cafe, double crema, int vaso, double capacidadVaso) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vaso = vaso; //cantidad de vasos que acepta la cafetera
        this.capacidadVaso = capacidadVaso; //mililitros que contiene el vaso
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        if(agua > 0 && agua <= 5000){
            this.agua = agua;
        } else if (agua > 5000) {
            System.out.println("La cafetera no cuenta con esa capacidad de almacenar agua!");
        }
        if (agua < 0) {
            System.out.println("La cafetera no cuenta con mas agua");
        }
        if(agua == 0){
            System.out.println("La cafetera se acaba de quedar sin agua");
            this.agua = agua;
        }
    }

    public double getCafe() {
        return cafe;
    }

    public void setCafe(double cafe) {
        if(cafe > 0 && cafe <= 1000){
            this.cafe = cafe;
        } else if (cafe > 1000) {
            System.out.println("La cafetera no cuenta con esa capacidad de almacenar cafe!");
        }
        if (cafe < 0) {
            System.out.println("La cafetera no cuenta con mas cafe");
        }
        if(cafe == 0){
            System.out.println("La cafetera se acaba de quedar sin cafe");
            this.cafe = cafe;
        }
    }
    public double getCrema() {
        return crema;
    }

    public void setCrema(double crema) {
        if(crema > 0 && crema <= 1500){
            this.crema = crema;
        } else if (crema > 1500) {
            System.out.println("La cafetera no cuenta con esa capacidad de almacenar crema!");
        }
        if (crema < 0) {
            System.out.println("La cafetera no cuenta con mas crema");
        }
        if(crema == 0){
            System.out.println("La cafetera se acaba de quedar sin crema");
            this.crema = crema;
        }
    }

    public int getVaso() {
        return vaso;
    }

    public void setVaso(int vaso) {
        if(vaso > 0 && vaso <= 50){
            this.vaso = vaso;
        } else if (vaso > 50) {
            System.out.println("La cafetera no cuenta con esa capacidad de almacenar vasos!");
        }
        if (vaso < 0) {
            System.out.println("La cafetera no cuenta con mas vasos");
        }
        if(vaso == 0){
            System.out.println("La cafetera se acaba de quedar sin vasos");
            this.vaso = vaso;
        }
    }

    public double getCapacidadVaso() {
        return capacidadVaso;
    }

    public void setCapacidadVaso(double capacidadVaso) {
        if (capacidadVaso <= 200 && capacidadVaso > 0) {
            this.capacidadVaso = capacidadVaso;
        } else if (capacidadVaso <= 0) {
            System.out.println("El vaso esta vacio");
        }else {
            System.out.println("Los vasos no pueden contener mas de 200 ml!");
        }
    }


    @Override
    public String toString() {
        return "Cafetera{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vaso=" + vaso +
                ", capacidadVaso=" + capacidadVaso +
                '}';
    }

    public void hacerAmericano() {

        if (this.agua >= 180 && this.agua <= 5000 && this.cafe >= 15 && this.cafe <= 1000 && this.vaso >= 1 && this.vaso <= 50) {
            this.setAgua(this.agua - 180);
            this.setCafe(this.cafe - 15.0);
            this.setVaso(this.vaso - 1);

            System.out.println("Aqui tiene su americano");

        } else if (this.agua > 5000 || this.cafe > 1000 || this.vaso > 50) {
            System.out.println("Los valores en la cafetera no son correctos");

        } else {
            System.out.println("No cuenta con los ingredientes suficientes para realizar esta operacion, presione 4" +
                    " en el menu para conocer mas detalles");
        }
    }


    public void hacerExpreso(){

        if (this.agua >= 120 && this.agua <= 5000 && this.cafe >= 20 && this.cafe <= 1000 && this.vaso >= 1 && this.vaso <= 50) {
            this.setAgua(this.agua - 120);
            this.setCafe(this.cafe - 20);
            this.setVaso(this.vaso - 1);

            System.out.println("Aqui tiene su expreso");

        } else if (this.agua > 5000 || this.cafe > 1000 || this.vaso > 50) {
            System.out.println("Los valores en la cafetera no son correctos");

        } else {
            System.out.println("No cuenta con los ingredientes suficientes para realizar esta operacion, presione 4" +
                    " en el menu para conocer mas detalles");
        }
    }
    public void hacerCapuchino(){

        if(this.agua >= 100 && this.agua <= 5000 && this.cafe >= 14 && this.cafe <= 1000 && this.crema >=70 && this.crema <= 1500 && this.vaso >= 1 && this.vaso <= 50){
            this.setAgua(this.agua - 100);
            this.setCafe(this.cafe - 14);
            this.setCrema(this.crema - 70);
            this.setVaso(this.vaso - 1);

            System.out.println("Aqui tiene su capuchino");

        } else if (this.agua > 5000 || this.cafe > 1000 || this.vaso > 50 || this.crema > 1500) {
            System.out.println("Los valores en la cafetera no son correctos");

        } else {
            System.out.println("No cuenta con los ingredientes suficientes para realizar esta operacion, presione 4" +
                    " en el menu para conocer mas detalles");
        }
    }

    public void rellenarCafetera(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Desea rellenar los ingredientes?");
        System.out.println("1) Si");
        System.out.println("2) No");

        String entrada = teclado.nextLine();
        char respon = entrada.charAt(0);

        if(respon == 49){
            this.setCrema(1500);
            this.setVaso(50);
            this.setAgua(5000);
            this.setCafe(1000);
            System.out.println("Haz rellenado todos los componentes de la cafetera al maximo");
            System.out.println("A continuacion se muestran las cantidades actuales");
            this.mostrarCantidades();
        } else if (respon == 50) {
            System.out.println("Regresando al menu");
        } else {
            System.out.println("Elige una respuesta valida");
        }
    }

    public void mostrarCantidades(){
        System.out.println("Quedan: " + this.agua + " ml de agua");
        System.out.println("Quedan: " + this.cafe + " g de cafe");
        System.out.println("Quedan: " + this.crema + " ml de crema");
        System.out.println("Quedan: " + this.vaso + " vaso(s)");
    }

}
