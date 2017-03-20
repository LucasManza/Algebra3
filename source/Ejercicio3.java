/**
 * Created by Lucas on 19/3/2017.
 */
public class Ejercicio3 {

    public static int determinarCero(int numero){
        int result =0;
        String numeroString = String.valueOf(numero);

        for (int i = 0; i < numeroString.length(); i++) {
            if(numeroString.charAt(i) == '0'){
                result++;
            }
        }
        return result;
    }

}
