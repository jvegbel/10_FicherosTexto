
package flujosEntrada;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author jvega
 */
public class P10_02_FileReader {

    public static void main(String[] args) {
        String texto = "";
        FileReader in = null;

        try {
            //fichero.txt debe estar en la carpeta del proyecto (si no poner ruta completa):
            in = new FileReader("C:\\Users\\jvega\\Downloads\\ficheros.txt");
            int c = in.read();
            while (c != -1) { 
                texto = texto + (char) c; 
                c = in.read();
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
