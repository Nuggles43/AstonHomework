package org.example;

public class MyArrayDataException extends Exception {
    private final int row;
    private final int col;

    public MyArrayDataException(int row, int col, String value) {
        super("Неверные данные в ячейке [" + row + "][" + col + "]: '" + value + "' не является числом");
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }


}
