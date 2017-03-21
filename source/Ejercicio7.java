import java.util.ArrayList;

/**
 * Created by Lucas on 20/3/2017.
 */
public class Ejercicio7 {
    public static int MCD(int a, int b) {
        ArrayList factoresPrimosA = factoreo(a);
        ArrayList factoresPrimosB = factoreo(b);

        int result=0;

        if(factoresPrimosA.size()>=factoresPrimosB.size()) {
            for (int i = 0; i <factoresPrimosA.size();i++){
                if(factoresPrimosB.contains(factoresPrimosA.get(i)) && i!=(i+1))
                result +=contadorMenorComun(factoresPrimosA,factoresPrimosB,i);
            }
        }
        else {
            for (int i = 0; i < factoresPrimosB.size(); i++) {
                if (factoresPrimosA.contains(factoresPrimosB.get(i)) && i != (i + 1))
                    result += contadorMenorComun(factoresPrimosA, factoresPrimosB, i);
            }
        }
        return result;
    }

    public static ArrayList factoreo(int a){
        ArrayList result = new ArrayList();

        int i = 2;
        int j = a;

        while (i<=j){
            if(Ejercicio6.numeroPrimo(i)  &&  j%i ==0){
                result.add(i);
                j= j/i;
            }else{
                i++;
            }
        }
        return result;
    }

    public static int contadorMenorComun(ArrayList a, ArrayList b, int z){
        ArrayList contadorA = new ArrayList();
        ArrayList contadorB = new ArrayList();
        int result =0;

        for(int i=0; i<a.size();i++){
            if(a.get(i)==z){
                contadorA.add(a.get(i));
            }
        }
        for(int j=0; j<b.size();j++){
            if(b.get(j)==z){
                contadorB.add(b.get(j));
            }
        }
        if(contadorA.size()<=contadorB.size()) {
            for (int ai=0;ai<contadorA.size();ai++){
                result+=contadorA.get(ai);
            }
        }else {
            for (int ai = 0; ai < contadorA.size(); ai++) {
                result += contadorA.get(ai);
            }
        }
        return result;
    }


}
