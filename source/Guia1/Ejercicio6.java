package Guia1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lucas on 19/3/2017.
 */
public class Ejercicio6 {

    /**
     * Metodo que evalua si un numero dado es primo
     */

    public static boolean numeroPrimo(int n){
        if(n<0) return false;

        int count = 0; //keeps the count of numbers of n%i == 0

        for(int i=1; i<=n;i++){
            if(n%i == 0){
                count++;
            }
        }

        // if count == 2 it means that n can be divided by 1 and n;
        if(count == 2){
            return true;
        }
        return false;

    }

    /**
     * Metodo que retorna el primer numero primo mayor o igual a un numero dado
     */

    public static int numeroPrimoN(int n){
        for (int i = n; ; i++) {
            if (numeroPrimo(i)) {
                return i;
            }
        }
    }

    /**
     * Metodo que calcula la cantidad de factores primos que tiene un numero
     */

    public static int cantidadFactoresPrimos(int n){
        int count= 0;

        for (int i = 1; i < n; i++) {
            if(numeroPrimo(i)){
                count++;
            }
        }
        return count;
    }

    /**
     * Metodo que calcula cuales son esos numeros primos y lo devuelve en forma de ArrayList
     */

    public static ArrayList factoresPrimos(int n){
        ArrayList factoresPrimos = new ArrayList();

        for (int i = 1; i < n; i++) {
            if(numeroPrimo(i)){
                factoresPrimos.add(i);
            }
        }
        return factoresPrimos;
    }
}













