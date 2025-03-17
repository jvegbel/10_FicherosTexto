
package excepciones;

/**
 *
 * @author jvega
 */
public class ExcepcionEdadNegativa extends Exception {

    @Override
    public String toString() {
        return "Revisa el código hay una edad negativa";
    }
}
