package Guia6TP3;

/**
 * Created by Lucas on 11/5/2017.
 */
public class Guia6Test {
    public static void main(String[] args ){
        CalculatorTP6 calculator = new CalculatorTP6();
//        Exercise1TP6 exercise1 = new Exercise1TP6();
//        double[][] identityMatrix = {{1,0,0},{0,1,0},{0,0,1}}; // matriz identidad cuadrada de 3x3
//        double[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
//        double[] vector1 = {1,2,3};
//
//        printMatrix(matrix1);
//        System.out.println("Exercise 1) A): "+exercise1.exerciseA(matrix1,calculator));//=15
//        System.out.println("Exercise 1) B): "+exercise1.exerciseB(matrix1,calculator));//=15
//        System.out.println("-----------------------------------------");
//        printMatrix(matrix1);
//        System.out.println("Exercise 1) C), vector result: ");
//        printMatrix(exercise1.exerciseC(matrix1,calculator));
//        System.out.println("-----------------------------------------");
//        printMatrix(matrix1);
//        printMatrix(vector1);
//        System.out.println("Exercise 1) D), a vector result: ");
//        printMatrix(exercise1.exerciseD(matrix1,vector1,calculator));
//        System.out.println("-----------------------------------------");
//        double[][] matrix2 = {{1,2},{4,5},{7,8}};
//        double[] vector2 = {1,2};
//        printMatrix(matrix2);
//        printMatrix(vector2);
//        System.out.println("Exercise 1) D) Another Example, a vector result: ");
//        printMatrix(exercise1.exerciseD(matrix2,vector2,calculator));
//        System.out.println("-----------------------------------------");
//        printMatrix(matrix1);
//        printMatrix(identityMatrix);
//        System.out.println("Exercise 1) E), matrix result: ");
//        printMatrix(exercise1.exerciseE(matrix1,identityMatrix,calculator));
//        System.out.println("-----------------------------------------");
//        printMatrix(matrix2);
//        double[][] matrix3 = {{1,4,7},{2,5,8}};
//        printMatrix(matrix3);
//        System.out.println("Exercise 1) F), matrix result: ");
//        printMatrix(exercise1.exerciseF(matrix2,matrix3,calculator));
//        System.out.println("-----------------------------------------");
//        printMatrix(matrix2);
//        System.out.println("Exercise 1) G), matrix result: ");
//        printMatrix(exercise1.exerciseG(matrix2,calculator));
//        System.out.println("-----------------------------------------");
//
//        Exercise2TP6 exercise2 = new Exercise2TP6();
//        printMatrix(identityMatrix);
//        System.out.println("Exercise 2) A), matrix is symmetrical: "+exercise2.exerciseA(identityMatrix,calculator));
//        System.out.println("-----------------------------------------");
//        double[][] matrix4 ={{-4,2,1},{2,-8,4},{1,-1,6}};
//        printMatrix(matrix4);
//        System.out.println("Exercise 2) B), matrix is upper diagonal: "+exercise2.exerciseB(matrix4,calculator));
//        System.out.println("-----------------------------------------");
//
//        Exercise4TP6 exercise4 = new Exercise4TP6();
//        Node<Double> node1 = new NodeDouble(1,1, 1.0);
//        Node<Double> node2 = new NodeDouble(1,2, 7.0);
//        Node<Double> node3 = new NodeDouble(1,3, -2.0);
//        Node<Double> node4 = new NodeDouble(2, 2, -3.0);
//        Node<Double> node5 = new NodeDouble(2, 3, 4.0);
//        Node<Double> node6 = new NodeDouble(3, 3, 2.0);
//        System.out.println("Matrix A and B :");
//        Node[] matrixA = {node1,node2,node3,node4,node5,node6};
//        Node[] matrixB = {node1,node2,node3,node4,node5,node6};
//        printMatrixUpperTriangular(matrixA);
//        System.out.println("Matrix (A+B):");
//        printMatrixUpperTriangular(exercise4.summation(matrixA,matrixB,calculator));

        Exercise3 exercise3 = new Exercise3TP6();
        double[][] testMatrixA = {{1, 0, 0}, {2, 3, 0}, {4, 5, 6}};
        double[][] testMatrixB = {{1, 7, -2}, {0, -3, 4}, {0, 0, 2}};
        double[] testVectors = {1, 2, 3, 4};

        printMatrix(exercise3.exerciseE(testMatrixA, testMatrixB, calculator));


    }

    public static void printMatrix(double[][] matrix) {
        System.out.println("\n"+"Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"  ");
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

    public static void printMatrixUpperTriangular(Node[] matrix) {
        System.out.println("\n"+"Nodes:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Row: "+matrix[i].getRow()+"\t"+"Column: "+matrix[i].getColumn()
            +"\t"+"Value: "+ matrix[i].getValue());
        }
        System.out.println();
    }


}
