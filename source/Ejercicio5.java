/**
 * Created by Lucas on 19/3/2017.
 */
public class Ejercicio5 {

    /**
     * Se fija si el numero dado pertenece a un conjunto
     */

    public static boolean perteneceAlConjunto(int[] array, int a){
        for (int i=0; i<array.length;i++){
            if(array[i]==a){
                return true;
            }
        }
        return false;
    }
}
