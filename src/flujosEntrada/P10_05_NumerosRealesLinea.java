
package flujosEntrada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jvega
 */
public class P10_05_NumerosRealesLinea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        double media = 0;
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("NumerosRealesLineas.txt"));
            String linea = in.readLine();
            while (linea != null) {
                contador++;
                System.out.println(linea);
                media +=  Double.valueOf(linea);
                linea = in.readLine();
            }
           
            System.out.println("Suma = " + media);
            System.out.println("Media = " + media/contador);
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
        
        

    }
    
}
