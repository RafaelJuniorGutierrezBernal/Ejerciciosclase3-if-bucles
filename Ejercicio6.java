import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int num = scanner.nextInt();

        if (num % 2 == 0 && num % 7 == 0) {

            System.out.println("El numero es divisible entre 2 y 7");
        }else{
            System.out.println("El numero no es divisible entre 2 y 7");
        }

          

        scanner.close();
    }
}
