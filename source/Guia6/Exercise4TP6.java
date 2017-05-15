package Guia6;

/**
 * Created by Lucas on 13/5/2017.
 */
public class Exercise4TP6 implements Exercise4{

    public Node[] summation(Node[] matrixA, Node[] matrixB, Calculator calculator) {
        NodeDouble[] matrixResult = new NodeDouble [matrixA.length];
        for (int i=0;i<matrixResult.length;i++){
            for (int j=0; j<matrixResult.length;j++){
                if(matrixA[i].getColumn()==matrixB[j].getColumn() && matrixA[i].getRow() == matrixB[j].getRow())
                    matrixResult[i] = new NodeDouble(matrixA[i].getRow(),
                            matrixA[i].getColumn(),
                            calculator.sum((Double) matrixA[i].getValue(), (Double) matrixB[j].getValue())
                    );
            }
        }
        return matrixResult;
    }
}
