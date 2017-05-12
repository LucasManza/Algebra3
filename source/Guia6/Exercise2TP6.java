package Guia6;

/**
 * Created by Lucas on 11/5/2017.
 */
public class Exercise2TP6 implements Exercise2{
    private Exercise1TP6 exercise1TP6;

    public Exercise2TP6() {
        this.exercise1TP6 = new Exercise1TP6();
    }

    public boolean exerciseA(double[][] matrix, Calculator calculator) {
        double[][] switchingMatrix = exercise1TP6.exerciseG(matrix,calculator);
        for (int i=0; i<matrix.length;i++){
            for (int j=0; j<matrix.length;j++){
                if(matrix[i][j]!=switchingMatrix[i][j])
                    return false;
            }
        }
        return true;
    }

    public boolean exerciseB(double[][] matrix, Calculator calculator) {
        double result = 0;
        for (int i=0; i<matrix.length;i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(i!=j)
                    result = calculator.sum(Math.abs(matrix[i][j]),result);
            }
            if (Math.abs(matrix[i][i])<=result)
                return false;
            else
                result=0;
        }
        return true;
    }
}
