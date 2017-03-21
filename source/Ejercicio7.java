import java.util.ArrayList;

/**
 * Created by Lucas on 20/3/2017.
 */
public class Ejercicio7 {
//    public static int MCD(int a, int b) {
//        ArrayList factoresPrimosA = Ejercicio6.factoresPrimos(a);
//        ArrayList factoresPrimosB = Ejercicio6.factoresPrimos(b);
//
//        ArrayList result = new ArrayList();
//
//        if (factoresPrimosA.size() >= factoresPrimosB.size()) {
//            for (int i = 0; i < factoresPrimosB.size(); i++) {
//                if (factoresPrimosA.contains(factoresPrimosB.get(i)))
//                    result.add(factoresPrimosB.get(i));
//            }
//        } else {
//            for (int i = 0; i < factoresPrimosA.size(); i++) {
//                if (factoresPrimosB.contains(factoresPrimosA.get(i)))
//                    result.add(factoresPrimosA.get(i));
//            }
//
//        }
//
//
//    }

    public static ArrayList factoreo(int a){
        ArrayList result = new ArrayList();

        int i = 2;
        int j = a;

        while (i<j){
            if(Ejercicio6.numeroPrimo(i)  &&  j%i ==0){
                result.add(i);
                j= j/i;
            }else{
                i++;
            }
        }
        return result;
    }


}
