package TP4;

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
