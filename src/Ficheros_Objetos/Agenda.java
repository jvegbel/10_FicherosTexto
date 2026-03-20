
package Ficheros_Objetos;

import java.util.Arrays;

/**
 *
 * @author jvega
 */
public class Agenda {

    private Contacto[] contacto;
    private int[] socio;

    public Agenda() {
        contacto = new Contacto[0]; //Inicializo una agenda sin ningún contacto
        socio = new int[0];         //Inicializo una agenda sin ningún socio
    }

    public Agenda(Contacto[] contacto) {
        this.contacto = contacto; //Inicializo una agenda con un array de contactos
        int[] newArraySocio = new int[contacto.length]; // Crea Array auxiliar de enteros con una dimensión mas que socio
        for (int i = 0; i < contacto.length; i++) {  // Añado a cada socio un numero consecutivo empezando por 1
            newArraySocio[i] = i + 1;
        }   
        this.socio = newArraySocio; // Reescribo el array de socio igualando al nuevoArray de enteros creado
    }
        
    

    public void append(Contacto nuevoContacto) {
        int newSize = contacto.length + 1; // Establezco la dimensión de los nuevos array (1 unidad más que los anteriores)
        Contacto[] nuevoArrayContactos = new Contacto[newSize];
        int[] nuevoArraySocio = new int[newSize];
        
        for (int i = 0; i < contacto.length; i++) {
            nuevoArrayContactos[i] = contacto[i];
            nuevoArraySocio[i] = socio[i];
        }
        
        nuevoArrayContactos[newSize - 1] = nuevoContacto;
        nuevoArraySocio[newSize - 1] = newSize;

        this.contacto = nuevoArrayContactos;
        this.socio = nuevoArraySocio;
    }

    @Override
    public String toString() {
        String formato = "Contactos de la Agenda: \n";
        for (int i = 0; i < contacto.length; i++) {
            formato += socio[i] + ": " + contacto[i] + "\n" ;
            
        }
        
        return formato;
    }
    
}
    
    
    
