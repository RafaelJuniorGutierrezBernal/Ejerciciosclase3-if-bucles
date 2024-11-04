import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num = scanner.nextInt();
        System.out.println("Ingresa un segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingresa un tercer numero: ");
        int num3 = scanner.nextInt();

        int temp;
        if (num > num2) {
            temp = num;
            num = num2;
            num2 = temp;
        }

        if (num > num3) {
            temp = num;
            num = num3;
            num3 = temp;

        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;

        }

        System.out.println("Numeros en orden ascendente: " + num + " " + num2 + " " + num3);

        scanner.close();
    }
}
