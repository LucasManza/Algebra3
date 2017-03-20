/**
 * Created by santiagohazana on 3/19/17.
 */
public class Ejercicio2 {

    public int factorial(int number){
        if (number == 1)
            return 1;
        else
            return number * factorial(number - 1);
    }

    public double exponetialToN(int n){
        return Math.pow(2, n);
    }

    public double nTermFibonacci(int n){
        if(n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        }else{
            return nTermFibonacci(n-1) + nTermFibonacci(n-2);
        }
    }

    public double mcdEuclides (int a, int b){
        if(b==0)
            return a;
        else
            return mcdEuclides(b, a % b);
    }
}
