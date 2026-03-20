
package flujosEntrada;

//import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jvega
 */
public class P10_06_EnterosDispersos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileInputStream flujo = null;
        try {
            flujo = new FileInputStream("NumerosRealesSinFornato.txt");
                    Scanner teclado = new Scanner(flujo);
        int contador = 0;
        int suma = 0;
        while(teclado.hasNext()) {
            int n = teclado.nextInt();
            System.out.println(n + " ");
            suma += n;
            contador++;
                  }
                  System.out.printf("Media = %.2f", ((double) suma/contador));  
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (flujo != null) {
                try {
                    flujo.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

        

    }
    
}
