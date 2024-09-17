
package Programas;
import java.util.Scanner;
public class tarea04 {
     public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número de periodo (1, 2, 3, 4, 6, 12)
        System.out.print("Ingresa un número de periodo (1, 2, 3, 4, 6, 12): ");
        int numero = sc.nextInt();
        
        // Usar switch para determinar el nombre del periodo anual
        switch (numero) {
            case 1:
                System.out.println("El periodo es: mensual");
                break;
            case 2:
                System.out.println("El periodo es: bimestral");
                break;
            case 3:
                System.out.println("El periodo es: trimestral");
                break;
            case 4:
                System.out.println("El periodo es: cuatrimestral");
                break;
            case 6:
                System.out.println("El periodo es: semestral");
                break;
            case 12:
                System.out.println("El periodo es: anual");
                break;
            default:
                System.out.println("Número fuera de rango. Ingresa un número válido (1, 2, 3, 4, 6, 12).");
                break;
        }
        
        // Cerrar el scanner
        sc.close();
    }
}
