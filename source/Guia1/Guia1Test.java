package Guia1;

import java.util.Random;

/**
 * Created by Lucas on 20/3/2017.
 */
public class Guia1Test {
    public static void main(String[] args){
        int number = 15;
        Random rn = new Random();

        System.out.println("Ejercicio1 SumatoriaA:"+Guia1.Ejercicio1.sumatoriaA(6)); // 21
        System.out.println("Ejercicio1 SumatoriaARecursivo:"+Guia1.Ejercicio1.sumatoriaARecursivo(6));
        System.out.println("Ejercicio1 SumatoriaB:"+Guia1.Ejercicio1.sumatoriaB(6));
        System.out.println("Ejercicio1 SumatoriaBRecusirvo:"+Guia1.Ejercicio1.sumatoriaBRecursivo(6));
        System.out.println("Ejercicio1 SumatoriaC:"+Guia1.Ejercicio1.sumatoriaC(6,2));
        System.out.println("Ejercicio1 SumatoriaCRecusirvo:"+Guia1.Ejercicio1.sumatoriaCRecursivo(6,2));
        System.out.println("Ejercicio1 SumatoriaD:"+Guia1.Ejercicio1.sumatoriaD(6));
        System.out.println("Ejercicio1 SumatoriaDRecusirvo:"+Guia1.Ejercicio1.sumatoriaDRecursivo(6));
        System.out.println("Ejercicio1 SumatoriaE:"+Guia1.Ejercicio1.sumatoriaE(6));
        System.out.println("Ejercicio1 SumatoriaERecusirvo:"+Guia1.Ejercicio1.sumatoriaERecursivo(6));
        System.out.println("Ejercicio1 SumatoriaF:"+Guia1.Ejercicio1.sumatoriaF(6));
        System.out.println("Ejercicio1 SumatoriaFRecusirvo:"+Guia1.Ejercicio1.sumatoriaFRecursivo(6));
//
//
//        System.out.println("Factorial de 3: "+Guia1.Ejercicio2.factorial(3));//6
//        System.out.println("Fibonnacci de 4: "+Guia1.Ejercicio2.nTermFibonacci(4));
//        System.out.println("Exponencial de 2 a la 4: "+ Guia1.Ejercicio2.exponetialToN(4));
//        System.out.println("El " + number + " es numero primo? "+ Guia1.Ejercicio6.numeroPrimo(number));
//        System.out.println(Guia1.Ejercicio6.numeroPrimoN(number));
//        System.out.println(Guia1.Ejercicio6.cantidadFactoresPrimos(number));
//        System.out.println(Guia1.Ejercicio6.factoresPrimos(number));
//
//        System.out.println(Guia1.Ejercicio7.factoreo(48));
//        System.out.println("MCD de 123 y 277: "+Guia1.Ejercicio7.MCD(123,277));
//        System.out.println("MCD de 111 y 201: "+Guia1.Ejercicio7.MCD(111,201));
//        System.out.println("MCD de 14039 y 1529: "+Guia1.Ejercicio7.MCD(14039,1529));
//
//        int[] polinomio = new int[5];
//        for (int i = 0; i < polinomio.length; i++) {
//            polinomio[i] = rn.nextInt(10);
//            System.out.println(polinomio[i]);
//        }
//
////        System.out.println(Ejercicio8.hornerRecursive(polinomio, 2, 0));
//
    }
}
