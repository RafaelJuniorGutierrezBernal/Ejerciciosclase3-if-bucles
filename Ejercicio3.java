import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        var Scanner = new Scanner(System.in);

        System.out.println("Ingresa el numero: ");
        int num1 = Scanner.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        Scanner.close();
    }
}
