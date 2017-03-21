package Guia1;

import java.util.ArrayList;

/**
 * Created by Lucas on 20/3/2017.
 */
public class Ejercicio7 {

    /**
     *Metodo que realiza el algoritmo de Maximo Comun Divisor.
     * Usa metodos auxiliares como el factoreo y contadorMenorComun.
     */

    public static int MCD(int a, int b) {
        ArrayList<Integer> factoresPrimosA = factoreo(a);
        ArrayList<Integer> factoresPrimosB = factoreo(b);

        int result=1; //no debe
        int auxPrimo = 1; // inicializado en 1 porque sabermos que 1 no es primo. Permite comparar numeros primos que se repitan.

        if(factoresPrimosA.size()>=factoresPrimosB.size()) {
            for (int i = 0; i <factoresPrimosA.size();i++){
                if(factoresPrimosB.contains(factoresPrimosA.get(i)) && (factoresPrimosA.get(i)!= auxPrimo)) {
                    result = result * contadorMenorComun(factoresPrimosA, factoresPrimosB, factoresPrimosA.get(i));
                }
            }
        }
        else {
            for (int i = 0; i < factoresPrimosB.size(); i++) {
                if (factoresPrimosA.contains(factoresPrimosB.get(i)) && (factoresPrimosA.get(i)!= auxPrimo))
                    result = result * contadorMenorComun(factoresPrimosA, factoresPrimosB, factoresPrimosB.get(i));
            }
        }
        return result;
    }

    /**
     * Factoreo de un numero por los numeros primos mas chicos posibles.
     */
    public static ArrayList<Integer> factoreo(int a){
        ArrayList<Integer> result = new ArrayList<Integer>();

        int i = 2;
        int j = a;

        while (i<=j){
            if(Ejercicio6.numeroPrimo(i)  &&  j%i ==0){
                result.add(i);
                j= j/i;
            }else{
                i++;
            }
        }
        return result;
    }

    /**
     * Compara los arrays de tal forma de que selecciona el numero primo compartido
     * sepanrandolo y viendo cual tiene menor cantidad de ese numero z en particular.
     */

    public static int contadorMenorComun(ArrayList<Integer> a, ArrayList<Integer> b, int z){
        ArrayList<Integer> contadorA = new ArrayList<Integer>();
        ArrayList<Integer> contadorB = new ArrayList<Integer>();
        int result =0;

        for(int i=0; i<a.size();i++){
            if(a.get(i).equals(z)){
                contadorA.add(a.get(i));
            }
        }
        for(int j=0; j<b.size();j++){
            if(b.get(j).equals(z)){
                contadorB.add(b.get(j));
            }
        }
        if(contadorA.size()>=contadorB.size()) {
            for (int ai=0;ai<contadorB.size();ai++){
                result += (int)contadorB.get(ai);
            }
        }else {
            for (int ai = 0; ai < contadorA.size(); ai++) {
                result += (int)contadorA.get(ai);
            }
        }
        return result;
    }


}
