import java.util.Scanner;

public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
       
        int num;

        do {

            System.out.println("Ingrese un numero: ");
             num = scanner.nextInt();

            if (num >= 0) {
                System.out.println("El numero es positivo");
                
            }else if (num <= 0) {
              System.out.println("El numero es negativo");  

            }else{
                System.out.println("El numero es cero");
            }
            
        } while (num != 0);

        scanner.close();
    }
}
