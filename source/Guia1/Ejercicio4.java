package Guia1;

/**
 * Created by Lucas on 19/3/2017.
 */
public class Ejercicio4 {

    /**
     * Metodo que evalua su un numero es capicua
     */

    public static boolean capicua(int[] a){
        for (int i=0; i<a.length;i++){
            if(a[i]!=a[a.length-1-i]){
                return false;
            }
        }
        return true;
    }

    public static boolean capicuaRecursion(int[] a){
        return capicuaRecursion(0,a);
    }

    private static boolean capicuaRecursion(int i, int[] a) {
        if(i<a.length){
            if(a[i]!=a[a.length-1-i]){
                return false;
            }
            capicuaRecursion(i+1,a);
        }
        return true;
    }
}
