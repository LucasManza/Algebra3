package Guia1;

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
    
    public static int sumatoriaARecursivo(int n){
       return sumatoriaARecursivo(0,n);
    }
    
    private static int sumatoriaARecursivo(int i ,int n){
        int result = i;
        if(i<n) {
             result = sumatoriaARecursivo(result+1,n);
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
    
    public static int sumatoriaBRecursivo(int n){
        return sumatoriaBRecursivo(0,n);
    }

    private static int sumatoriaBRecursivo(int i, int n) {
        int result = 0;
        if(i<=n) {
            result += Math.pow(i,2);
            result += sumatoriaBRecursivo(i+1,n);
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

    public static int sumatoriaCRecursivo(int p, int n){
        return sumatoriaCRecursivo(0,p,n);
    }

    private static int sumatoriaCRecursivo(int i, int p, int n) {
        int result = 0;
        if(i<=n) {
            result += Math.pow(p,i);
            result += sumatoriaCRecursivo(i+1,p,n);
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

    public static int sumatoriaDRecursivo(int n) {
        return sumatoriaDRecursivo(1,n);
    }

    private static int sumatoriaDRecursivo(int i,int n){
        int result=0;
        int p= (2*n-1);
        if(i<=p){
            result+= (2*i)-1;
            result+= sumatoriaDRecursivo(i+1,n);
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

    public static int sumatoriaERecursivo(int n){
        return sumatoriaERecursivo(1,n);
    }

    private static int sumatoriaERecursivo(int i,int n){
        int result=0;
        int p= n*(n+1);
        if (i<=p) {
            result += i * (i + 1);
            result += sumatoriaERecursivo(i+1,n);
        }
        return result;
    }
    /**
     * Ejercicio f: sumatoria de los numeros naturales al cubo hasta n.
     */

    public static int sumatoriaF(int n){
        int result=0;
        for(int i=1;i<=n;i++){
            result += Math.pow(i,3);
        }
        return result;
    }

    public static int sumatoriaFRecursivo(int n) {
        return sumatoriaFRecursivo(1,n);
    }

    private static int sumatoriaFRecursivo(int i, int n){
        int result = 0;
        if(i<=n) {
            result += Math.pow(i,3);
            result += sumatoriaFRecursivo(i+1,n);
        }
        return result;
    }

}
