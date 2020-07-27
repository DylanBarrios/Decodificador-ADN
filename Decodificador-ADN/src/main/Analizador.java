package main;

import java.util.ArrayList;

/**
 *
 * @author dylan
 */
public class Analizador {
    
    public ArrayList separador(String palabra1) {
        String[] PS = palabra1.split("");                                       //Se guardan las letras separadas de la primer palabra
        ArrayList<String> palabras = new ArrayList<String>();
        for (int i = 0; i < palabra1.length(); i++) {                           //for que se detiene hasta la cantidad de letras que contenga la palabra agregar palabras al arraylist
            int a = 0;                                                          //varibale para guardar la suma de dos numero que serviran para fromas palabras para comparar
            for (int j = 0; j < palabra1.length() - i; j++) {                   //for que se detiene hasta cumplir con la longitud de letras de la palabra restandole la cantidad de veces que hayan oasado de letras por algoritmo
                String tm = "";                                                 //variable temporal para almacenar las palabras que se van a comparar

                for (int k = 0; k < i + 1; k++) {                               //for que extrae las plabras por parejas, trios, cuartetos,.. dependiendo de la longitud de la palabra
                    a = j + k;                                                  //se suma la cantidad de veces que se ha repertido el ciclo que separa las palabras, con la cantidad de veces mas uno que se haya repetido el ciclo de la cantidad de letras    
                    tm += PS[a];                                                //
                }
                palabras.add(tm);
            }
        }
        return palabras;
    }   
    
    public String analizador(ArrayList<String> primera, ArrayList segunda) {
       String cadena = "";
        for (int j = 0; j < primera.size(); j++) {
            for (int i = 0; i < segunda.size(); i++) {        
                if(primera.get(j).equals(segunda.get(i))){
                    cadena = primera.get(j);
                }
            }
        }
    return cadena;
    }
}
