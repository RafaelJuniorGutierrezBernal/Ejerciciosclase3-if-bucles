import java.util.Scanner;
 
public class Ejercicio2 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.println("Ingresa el tercer numero: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero mayor es: " + num2);
        } else {
            System.out.println("El numero mayor es: " + num3);
        }


        scanner.close();
        
    }
}