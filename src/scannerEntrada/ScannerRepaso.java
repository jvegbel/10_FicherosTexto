package scannerEntrada;

import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author jvega
 */
public class ScannerRepaso {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        System.out.print("Introducir datos del deportista: ");
        System.out.print("\nNombre: ");
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        String nombre = sc.next();
        System.out.println("Nombre: " + nombre);
        System.out.print("\nEdad: ");
        int edad = sc.nextInt();
        System.out.println("Edad: " + edad);
        System.out.print("\nEstatura: ");
        double estatura = sc.nextDouble();
        System.out.println("Estatura: " + estatura);
    }
    
}
