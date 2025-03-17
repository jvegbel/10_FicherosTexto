package flujosSalida;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jvega
 */
public class P10_14_ContarPalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numPalabras = 0;
        int numCaracteres = 0;
        int numLineas = 0;
        try (BufferedReader in = new BufferedReader(
        new FileReader("carta.txt"))) {
            String linea = in.readLine();
            while (linea != null) {
                numLineas++;
                Scanner s = new Scanner(linea);
                while (s.hasNext()) {
                    numPalabras++;
                    String palabra = s.next();
                    numCaracteres += palabra.length();
                }
                linea = in.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        System.out.println("Número de líneas: " + numLineas);
        System.out.println("Número de palabras: " + numPalabras);
        System.out.println("Número de caracteres: " + numCaracteres);
    }

}
