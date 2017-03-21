/**
 * Created by Lucas on 19/3/2017.
 */
public class Ejercicio6 {
    public static boolean numeroPrimo(int n){
        if(n<0) return false;

        int count = 0; //keeps the count of numbers of n%i == 0

        for(int i=1; i<=n;i++){
            if(n%i == 0){
                count++;
            }
        }

        // if count == 2 it means that n can be divided by 1 and n;
        if(count == 2){
            return true;
        }
        return false;

    }
}
