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
        System.out.println("Escriba el primer ADN");                                            //Instrucciones para el usuario
        String palabra1 = leer.nextLine();                                                      //Almacena el primer ADN que escribe el usuario
        Analizador analizador = new Analizador();
        ArrayList<String> primera = analizador.separador(palabra1);                             //Arraylist que alamacena las palabras que se compararan que se obtuvieron del primer ADN
        System.out.println("Escriba el segundo ADN");                                           //Instrucciones para el usuario
        String palabra2 = leer.nextLine();                                                      //Almacena el segundo ADN que escribe el usuario
        ArrayList<String> segunda = analizador.separador(palabra2);                             //Arraylist que alamacena las palabras que se compararan que se obtuvieron del primer ADN
        System.out.println("La cadena mayor es: "+analizador.analizador(primera, segunda));     //Muestra la coincidencia
    }
}
