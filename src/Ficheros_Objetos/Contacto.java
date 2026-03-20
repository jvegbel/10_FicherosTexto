
package Ficheros_Objetos;

/**
 *
 * @author Juan Carlos Vega <jvegbel@canariaseducacion.es>
 */

enum DiaSemana {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES,SABADO, DOMINGO};

public class Contacto {
        private String nombre;
        private String apellidos;
        private String dni;
        private String telefono;
        private int edad;
        
        public Contacto(String nombre, String apellidos, String dni, String telefono, int edad){
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.dni = dni;
            this.telefono = telefono;
            this.edad = edad;
        }
        
            public Contacto(String nombre, String apellidos, String dni, int edad){
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.dni = dni;
            this.telefono = "No definido";
            this.edad = edad;
        }

    /**
     * @return the nombre
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    protected String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    protected void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the telefono
     */
    protected String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    protected void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the edad
     */
    protected int getEdad() {
        return edad;
    }
        
    public String toString() {
        String nombreApellidos = nombre + " " + apellidos;
        return String.format("%-15s DNI: %-12s Tfno: %-12s Edad: %-3d",
                         nombreApellidos, dni, telefono, edad);
        }
    
    
}
