package flujosSalida;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jvega
 */
public class P10_08_CopiaFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nombre del fichero: ");
        String fichOriginal = new Scanner(System.in).nextLine();
        String fichCopia = "copia_de_" + fichOriginal;

        // BufferedWriter out = null; 
        try (BufferedReader in = new BufferedReader(
        new FileReader(fichOriginal)); BufferedWriter out = new BufferedWriter(
        new FileWriter(fichCopia))) {
            String linea = in.readLine();
            System.out.println(linea);
            out.write(linea);
            while (linea != null) { //mientras no llegue al final del archivo
                linea = in.readLine();
                System.out.println(linea);
                if (linea != null) {
                    out.newLine();
                    out.write(linea);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } 
    }

}
