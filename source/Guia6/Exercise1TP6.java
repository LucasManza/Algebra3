package Guia6;

/**
 * Created by Lucas on 11/5/2017.
 */
public class Exercise1TP6 implements Exercise1 {

    public double exerciseA(double[][] matrix, Calculator calculator) {
        double result=0;
        for (int i = 0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length;j++){
                if(i==j)
                    result += matrix[i][j];
            }
        }
        return result;
    }

    public double exerciseB(double[][] matrix, Calculator calculator) {
        int i =matrix.length-1;
        int j= 0;
        int result=0;
        while (j<matrix.length){
            result += matrix[i][j];
            i--;
            j++;
        }
        return result;
    }

    public double[] exerciseC(double[][] matrix, Calculator calculator) {
        double[] result = new double[matrix.length];
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                result[i] += matrix[i][j];
            }
        }
        return result;
    }

    public double exerciseD(double[][] matrix, double[] vector, Calculator calculator) {
        return 0;
    }

    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    public double[][] exerciseF(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    public double[][] exerciseG(double[][] matrix, Calculator calculator) {
        return new double[0][];
    }
}
