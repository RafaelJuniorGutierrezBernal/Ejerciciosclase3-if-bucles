import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entre el 1-12 para el mes a escoger: ");
        int mes = scanner.nextInt();
    
        
            switch(mes){

                case 1: 
                case 3: 
                case 5: 
                case 7: 
                case 8: 
                case 10: 
                case 12:
                    System.out.println("Este mes tiene 31 dias"); 
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Este mes tiene 30 dias"); 
                    break;
                case 2:
                    System.out.println("Este mes tiene 28 o 29 dias"); 
                    break;
                default:
                    System.out.println("El mes ingresado no es valido"); 
                    break;
            }
        
         
        scanner.close();
    
 } 
}
