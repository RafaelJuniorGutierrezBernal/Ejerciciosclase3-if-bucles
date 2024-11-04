import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        var Scanner = new Scanner(System.in);

        System.out.println("Ingrese la letra a evaluar: ");
        char letra = Scanner.next().charAt(0);
        if (Character.isLowerCase(letra)) {
            System.out.println("Es minúscula");
        } else {
            System.out.println("Es mayúscula");
            
        }

        Scanner.close();
    }

}
