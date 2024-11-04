public class Ejercicio9 {
    public static void main(String[] args) {
        var precio = 50.000;

        var scanner = new java.util.Scanner(System.in);
        System.out.println("Ingrese la cantidad de unidades que va a llevar: ");
        int unidades = scanner.nextInt();

        if (unidades >= 1 && unidades < 50) {
            System.out.println("El precio por unidad es: " + (precio));

        } else if (unidades >= 50 && unidades < 100) {
            System.out.println("El precio por unidad es: " + (precio * 0.9));
        } else if (unidades >= 100 && unidades < 150) {
            System.out.println("El precio por unidad es: " + (precio * 0.8));
        } else if (unidades >= 150 && unidades < 200) {
            System.out.println("El precio por unidad es: " + (precio * 0.7));
        } else {
            System.out.println("El precio por unidad es: " + (precio * 0.5));
        }
        scanner.close();
    }
}
