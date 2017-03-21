package Guia1;

/**
 * Created by santiagohazana on 3/20/17.
 */
public class Ejercicio8 {

    /**
     * Metodo que evalua un polinomio dado en el valor x dado, mediante el metodo de Horner de forma iterativa
     */

    public static int hornerIterative(int[] polinomio, int x){
        int maxCoef = polinomio.length-1; // calculo el coeficiente maximo

        int result = polinomio[0];

        // evaluo el valor del polinomio en x
        for (int i = 1; i <= maxCoef; i++)
            result = result * x + polinomio[i];

        return result;

    }

    /**
     * Metodo que evalua un polinomio dado en el valor x dado, mediante el metodo de Horner de forma recursiva
     */
/*
    public static int hornerRecursive(int [] polinomio, int x, int position){
        int index = position;
        int maxCoef = polinomio.length-1;
        int result = polinomio[index];
        if(index == maxCoef) {
            return
        }else{
            index ++;
        }
        return result * x + polinomio[index] + hornerRecursive(polinomio, x, index);
    }
*/
}
