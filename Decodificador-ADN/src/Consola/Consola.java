package Consola;

import java.util.ArrayList;
import java.util.Scanner;
import main.Analizador;

/**
 *
 * @author dylan
 */
public class Consola {
    
    public void consola(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el primer ADN");
        String palabra1 = leer.nextLine();
        Analizador analizador = new Analizador();
        ArrayList<String> primera = analizador.separador(palabra1);
        System.out.println("Escriba el segundo ADN");        
        String palabra2 = leer.nextLine();
        ArrayList<String> segunda = analizador.separador(palabra2);
        System.out.println("La cadena mayor es: "+analizador.analizador(primera, segunda));
    }
}
