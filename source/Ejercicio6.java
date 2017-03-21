import java.util.ArrayList;
import java.util.List;

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

    public static int numeroPrimoN(int n){
        for (int i = n; ; i++) {
            if (numeroPrimo(i)) {
                return i;
            }
        }
    }

    public static int cantidadFactoresPrimos(int n){
        int count= 0;

        for (int i = 1; i < n; i++) {
            if(numeroPrimo(i)){
                count++;
            }
        }
        return count;
    }

    public static ArrayList factoresPrimos(int n){
        ArrayList factoresPrimos = new ArrayList();

        for (int i = 1; i < n; i++) {
            if(numeroPrimo(i)){
                factoresPrimos.add(i);
            }
        }
        return factoresPrimos;
    }
}













