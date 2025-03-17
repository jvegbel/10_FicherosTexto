package scannerEntrada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Propuesta1003 {

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
                sumaEdades += sc.nextInt();
                sumaEstaturas += sc.nextDouble();
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
