/**
 * Created by santiagohazana on 3/20/17.
 */
public class Ejercicio8 {

    public static int hornerIterative(int[] polinomio, int x){
        int maxCoef = polinomio.length-1; // calculo el coeficiente maximo

        int result = polinomio[0];

        // evaluo el valor del polinomio en x
        for (int i = 1; i <= maxCoef; i++)
            result = result * x + polinomio[i];

        return result;

    }

//    public static int hornerRecursive(int [] polinomio, int x){
//
//    }

}
