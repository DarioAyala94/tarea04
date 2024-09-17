
package Programas;
import java.util.Scanner;
public class programa02 {
        public static void main(String[] args){
        int numero;
        String diasem="";
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar un numero del [1-7]");
        numero=lectura.nextInt();
        //proceso de datos
        switch (numero) {
            case 1:diasem="Lunes";break;
            case 2:diasem="Martes";break;
            case 3:diasem="Miercoles";break;
            case 4:diasem="Jueves";break;
            case 5:diasem="Viernes";break;
            case 6:diasem="Sabado";break;
            case 7:diasem="Domingo";break;
        }
        //salida de datos
        System.out.print("El nombre del dia de la semana es:"+diasem);
    }
}
