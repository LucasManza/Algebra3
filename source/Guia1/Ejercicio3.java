package Guia1;

/**
 * Created by Lucas on 19/3/2017.
 */
public class Ejercicio3 {

    /**
     * Determina cuantos 0 tiene un numero dado
     */

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

    public static int determinarCeroRecusirvo(int numero){
        return determinarCeroRecusirvo(0, String.valueOf(numero));
    }

    private static int determinarCeroRecusirvo(int i, String numero) {
        int result = 0;
        if(i<numero.length()){
            if(numero.charAt(i) == '0'){
                result++;
            }
            result += determinarCeroRecusirvo(i+1,numero);
        }
        return result;
    }

}
