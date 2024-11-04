import java.util.Scanner;

public class Ejercicio14 {
    
  
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Ingrese un numero: ");
            num = scanner.nextInt();
            if (num >= 0) {
                int cubo = num * num * num;
                System.out.println("El cubo de " + num + " es: " + cubo);
                
            }
            
        } while (num >= 0);

        System.out.println("Fin del programa");
        scanner.close();
    }
    
}
