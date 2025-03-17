
package excepciones;
import java.util.Scanner;

/**
 *
 * @author jvega
 */
public class ExcepcionUsuario {
    
    public static void main(String[] args) {
        try {
            System.out.print("Introducir edad: ");
            int edad = new Scanner(System.in).nextInt();
            if (edad < 0) {
                throw new ExcepcionEdadNegativa();
            } else {
                System.out.println("La edad es válida: " + edad);
            }
        } catch (ExcepcionEdadNegativa ex) {
            System.out.println(ex);
        }
    }

}
