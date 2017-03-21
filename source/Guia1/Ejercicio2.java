package Guia1;

/**
 * Created by santiagohazana on 3/19/17.
 */
public class Ejercicio2 {

    /**
     * Metodo que calcula el factorial de un numero cualquiera dado
     */

    public static int factorial(int number){
        if (number == 1)
            return 1;
        else
            return number * factorial(number - 1);
    }

    /**
     * Metodo que calcula el exponencial de 2 al numero n que se le pase
     */

    public static double exponetialToN(int n){
        return Math.pow(2, n);
    }

    /**
     * Metodo que calcula el termino n de la sucesion de Fibonacci
     */

    public static double nTermFibonacci(int n){
        if(n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        }else{
            return nTermFibonacci(n-1) + nTermFibonacci(n-2);
        }
    }

    /**
     * Metodo que calcula el MCD con el metodo de Euclides
     */

    public static double mcdEuclides (int a, int b){
        if(b==0)
            return a;
        else
            return mcdEuclides(b, a % b);
    }

}
