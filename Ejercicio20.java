public class Ejercicio20 {
    public static void main(String[] args) {
        //dimensiones del tablero
        int filas = 8;
        int columnas = 8;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("| B |");
                    
                }else{
                    System.out.print("| N |");
                }


            }
            System.out.println();
    
        }
    }
}
