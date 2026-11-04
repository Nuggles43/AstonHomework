package org.example;

public class Main {
    public static void main(String[] args) {

        String[][] validArray = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };

        String[][] smallArray = {
                {"1", "2"},
                {"3", "4"}
        };

        String[][] bigArray = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"},
                {"5", "5", "5", "5"}
        };


        String[][] corruptArray = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "ТЕКСТ", "3", "3"},
                {"4", "4", "4", "4"}
        };

        System.out.println("--- Запуск тестов ---");

        runTest("Тест 1 (Корректный)", validArray);
        runTest("Тест 2 (Меньше 4х4)", smallArray);
        runTest("Тест 3 (Больше 4х4)", bigArray);
        runTest("Тест 4 (Некорректные данные)", corruptArray);
    }

    private static void runTest(String testName, String[][] array) {
        System.out.println("\n" + testName + ":");
        try {
            int sum = Array.myArray(array);
            System.out.println("Успех! Сумма всех элементов: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Перехвачена ошибка размера: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Перехвачена ошибка данных: " + e.getMessage());
        }
    }
}