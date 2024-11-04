import java.util.Scanner;
public class Ejercicio12 {
    
    public static void main(String[] args) {

        System.out.println("CALCULADORA DE DIVISION DE FRUTA");
        var scanner = new Scanner(System.in);

        System.out.println("ingrese el peso de la fruta: ");
        var peso = scanner.nextDouble();

        System.out.println("ingrese el numero por el cual lo quiere dividir: ");
        var num = scanner.nextInt();

        if (peso % num == 0) {
            System.out.println("SI");
            
        }else{
            System.out.println("NO");
        }

        scanner.close();
    }
}
