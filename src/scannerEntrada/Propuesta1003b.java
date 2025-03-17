package scannerEntrada;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Propuesta1003b {

    public static void main(String[] args) {
        BufferedReader entrada = null;
        int contador = 0;
        double sumaEdades = 0.;
        double sumaEstaturas = 0.;
        try {
            entrada = new BufferedReader(new FileReader("C:\\Users\\jvega\\Downloads\\Jugadores.txt"));
            String linea = entrada.readLine();
            while (linea != null) {
                contador++;
                Scanner sc = new Scanner(linea).useLocale(Locale.US);
                String nombre = sc.next();
                System.out.println(nombre);
                try {
                sumaEdades += sc.nextInt();
                sumaEstaturas += sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Hay un error de copnversión en los datos del fichero");
                    System.out.println(e.getMessage());
                    return;
                    //e.printStackTrace();
                }

                linea = entrada.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

        System.out.println("Media de edades: " + sumaEdades / contador);
        System.out.println("Media de estaturas: " + sumaEstaturas / contador);

    }

}
