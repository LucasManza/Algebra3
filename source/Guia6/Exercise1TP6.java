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
                    result = calculator.sum(result, matrix[i][j]);
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
                result[i] = calculator.sum(result[i], matrix[i][j]);
            }
        }
        return result;
    }

    public double[] exerciseD(double[][] matrix, double[] vector, Calculator calculator) {
        double[] vectorResult = new double[matrix.length];
        int z = 0;
        for (int i=0;i<matrix.length;i++){
            for (int j=0; j<matrix[i].length;j++){
                double multiplication = calculator.multiplication(matrix[i][j],vector[j]);
                vectorResult[z] = calculator.sum(multiplication,vectorResult[z]);
            }
            z++;
        }
        return vectorResult;
    }

    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA[1].length];
        for (int i = 0; i<matrixA.length; i++){
            for (int j=0; j<matrixA[i].length;j++){
                result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }
        return result;
    }

    public double[][] exerciseF(double[][] matrixA, double[][] matrixB, Calculator calculator) {

        double[][] result= new double[matrixA.length][matrixB[0].length];
        for (int i=0; i<result.length;i++){
            for (int j=0; j<result[0].length;j++){
//                result[i][j] = sumRow(exerciseD(matrixA,matrixB[j],calculator),calculator);
                result[i][j] =
            }
        }
        return result;
    }

    private double sumRow(double[] row,Calculator calculator) {
        double result =0;
        for (int i=0; i<row.length;i++){
            result = calculator.sum(row[i],result);
        }
        return result;
    }

    public double[][] exerciseG(double[][] matrix, Calculator calculator) {
        return new double[0][];
    }
}
