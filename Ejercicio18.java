import java.util.Random;

public class Ejercicio18 {

    public static void main(String[] args) {
        int contadorNegativos = 0;
        int contadorPositivos = 0;
        int contadorCero = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        Random random = new Random();

        for (int i = 0; i < 120; i++) {
            int numero = random.nextInt(201) - 100;

            if (numero < 0) {
                sumaNegativos += numero;
                contadorNegativos++;

            } else if (numero > 0) {
                sumaPositivos += numero;
                contadorPositivos++;
            } else {
                
                contadorCero++;
            }
        }

        if (contadorPositivos > 0) {
            double mediaPositivos = (double) sumaPositivos / contadorPositivos;
            System.out.println("La media de los positivos es: " + mediaPositivos);
            
        }else{
            System.out.println("No hay positivos");
        }


        if (contadorNegativos > 0) {
            double mediaNegativos = (double) sumaNegativos / contadorNegativos;
            System.out.println("La media de los negativos es: " + mediaNegativos);
            
        }else{
            System.out.println("No hay negativos");
            
        }


        System.out.println("La cantidad de ceros es: " + contadorCero);

    }
}
