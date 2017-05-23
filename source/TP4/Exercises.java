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
        return new double[0];
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
