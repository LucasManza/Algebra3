package Guia6;

/**
 * Created by Lucas on 11/5/2017.
 */
public class Guia6Test {
    public static void main(String[] args ){
        CalculatorTP6 calculator = new CalculatorTP6();
        Exercise1TP6 exercise1 = new Exercise1TP6();
        double[][] identityMatrix = {{1,0,0},{0,1,0},{0,0,1}}; // matriz identidad cuadrada de 3x3
        double[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        double[] vector1 = {1,2,3};

        printMatrix(matrix1);
        System.out.println("Exercise 1) A): "+exercise1.exerciseA(matrix1,calculator));//=15
        System.out.println("Exercise 1) B): "+exercise1.exerciseB(matrix1,calculator));//=15
        System.out.println("-----------------------------------------");
        printMatrix(matrix1);
        System.out.println("Exercise 1) C), vector result: ");
        printMatrix(exercise1.exerciseC(matrix1,calculator));
        System.out.println("-----------------------------------------");
        printMatrix(matrix1);
        printMatrix(vector1);
        System.out.println("Exercise 1) D), a vector result: ");
        printMatrix(exercise1.exerciseD(matrix1,vector1,calculator));
        System.out.println("-----------------------------------------");
        double[][] matrix2 = {{1,2},{4,5},{7,8}};
        double[] vector2 = {1,2};
        printMatrix(matrix2);
        printMatrix(vector2);
        System.out.println("Exercise 1) D) Another Example, a vector result: ");
        printMatrix(exercise1.exerciseD(matrix2,vector2,calculator));
        System.out.println("-----------------------------------------");
        printMatrix(matrix1);
        printMatrix(identityMatrix);
        System.out.println("Exercise 1) E), matrix result: ");
        printMatrix(exercise1.exerciseE(matrix1,identityMatrix,calculator));
        System.out.println("-----------------------------------------");
        printMatrix(matrix2);
        double[][] matrix3 = {{1,4,7},{2,5,8}};
        printMatrix(matrix3);
        System.out.println("Exercise 1) F), matrix result: ");
        printMatrix(exercise1.exerciseF(matrix2,matrix3,calculator));
        System.out.println("-----------------------------------------");
        printMatrix(matrix2);
        System.out.println("Exercise 1) G), matrix result: ");
        printMatrix(exercise1.exerciseG(matrix2,calculator));
        System.out.println("-----------------------------------------");

        Exercise2TP6 exercise2 = new Exercise2TP6();
        printMatrix(identityMatrix);
        System.out.println("Exercise 2) A), matrix is symmetrical: "+exercise2.exerciseA(identityMatrix,calculator));
        System.out.println("-----------------------------------------");
        double[][] matrix4 ={{-4,2,1},{2,-8,4},{1,-1,6}};
        printMatrix(matrix4);
        System.out.println("Exercise 2) B), matrix is upper diagonal: "+exercise2.exerciseB(matrix4,calculator));
        System.out.println("-----------------------------------------");




    }

    public static void printMatrix(double[][] matrix) {
        System.out.println("\n"+"Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printMatrix(double[] matrix) {
        System.out.println("\n"+"Vector:");
        for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i]);
            }
        System.out.println();
        }

}
