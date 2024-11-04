import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        // creacion del scanner
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese los numeros de hermanos que llegaron a tiempo (separado por espacios): ");
        String input = scanner.nextLine();

        String[] numerosLlegaron = input.split(" ");
        boolean[] llegoATiempo = new boolean[4];

        for (String numero : numerosLlegaron) {
            int hermano = Integer.parseInt(numero.trim());
            if (hermano >= 1 && hermano <= 3) {
                llegoATiempo[hermano] = true;

            }

        }

        for (int i = 1; i <= 3; i++) {
            if (!llegoATiempo[i]) {
                System.out.println("El hermano que llego tarde es:" + i);
                break;

            }

        }

        scanner.close();

    }
}