package Guia7;


/**
 * Created by santiagohazana on 5/23/17.
 */
public class Exercises implements  TP4 {

    /**
     * Description: Solve equations by triangle upper matrix.
     */
    @Override
    public double[] exercise1(double[][] coefficients, double[] independentTerms) {
        double[] result = new double[independentTerms.length];
        for (int i=coefficients.length-1;i>=0;i--){
            result[i] = independentTerms[i];
            for (int j=i+1; j<coefficients.length; j++){
                result[i] -= (coefficients[i][j]*result[j]);
            }
        }
        return result;
    }

    /**
     * Description: Solve equations for an triangle lower matrix.
     */
    @Override
    public double[] exercise2(double[][] coefficients, double[] independentTerms) {
        double[][] coefficients2 = makeDiagonalToOne(coefficients);
        double[] independentTerms2 = independentTermsByMakeDiagonalToOne(coefficients,independentTerms);
        double[] result = new double[independentTerms2.length];
        for (int i=0;i<coefficients2.length;i++){
            result[i] = independentTerms2[i];
            for (int j=i-1; j>=0; j--){
                result[i] -= (coefficients[i][j]*result[j]);
            }
        }
        return result;
    }
    /**
     * Description: Auxiliary method that divide the term by diagonal position in the matrix for triangle lower matrix.
     */
    private double[] independentTermsByMakeDiagonalToOne(double[][] coefficients, double[] independentTerms) {
        double[] result = independentTerms;
        for (int i=0; i<coefficients.length;i++){
            result[i] = result[i]/coefficients[i][i];
        }
        return result;
    }
    /**
     * Description: Auxiliary method that divide diagonal by itself position in the matrix.
     */
    private double[][] makeDiagonalToOne(double[][] coefficients) {
        double[][] result = coefficients;
        for (int i=0; i<coefficients.length;i++){
            for (int j=0; j<coefficients.length;j++){
                result[i][j] = result[i][j]/result[i][i];
            }
        }
        return result;
    }

    /**
     * Description: Solve equations by Gauss's Method. Without pivote resolution.
     */
    @Override
    public double[] exercise5WithoutPivoteo(double[][] coefficients, double[] independentTerms) {
        double[][] coefficients2 = coefficients;
        double[] independentTerms2= independentTerms;
        double divider;
        for (int i=0; i<coefficients2.length; i++){
            divider = coefficients2[i][i];
            if (divider!=0) {
                for (int j = 0; j < coefficients2.length; j++) {
                    coefficients2[i][j] = coefficients2[i][j] / divider;
                }
                independentTerms2[i] = independentTerms2[i] / divider;
            }
            independentTerms2 = independentTermsByMakeZeroUnderDiagonal(coefficients2,independentTerms2,i);
            coefficients2 = makeZeroUnderDiagonal(coefficients2,i);
        }
        return exercise1(coefficients2,independentTerms2);
    }

    /**
     * Description: Applies consequences by making columns under the diagonal to zeros, for independent term.
     */
    private double[] independentTermsByMakeZeroUnderDiagonal(double[][] coefficients,double[] independentTerm, int position) {
        double[] result = independentTerm;
        for (int i=position+1; i<result.length; i++){
            result[i] = result[i] - (coefficients[i][position]*result[position]);
        }
        return result;
    }

    /**
     * Description: Makes columns under the diagonal to zeros.
     */
    private double[][] makeZeroUnderDiagonal(double[][] coefficients, int position) {
        double[][] coefficients2 = coefficients;
        if(position+1<coefficients.length) {
            for (int i = position+1; i < coefficients.length; i++) {
                double aux = coefficients2[i][position];
                for (int j = position; j < coefficients.length; j++) {
                    coefficients2[i][j] = coefficients2[i][j] - (aux*coefficients2[position][j]);
                }
            }
        }
        return coefficients2;
    }

    /**
     * Description: Solve equations by Gauss's Method. With partial pivote resolution.
     */
    @Override
    public double[] exercise5PartialPivoteo(double[][] coefficients, double[] independentTerms) {
        double[][] coefficients2 = coefficients;
        double[] independentTerms2= independentTerms;
        double divider;
        for (int i=0; i<coefficients2.length; i++){

            //Partial pivote begins here.
            double max = coefficients[i][i];
            for (int z=i;z<coefficients.length;z++){
                if(coefficients[z][i]>max){

                    double[] auxMatrix = coefficients2[z];
                    coefficients2[z] =  coefficients2[i];
                    coefficients2[i] = auxMatrix;

                    double auxIndependentTerm = independentTerms2[z];
                    independentTerms2[z] = independentTerms2[i];
                    independentTerms2[i]= auxIndependentTerm;
                }
            }
            //Partial pivote ends here.

            divider = coefficients2[i][i];
            if (divider!=0) {
                for (int j = 0; j < coefficients2.length; j++) {
                    coefficients2[i][j] = coefficients2[i][j] / divider;
                }
                independentTerms2[i] = independentTerms2[i] / divider;
            }
            independentTerms2 = independentTermsByMakeZeroUnderDiagonal(coefficients2,independentTerms2,i);
            coefficients2 = makeZeroUnderDiagonal(coefficients2,i);
        }
        return exercise1(coefficients2,independentTerms2);
    }
    /**
     * Description: Solve equations for Upper Hessemberg Matrix by Gauss's Method. With partial pivote resolution (it´s necessary.)
     */
    @Override
    public double[] exercise6(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        double[][] coefficients2 = coefficients;
        double[] independentTerms2= independentTerms;
        double divider;
        for (int i=0; i<coefficients2.length; i++){

            //Simple pivote begins here. Pivote only with next line.
            double max = coefficients[i][i];
                if( (i+1)< coefficients2.length && coefficients[i+1][i]>max){
                    double[] auxMatrix = coefficients2[i+1];
                    coefficients2[i+1] =  coefficients2[i];
                    coefficients2[i] = auxMatrix;

                    double auxIndependentTerm = independentTerms2[i+1];
                    independentTerms2[i+1] = independentTerms2[i];
                    independentTerms2[i]= auxIndependentTerm;
                }
//            }
            //Simple pivote ends here.

            divider = coefficients2[i][i];
            if (divider!=0) {
                for (int j = 0; j < coefficients2.length; j++) {
                    coefficients2[i][j] = coefficients2[i][j] / divider;
                }
                independentTerms2[i] = independentTerms2[i] / divider;
            }
            independentTerms2 = independentTermsByMakeZeroUnderDiagonal(coefficients2,independentTerms2,i);
            coefficients2 = makeZeroUnderDiagonalForUpperHessemberg(coefficients2,i);
        }
        return exercise1(coefficients2,independentTerms2);
    }

    /**
     * Description: Makes the position, same column but the next row, to zero. Only necessary to analyze the next row in the same column
     * because the precondition must be a Upper Hessemberg Matrix.
     */
    private double[][] makeZeroUnderDiagonalForUpperHessemberg(double[][] coefficients, int position) {
        double[][] coefficients2 = coefficients;
        if(position+1<coefficients.length) {
                double aux = coefficients2[position+1][position];
                for (int j = position; j < coefficients.length; j++) {
                    coefficients2[position+1][j] = coefficients2[position+1][j] - (aux*coefficients2[position][j]);
                }
            }
        return coefficients2;
    }

    /**
     * Description: Solve Tridiagonal and Simetric Matrix, by Spline Cubic method
     */
    @Override
    public double[] exercise7(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        double[][] coefficients2 = coefficients;
        double[] independentTerms2= independentTerms;
        double divider;
        int stopLoop;
        for (int i=0; i<coefficients2.length; i++){
            divider = coefficients2[i][i];

            stopLoop = i+2;
            if (i== coefficients2.length-1)
                stopLoop=coefficients2.length;
            if (divider!=0) {
                for (int j = 0; j < stopLoop; j++) {
                    coefficients2[i][j] = coefficients2[i][j] / divider;
                }
                independentTerms2[i] = independentTerms2[i] / divider;
            }
            independentTerms2 = independentTermsByMakeZeroUnderDiagonal(coefficients2,independentTerms2,i);
            coefficients2 = makeZeroUnderDiagonalTridiagonalMatrix(coefficients2,i,stopLoop);
        }
        return exercise1(coefficients2,independentTerms2);
    }

    /**
     * Descriptin: Similar to makeZeroUnderDiagonal, but process only moves up to stopLoop position.
     * Generally this stopLoop is equals to column plus two.
     */
    private double[][] makeZeroUnderDiagonalTridiagonalMatrix(double[][] coefficients, int position, int stopLoop) {
        double[][] coefficients2 = coefficients;
        if(position+1<coefficients.length) {
            double aux = coefficients2[position+1][position];
            for (int j = position; j < stopLoop; j++) {
                coefficients2[position+1][j] = coefficients2[position+1][j] - (aux*coefficients2[position][j]);
            }
        }
        return coefficients2;
//        double[][] coefficients2 = coefficients;
//        if(position+1<coefficients.length) {
//                double aux = coefficients2[position][position];
//                for (int j = position; j < coefficients2.length; j++) {
//                    coefficients2[position+1][j] = coefficients2[position+1][j] - (aux*coefficients2[position+1][j]);
//            }
//        }
//        return coefficients2;
    }

    @Override
    public double[][] exercise8(double[][] coefficients) {
//        double[][] extendsMatrix = extendsMatrixForGaussJordan(coefficients);
        return new double[0][];
    }

//    private double[][] extendsMatrixForGaussJordan(double[][] coefficients) {
//        double[][] result = new double[coefficients.length][coefficients.length*2];
//        for (int i=0; i<coefficients.length;i++){
//            for (int j=0;j<coefficients[i].length;j++){
//                if(j>coefficients.length && i==){
//
//                }
//                    result[i][j] = coefficients[i]
//            }
//        }
//    }

    @Override
    public double[] exercise9(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }
}
