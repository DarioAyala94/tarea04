
package Programas;
import java.util.Scanner;
public class tarea01 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número entre 1 y 5
        System.out.print("Ingresa un numero entero (1-5): ");
        int numero = sc.nextInt();
        
        // Usar switch para convertir el número en palabra
        switch (numero) {
            case 1:
                System.out.println("El numero en palabra es: uno");
                break;
            case 2:
                System.out.println("El numero en palabra es: dos");
                break;
            case 3:
                System.out.println("El numero en palabra es: tres");
                break;
            case 4:
                System.out.println("El numero en palabra es: cuatro");
                break;
            case 5:
                System.out.println("El numero en palabra es: cinco");
                break;
            default:
                System.out.println("Numero fuera de rango. Ingresa un número entre 1 y 5.");
                break;
        }
        
        // Cerrar el scanner
        sc.close();
    }
}
