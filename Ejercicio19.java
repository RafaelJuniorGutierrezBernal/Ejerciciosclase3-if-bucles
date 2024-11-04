import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        var N = scanner.nextInt();
        //se inicializa la sucecion de fibonacci
        int a = 0;
        int b = 1;

        for (int i = 0; i < N; i++) {
            if (N == 0) {
                System.out.println(a + " ");
                
            }else if (N == 1) {
                
            }else{
                 int c = a + b;
                 System.out.println(c + " ");



                 a = b;
                 b = c;

            }


        
    }
    scanner.close();
 }
}
