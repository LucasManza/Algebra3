package Guia6;

/**
 * Created by Lucas on 15/5/2017.
 */
public class Exercise3TP6 implements Exercise3 {
    public double[] exerciseAI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        double[] result = new double[vectorX.length];
        int z = 0;
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if(i>=j){
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
                if(i>=j){
                    result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
                }else{
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }

    public double[][] exerciseAIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if(i>=j){
                    result[i][j] = calculator.multiplication(matrixA[i][j], matrixB[i][j]);
                }else{
                    result[i][j] = 0;
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
                if(i>=j+1){
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
                if(i>=j+1){
                    result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
                }else{
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }

    public double[][] exerciseBIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if(i>=j+1){
                    result[i][j] = calculator.multiplication(matrixA[i][j], matrixB[i][j]);
                }else{
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }

    public double[] exerciseCI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        return new double[0];
    }

    public double[][] exerciseCII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if(i == j || i == j+1 || i == j+1)
                    result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
                else
                    result[i][j] = 0;
            }
        }
        return result;
    }

    public double[][] exerciseCIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if(i == j || i == j+1 || i == j+1)
                    result[i][j] = calculator.multiplication(matrixA[i][j], matrixB[i][j]);
                else
                    result[i][j] = 0;
            }
        }
        return result;
    }

    public double[] exerciseDI(double[][] matrixA, int k1A, int k2A, double[] vectorX, Calculator calculator) {
        return new double[0];
    }

    public double[][] exerciseDII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA.length];
        int countUp = 0;
        int countDown = 0;

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if (i==j){

                }
            }
        }
    }

    public double[][] exerciseDIII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        return new double[0][];
    }

    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB.length; j++) {
                if(i == j){
                    result[i][j] = calculator.multiplication(matrixA[i][j], matrixB[i][j]);
                }else if(i>j){
                    result[i][j] = matrixB[i][j];
                }else{
                    result[i][j] = matrixA[i][j];
                }
            }
        }
        return result;
    }
}
