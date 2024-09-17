
package Programas;
import java.util.Scanner;
public class tarea02 {
      public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número entre 1 y 10
        System.out.print("Ingresa un número entero (1-10): ");
        int numero = sc.nextInt();
        
        // Usar switch para convertir el número en romano
        switch (numero) {
            case 1:
                System.out.println("El número en romano es: I");
                break;
            case 2:
                System.out.println("El número en romano es: II");
                break;
            case 3:
                System.out.println("El número en romano es: III");
                break;
            case 4:
                System.out.println("El número en romano es: IV");
                break;
            case 5:
                System.out.println("El número en romano es: V");
                break;
            case 6:
                System.out.println("El número en romano es: VI");
                break;
            case 7:
                System.out.println("El número en romano es: VII");
                break;
            case 8:
                System.out.println("El número en romano es: VIII");
                break;
            case 9:
                System.out.println("El número en romano es: IX");
                break;
            case 10:
                System.out.println("El número en romano es: X");
                break;
            default:
                System.out.println("Número fuera de rango. Ingresa un número entre 1 y 10.");
                break;
        }
        
        // Cerrar el scanner
        sc.close();
    }
}
