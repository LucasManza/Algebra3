package Guia6TP3;

/**
 * Created by Lucas on 15/5/2017. TODO: rehacer todo al parecer
 */
public class Exercise3TP6 implements Exercise3 {
    public double[] exerciseAI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        double[] result = new double[vectorX.length];
        int z = 0;
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if(i<=j){
                    double multiplication = calculator.multiplication(matrixA[i][j],vectorX[j]);
                    result[z] = calculator.sum(multiplication,result[z]);
                }
            }
            z++;
        }
        return result;
    }

    public double[][] exerciseAII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if(i<=j)
                    result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }
        return result;
    }

    public double[][] exerciseAIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                for (int k = 0; k < matrixA.length; k++) {
                    if(i<=j)
                        result[i][j] += (matrixA[i][k] * matrixB[k][j]);
                }
            }
        }
        return result;
    }

    public double[] exerciseBI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        double[] result = new double[vectorX.length];
        int z = 0;
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if(i<=j+1){
                    double multiplication = calculator.multiplication(matrixA[i][j],vectorX[j]);
                    result[z] = calculator.sum(multiplication,result[z]);
                }
            }
            z++;
        }
        return result;
    }

    public double[][] exerciseBII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if(i<=j+1)
                    result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }
        return result;
    }

    public double[][] exerciseBIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                for (int k = 0; k < matrixA.length; k++) {
                    if(i<=j+1)
                        result[i][j] += (matrixA[i][k] * matrixB[k][j]);
                }
            }
        }
        return result;
    }

    public double[] exerciseCI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        double[] result = new double[vectorX.length];
        int z = 0;
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if(i==j || i==(j+1) || i==j-1){
                    double multiplication = calculator.multiplication(matrixA[i][j],vectorX[j]);
                    result[z] = calculator.sum(multiplication,result[z]);
                }
            }
            z++;
        }
        return result;
    }

    public double[][] exerciseCII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if(i==j || i==(j+1) || i==j-1)
                    result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }
        return result;
    }

    public double[][] exerciseCIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                for (int k = 0; k < matrixA.length; k++) {
                    if(i==j || i==(j+1) || i==j-1)
                        result[i][j] += (matrixA[i][k] * matrixB[k][j]);
                }
            }
        }
        return result;
    }

    public double[] exerciseDI(double[][] matrixA, int k1, int k2, double[] vectorX, Calculator calculator) {
        double[] result = new double[vectorX.length];
        int j = 0;
        int conditionJ = k1+j;
        int z = 0;

        for(int i=0; i<matrixA.length; i++){
            for (; j<conditionJ ; j++) {

                double multiplication = calculator.multiplication(matrixA[i][j],vectorX[j]);
                result[z] = calculator.sum(multiplication,result[z]);

                if(k1+j<=matrixA.length)
                    conditionJ= k1+j;
                if(j-k2-1 >=0)
                    j -= k2+1;
            }
            z++;
        }
        return result;
    }

    public double[][] exerciseDII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA.length];
        int countUp = 0;
        int countDown = 0;

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if (i==j){
                    result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
                }
            }
        }
        return result;
    }

    public double[][] exerciseDIII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA.length];
        int k1 = 0;
        int k2 = 0;
        if(k1A <= k1B)
            k1 = k1A;
        else if (k1A > k1B)
            k1 = k2B;
        if(k2A <= k2B)
            k2 = k2A;
        else if (k2A > k2B)
            k2 = k2B;

        int j = 0;
        int conditionJ = k1+j;
        int z = 0;

        for(int i=0; i<matrixA.length; i++){
            for (; j<conditionJ ; j++) {

                result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);

                if(k1+j<=matrixA.length)
                    conditionJ= k1+j;
                if(j-k2-1 >=0)
                    j -= k2+1;
            }
            z++;
        }
        return result;
    }

    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                for (int k = 0; k < matrixA.length; k++) {
                    if(matrixA[i][k] != 0 && matrixB[k][j] != 0)
                        result[i][j] += (matrixA[i][k] * matrixB[k][j]);
                }
            }
        }
        return result;
    }
}
