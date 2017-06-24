package Guia7TP4;

/**
 * Created by Lucas on 23/5/2017.
 */
public class ExercisesTest {
    public static void main(String[] args ){
        double[][] coefTriangleUpperDiag1 = {{1,3,5.2},{0,1,3.4},{0,0,1}};
        double[] independentTerms = {-1.9,11.5,2};
        printMatrix(coefTriangleUpperDiag1);
        Exercises exercises = new Exercises();
        CalculatorTP4 calculator = new CalculatorTP4();

        printMatrix(exercises.exercise1(coefTriangleUpperDiag1,independentTerms));

        double[][] matrix1 = {{2,4,6},{6,3,9},{15,10,5}};
        double[] independtTerms1 = {4,3,25};
        printMatrix(matrix1);
        printMatrix(independtTerms1);
        System.out.println("Exercises 5 without pivote solution: ");
        printMatrix(exercises.exercise5WithoutPivoteo(matrix1,independtTerms1));
        System.out.println("Exercises 5 with pivote solution: ");
        printMatrix(exercises.exercise5PartialPivoteo(matrix1,independtTerms1));
        System.out.println("Exercises 6, Gauss by matrix Upper Hessemberg.");

        double[][] matrixUpperHessemberg = {{2,4,6,8},{3,3,6,9},{0,5,5,15},{0,0,7,21}};
        double[] independentTermUpperHessemberg = {2,3,5,7};
        printMatrix(matrixUpperHessemberg);
        printMatrix(independentTermUpperHessemberg);
        System.out.println("Solution:");
        printMatrix(exercises.exercise6(matrixUpperHessemberg,independentTermUpperHessemberg,calculator));

        double[][] matrixTridiagonal = {{1,2,0,0},{2,2,6,0},{0,6,3,8},{0,0,8,4}};
        double[] independentTermTridiagonal = {1,1,1,1};
        printMatrix(matrixTridiagonal);
        printMatrix(independentTermTridiagonal);
        System.out.println("Solution:");
        printMatrix(exercises.exercise7(matrixTridiagonal,independentTermTridiagonal,calculator));

        double[][] matrixGaussJordanInverse = {{2,1,-1},{-3,-1,2},{-2,1,1}};
        printMatrix(matrixGaussJordanInverse);
        System.out.println("Solution:");
        printMatrix(exercises.exercise8(matrixGaussJordanInverse));
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
