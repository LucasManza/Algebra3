/**
 * Created by Lucas on 19/3/2017.
 */
public class Ejercicio1 {
    public static int sumatoriaA(int n){
        int result=0;
        for(int i=0;i<n;i++){
            result++;
        }
        return result;
    }

    public static int sumatoriaB(int n){
        int result=0;
        for(int i=1;i<=n;i++){
            result += Math.pow(i,2);
        }
        return result;
    }

    public static int sumatoriaC(int p, int n){
        int result =0;
        for (int i=0; i<=n; i++){
            result += Math.pow(p,i);
        }
        return result;
    }

    public static int sumatoriaD(int n){
        int result=0;
        int p= (2*n-1);
        for(int i=1; i<=p; i++){
            result+= (2*i)-1;
        }
        return result;
    }

    public static int sumatoriaE(int n){
        int result=0;
        int p= n*(n+1);
        for(int i=1; i<=p; i++){
            result+= i*(i+1);
        }
        return result;
    }

    public static int sumatoriaF(int n){
        int result=0;
        for(int i=1;i<=n;i++){
            result += Math.pow(i,3);
        }
        return result;
    }

}
