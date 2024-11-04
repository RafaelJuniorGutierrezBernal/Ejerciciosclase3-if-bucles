import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {

        var scannner = new Scanner(System.in);

        System.out.println("Ingresa un numero a validar: ");

        int num = scannner.nextInt();

        if (num < 0) {
            System.out.println("El numero es negativo");
        } else if (num == 0) {
            System.out.println("El numero es 0");

        } else {
            System.out.println("El numero es positivo");

        }

        scannner.close();
    }
}
