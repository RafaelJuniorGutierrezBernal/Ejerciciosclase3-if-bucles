import java.util.Scanner;
public class Ejercicio16 {

    public static void main(String[] args) {
      
        var scanner = new Scanner(System.in);
        int num;
        int contadorNegativos = 0;
        do {
            System.out.println("Ingrese un numero: ");
            num = scanner.nextInt();

            if (num < 0) {
                contadorNegativos++;    
            }
           
             
        } while (num < 0);

        System.out.println("La cantidad de numeros negativos es: " + contadorNegativos);
        
        scanner.close();
       
    }
}