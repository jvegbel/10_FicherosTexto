
package flujosEntrada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jvega
 */
public class EjemploBufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // FileReader in = null;
        Scanner teclado = new Scanner(System.in);
        BufferedReader  in = null;
        String texto = "";
        // Vamos a leer el nombre del fichero por teclado
        //IMPORTANTE: debo poner solo el nombre con extensión si está dentro del Proyecto
        // donde está el programa. Si no, debo poner la ruta completa.
        System.out.print("Introduce el nombre del fichero a leer: ");
        String fichero = teclado.nextLine();
        

        try {
        //fichero.txt debe estar en la carpeta del proyecto (si no poner ruta completa):
        //in = new FileReader("carta.txt"); // Evito instanciar un objeto extra
        in = new   BufferedReader (new FileReader(fichero));   
        String linea = in.readLine();
        while (linea != null) {
            texto += linea + "\n";
            linea = in.readLine();
        }
        
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally { 
            if (in != null) { 
                try {
                    in.close(); 
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        System.out.println(texto);
       
    }
    
}
