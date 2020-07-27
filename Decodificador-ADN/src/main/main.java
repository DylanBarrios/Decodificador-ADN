package main;

import Consola.Consola;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Desea trabajar con:\n1) Interfaz Grafica\n2) Consola");                     //Instrucciones para el usuario 
        int opcion = leer.nextInt();                                                                    //Se alamacena en una varibale la opcion de la interfaz que eligio
        switch (opcion) {
            case 1:
                
            case 2:
                Consola consola = new Consola();    
                consola.consola();                                                                      //Se llama al metodo que pides los ADN's y los compara
            default:
                System.out.println("Esa opcion no existe, adios");    
        }
    }

}
