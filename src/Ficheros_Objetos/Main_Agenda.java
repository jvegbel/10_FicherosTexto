package Ficheros_Objetos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Juan Carlos Vega <jvegbel@canariaseducacion.es>
 */
public class Main_Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contacto juan = new Contacto("Juan", "Vega", "444666111Q", "666777888", 18);

        Agenda agenda = new Agenda(); // Creo una agenda con un array de contactos ya creado
        agenda.append(juan);
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("objetos.txt"));
            String linea = in.readLine(); // leo una linea del fichero  y la guardo en linea
            while (linea != null) {
                String[] objeto = linea.split(" , "); // Construyo un array de String con los elementos de la linea
                // Añado un objeto a agenda, con los datos del array objeto
                Contacto contactoAux = new Contacto(objeto[0], objeto[1], objeto[2], objeto[3], Integer.valueOf(objeto[4]));
                agenda.append(contactoAux);
                linea = in.readLine(); // leo una linea del fichero  y la guardo en linea
            }
            System.out.println(agenda);

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


    } // endMAin

}  // endClass
