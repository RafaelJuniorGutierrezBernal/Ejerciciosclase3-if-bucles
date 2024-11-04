import java.util.Scanner;
public class Ejercicio7 {
    
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        var num1 = scanner.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        var num2 = scanner.nextDouble();
        System.out.println("Ingresa el tercer numero: ");
        var num3 = scanner.nextDouble();

        if (num1 + num2 >num3 && num1 + num3 > num2 && num2 + num3 > num1) {
            System.out.println("se puede construir un triangulo");
            
        } else {
            System.out.println("no se puede construir un triangulo");
        }

        scanner.close();
    }
}
