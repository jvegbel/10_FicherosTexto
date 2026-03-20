
package flujosEntrada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jvega
 */
public class P10_04_NumerosReales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto = "";
        double media = 0;
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("NumerosReales.txt"));
            String linea = in.readLine();
            String[] subcadenas = linea.split(":");
            System.out.println("Dimension Array: " + subcadenas.length);
            for (int i = 0; i < subcadenas.length; i++) {
                System.out.print(subcadenas[i] + " : ");
                media +=  Double.valueOf(subcadenas[i]);
            }
             media = media/subcadenas.length;
            System.out.println("Media = " + media);
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
