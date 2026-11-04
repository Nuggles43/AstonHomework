package org.example;

import java.util.Arrays;

public class Array {
    public static int myArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr == null) {
            throw new MyArraySizeException("Массив равен null.");
        }
        if (arr.length >4 ){
            throw new MyArraySizeException("Количество строк больше 4.");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null || arr[i].length != 4) {
                throw new MyArraySizeException("Ошибка в строке " + i + "! Ожидалось 4 столбца");
            }
        }

        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    String value = arr[i][j];

                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j, value);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("-> Сработал внутренний перехват: " + e.toString());
                    throw new MyArraySizeException("Выход за границы массива: в строке или столбце меньше 4 элементов.");
                }
            }
        }
            return sum;

    }
}