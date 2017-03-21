/**
 * Created by Lucas on 19/3/2017.
 */
public class Ejercicio1 {
    /**
     * Ejercicio a: sumatoria de los numeros naturales hasta n.
     */
    public static int sumatoriaA(int n){
        int result=0;
        for(int i=0;i<n;i++){
            result++;
        }
        return result;
    }

    /**
     * Ejercicio b: sumatoria de los numeros naturales al cuadrado hasta n.
     */
    public static int sumatoriaB(int n){
        int result=0;
        for(int i=1;i<=n;i++){
            result += Math.pow(i,2);
        }
        return result;
    }

    /**
     * Ejercicio c: sumatoria de un numero p natural elevado n veces.
     */
    public static int sumatoriaC(int p, int n){
        int result =0;
        for (int i=0; i<=n; i++){
            result += Math.pow(p,i);
        }
        return result;
    }

    /**
     * Ejercicio d: sumatoria de los numeros naturales impares  hasta n.
     */
    public static int sumatoriaD(int n){
        int result=0;
        int p= (2*n-1);
        for(int i=1; i<=p; i++){
            result+= (2*i)-1;
        }
        return result;
    }
    /**
     * Ejercicio e: sumatoria de los numeros naturales multiplicados por el numero que le sigue hasta n.
     */
    public static int sumatoriaE(int n){
        int result=0;
        int p= n*(n+1);
        for(int i=1; i<=p; i++){
            result+= i*(i+1);
        }
        return result;
    }
    /**
     * Ejercicio b: sumatoria de los numeros naturales al cubo hasta n.
     */

    public static int sumatoriaF(int n){
        int result=0;
        for(int i=1;i<=n;i++){
            result += Math.pow(i,3);
        }
        return result;
    }

}
