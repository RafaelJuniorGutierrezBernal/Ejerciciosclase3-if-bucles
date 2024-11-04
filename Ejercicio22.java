import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       String jugarDeNuevo;

       do {

        System.out.println("Jugador 1, elige P(piedra), T(tijera), o L(papel): ");
        String jugador1 = scanner.nextLine().toUpperCase();
        System.out.println("Jugador 2, elige P(piedra), T(tijera), o L(papel): ");
        String jugador2 = scanner.nextLine().toUpperCase();

        if (jugador1.equals(jugador2)) {
            System.out.println("Empate");
            
            
        }else if ((jugador1.equals("P") && jugador2.equals("T")) ||
                  (jugador1.equals("T") && jugador2.equals("L")) ||
                  (jugador1.equals("L") && jugador2.equals("P"))) {
            System.out.println("Jugador 1 gana");
            
        }else{
            System.out.println("Jugador 2 gana");
        }
        

        System.out.println("Deseas jugar de nuevo? (s/n)");
        jugarDeNuevo = scanner.nextLine().toUpperCase();
       } while (jugarDeNuevo =="s");
            
        
        
        scanner.close();
        
    }
}
