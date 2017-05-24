package TP4;

import Guia6.Calculator;

/**
 * Created by santiagohazana on 5/23/17.
 */
public class Exercises implements  TP4 {

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

    private double[] independentTermsByMakeDiagonalToOne(double[][] coefficients, double[] independentTerms) {
        double[] result = independentTerms;
        for (int i=0; i<coefficients.length;i++){
            result[i] = result[i]/coefficients[i][i];
        }
        return result;
    }

    private double[][] makeDiagonalToOne(double[][] coefficients) {
        double[][] result = coefficients;
        for (int i=0; i<coefficients.length;i++){
            for (int j=0; j<coefficients.length;j++){
                result[i][j] = result[i][j]/result[i][i];
            }
        }
        return result;
    }

    @Override
    public double[] exercise5WithoutPivoteo(double[][] coefficients, double[] independentTerms) {
        double[][] coefficients2 = coefficients;
        double[] independentTerms2= independentTerms;
        for (int i=0; i<coefficients2.length; i++){
            for (int j=0; j<coefficients2.length;j++){
//                coefficients2=makeDiagonalToOneGauss(coefficients2,i,j);
                coefficients2[i][j] = coefficients2[i][j] / coefficients2[i][i];
           }
            //                independentTerms2=independentTermsByMakeDiagonalToOne(coefficients2,independentTerms2);
            independentTerms2[i]= independentTerms2[i]/coefficients[i][i];
            coefficients2 = makeZeroUnderDiagonal(coefficients2,i);
            independentTerms2 = independentTermsByMakeZeroUnderDiagonal(coefficients2,independentTerms2,i);
        }
        return exercise1(coefficients2,independentTerms2);
    }

    private double[] independentTermsByMakeZeroUnderDiagonal(double[][] coefficients,double[] independentTerm, int position) {
        double[] result = independentTerm;
        for (int i=position+1; i<result.length; i++){
            result[i] = result[i] - (coefficients[i][position]*result[i]);
        }
        return result;
    }

    private double[][] makeZeroUnderDiagonal(double[][] coefficients, int position) {
        double[][] coefficients2 = coefficients;
        if(position+1<coefficients.length) {
            for (int i = position+1; i < coefficients.length; i++) {
                for (int j = position; j < coefficients.length; j++) {
                    coefficients2[i][j] = coefficients2[i][j] - (coefficients2[i][position]*coefficients2[position][j]);
                }
            }
        }
        return coefficients2;
    }

    private double[][] makeDiagonalToOneGauss(double[][] coefficients,int row ,int column){
        double[][] result = coefficients;
        for (int i=column;i<coefficients.length;i++){
            result[row][column]  = result[row][column]/result[row][row];
        }
        return result;
    }


    @Override
    public double[] exercise5PartialPivoteo(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }

    @Override
    public double[] exercise6(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[] exercise7(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exercise8(double[][] coefficients) {
        return new double[0][];
    }

    @Override
    public double[] exercise9(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }
}
