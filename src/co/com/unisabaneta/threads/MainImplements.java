package co.com.unisabaneta.threads;

public class MainImplements {

    public static void main(String[] args) {

        new Thread(new Viaje("Cancun")).start();
        new Thread(new Viaje("San Andres")).start();
        new Thread(new Viaje("Cali")).start();
        new Thread(new Viaje("Bogota")).start();

    }

}
