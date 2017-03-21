/**
 * Created by Lucas on 19/3/2017.
 */
public class Ejercicio6 {
    public static boolean numeroPrimo(int n){
        boolean result = true;
        for(int i=1; i<=n;i++){
            if((i<=Math.sqrt(n)))
                result= false;
        }
        return result;
    }
}
