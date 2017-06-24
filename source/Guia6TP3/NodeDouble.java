package Guia6TP3;

/**
 * Created by Lucas on 15/5/2017.
 */
public class NodeDouble extends Node<Double> {
    private int row;
    private int column;
    private Double value;

    public NodeDouble(int row, int column, Double value) {
        this.row = row;
        this.column = column;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Double getValue() {
        return value;
    }
}
