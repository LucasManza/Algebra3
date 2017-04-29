package Guia1;

/**
 * Created by Lucas on 19/3/2017.
 */
public class Ejercicio5 {

    /**
     * Metodo que evalua si el numero dado pertenece a un conjunto dado
     */

    public static boolean perteneceAlConjunto(int[] array, int a){
        for (int i=0; i<array.length;i++){
            if(array[i]==a){
                return true;
            }
        }
        return false;
    }

    public static boolean perteneceAlCojuntoRecursion(int[] array, int a){
        return perteneceAlConjunto(0,array,a);
    }

    private static boolean perteneceAlConjunto(int i, int[] array, int a) {
        if(i<array.length){
            if(array[i]==a){
                return true;
            }
            perteneceAlConjunto(i+1,array,a);
        }
        return false;
    }
}
