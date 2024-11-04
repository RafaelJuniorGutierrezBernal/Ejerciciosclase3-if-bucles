import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de millas que quiere convertir a kilometros: ");
        double millas = scanner.nextDouble();

        double kilometros = millas * 1.60934;
        System.out.println("El numero de kilometros es: " + kilometros);

        System.out.println("Ingrese el numero de kilometros que quiere convertir a millas: ");
        double kilometros2 = scanner.nextDouble();
        double millas2 = kilometros2 / 1.60934;
        System.out.println("El numero de millas es: " + millas2);

        scanner.close();
    }
}
