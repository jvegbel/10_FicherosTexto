package scannerEntrada;

import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;
//import java.util.InputMismatchException;
/**
 *
 * @author jvega
 */
public class ScannerExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "ISO-8859-1");
        try {
            System.out.print("Introduce los datos (nombre edad estatura): ");
            String inputLine = scanner.nextLine();

            String[] datos = inputLine.split(" ");
            if (datos.length != 3) {
                System.out.println("Error: Debes ingresar 3 parámetros: nombre, "
                + "edad [int] y estatura [double] separados por espacios.");
                return;
            }

            String nombre = datos[0];
            int edad = Integer.parseInt(datos[1]); // Intenta convertir a entero
            double estatura = Double.parseDouble(datos[2]); // Intenta convertir a double

            System.out.println("Datos del deportista:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Estatura: " + estatura + " metros");
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingresa valores numéricos válidos para "
            + "la edad [int] y la estatura [double].");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        } 
    }
    
}
