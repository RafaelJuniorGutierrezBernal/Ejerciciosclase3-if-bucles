import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero impar positivo por favor: ");
        int num = scanner.nextInt();
        
        if (num % 2 != 0 && num > 0) {
            
            for (int i = 1; i <= num; i += 2) {
                
                for (int j = i; j < num; j += 2) {
                    System.out.print(" ");
                }
                
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println(); 
            }
            
            
            for (int i = num - 2; i >= 1; i -= 2) {
                
                for (int j = num; j > i; j -= 2) {
                    System.out.print(" ");
                }
               
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println(); 
            }
        } else {
            System.out.println("El numero debe ser un numero impar positivo.");
        }
        
        scanner.close();
    }
}
