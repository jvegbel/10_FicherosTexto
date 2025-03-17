package scannerEntrada;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P10_06_Enteros {

    public static void main(String[] args) {
        FileInputStream flujo = null;
        try {
            flujo = new FileInputStream("C:\\Users\\jvega\\Downloads\\Enteros.txt");
        } catch (FileNotFoundException ex) { 
            System.out.println(ex.getMessage());
        }
        Scanner s = new Scanner(flujo);
        int contador = 0;
        int suma = 0;
        while (s.hasNext()) {
            int n = s.nextInt();
            System.out.print(n + " ");
            suma += n;
            contador++;
        }
        double media = (double) suma / contador; //la media es un número real
        //System.out.println("\nsuma: " + suma + " media: " + media);
        System.out.printf("\nSuma: %d; Media: %.2f\n",  suma,  media);
    }

}
