package Guia2;

/**
 * Created by Lucas on 24/3/2017.
 */
public class Practice2Exercises implements Practice2 {
    /**
     *Sumatoria desde un numero n hasta otro n.
     */

    public long exercise8(int m, int n) {
        int count=m;
        long result=0;
       while (m<=n){
           result+=count;
           count++;
       }
        return result;
    }
    /**
     * Sumatoria doble que repite procedimiento del ejercicio anterior.
     */

    public long exercise9(int m, int n, int r, int s) {
        return exercise8(m,n)*exercise8(r,s);
    }

    /**
     * Sumatoria que resuelve, n*2^(n). Donde va de 1 a n de los naturales.
     */
    public long exercise10(int n) {
        long result=0;
        for(int i=1;i<=n;i++){
            result+= i*(Math.pow(2,i));
        }
        return result;
    }

    public double exercise11Sumation(int n, int x) {
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += i * Math.pow(x, i);
        }

        return result;
    }

    public double exercise11Formula(int n, int x) {
        return ((n * Math.pow(x, n+2)) - ((n+1)*Math.pow(x, n+1)) + x)/(Math.pow(x-1, 2));
    }
}
