package Guia6TP3;

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

    //TODO: rehacer

    public double[][] exerciseF(double[][] matrixA, double[][] matrixB, Calculator calculator) {

        double[][] matrixProduct= new double[matrixA.length][matrixB[0].length];
//        int z=0;
//        for (int i=0; i<matrixProduct.length;i++){
//            for (int j=0; j<matrixProduct[i].length;j++){
//                double multiplication = calculator.multiplication(matrixA[i][z],matrixB[z][j]);
//                matrixProduct[i][j] = calculator.sum(multiplication,matrixProduct[i][j]);
//                z++;
//            }
//            z=0;
//        }
        return matrixProduct;
    }

    public double[][] exerciseG(double[][] matrix, Calculator calculator) {
        double[][] switchingMatrix = new double[matrix[0].length][matrix.length];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                switchingMatrix[j][i]=matrix[i][j];
            }
        }
        return switchingMatrix;
    }
}
