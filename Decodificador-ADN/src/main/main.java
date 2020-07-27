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
        System.out.println("Desea trabajar con:\n1) Interfaz Grafica\n2) Consola");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                
            case 2:
                Consola consola = new Consola();
                consola.consola();

        }
    }

}
