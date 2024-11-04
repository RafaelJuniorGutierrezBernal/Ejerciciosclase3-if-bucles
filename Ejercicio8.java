import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad:");

        var edad = scanner.nextInt();

        if (edad >= 0 && edad <= 5) {
         System.out.println("primera infancia");

        } else if (edad >= 6 && edad <= 11) {
         System.out.println("infancia");

        } else if (edad >= 12 && edad <= 18) {
         System.out.println("adolescencia");

        } else if (edad >= 19 && edad <= 26) {
         System.out.println("adolescencia");

        } else if (edad >= 27 && edad <= 59) {
         System.out.println("adultez");
        } else {

         System.out.println("Persona mayor ");
        }

        scanner.close();

    }
}