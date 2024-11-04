import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("ingrese la letra a evaluar: ");
        
        char letra = scanner.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E'
                || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("es vocal");

        } else {
            System.out.println("es consonante");

        }

        scanner.close();
    }
}
