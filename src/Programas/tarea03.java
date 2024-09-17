
package Programas;
import java.util.Scanner;
public class tarea03 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número entre 1 y 6
        System.out.print("Ingresa un número entero (1-6): ");
        int numero = sc.nextInt();
        
        // Usar switch para convertir el número a su equivalente en inglés
        switch (numero) {
            case 1:
                System.out.println("El número en inglés es: one");
                break;
            case 2:
                System.out.println("El número en inglés es: two");
                break;
            case 3:
                System.out.println("El número en inglés es: three");
                break;
            case 4:
                System.out.println("El número en inglés es: four");
                break;
            case 5:
                System.out.println("El número en inglés es: five");
                break;
            case 6:
                System.out.println("El número en inglés es: six");
                break;
            default:
                System.out.println("Número fuera de rango. Ingresa un número entre 1 y 6.");
                break;
        }
        
        // Cerrar el scanner
        sc.close();
    }
}
