/**
 * Created by Lucas on 19/3/2017.
 */
public class Ejercicio4 {
    public static boolean capicua(int[] a){
        for (int i=0; i<a.length;i++){
            if(a[i]!=a[a.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
