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

    public static int factorialIterative(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
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

    public static double nTermFibonacciIterative(int n){
        double result = 0;
        if(n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        }else{
            for (int i = 0; i <= n; i++) {
                result += i;
            }
        }
        return result;
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

    public static double mcdEuclidesIterative(int a, int b){
        int iaux;
        a = Math.abs(a);
        b = Math.abs(b);
        int i1=Math.max(a,b);
        int i2=Math.min(a,b);

        while (i2 != 0){
            iaux = i2;
            i2 = i1 % i2;
            i1 = iaux;
        }
        return i1;
    }

}
