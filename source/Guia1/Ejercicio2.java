package Guia1;

/**
 * Created by santiagohazana on 3/19/17.
 */
public class Ejercicio2 {

    /**
     * Metodo que calcula el factorial de un numero cualquiera dado
     */

    public static int factorial(int number){
        int count = number;
        int result = number;
        while (count > 1 ){
            result *= (count-1);
            count--;
        }
        return result;
    }

    public static int factorialRecursivo(int number){
        if (number == 1 || number ==0)
            return 1;
        else
            return number * factorialRecursivo(number - 1);
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

    public static double nTermFibonacci(int n) {
        int number1 = 0;
        int number2 = 1;
        while (number2 + number1 <= n) {
            int numberAux = number1;
            number1 = number2;
            number2 = numberAux + number1;
        }
        return number2;
    }


    public static double nTermFibonacciRecursivo(int n){
        if(n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        }else{
            return nTermFibonacciRecursivo(n-1) + nTermFibonacciRecursivo(n-2);
        }
    }

    /**
     * Metodo que calcula el MCD con el metodo de Euclides
     */

    public static double mcdEuclides(int a, int b){
//        if(b==0)
            return a;
//        while ()
 }

    public static double mcdEuclidesRecursivo(int a, int b){
        if(b==0)
            return a;
        else
            return mcdEuclidesRecursivo(b, a % b);
    }

}
