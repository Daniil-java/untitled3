package ru.geekbrains.java.exceptions;


public class MainApp {
    public static int hight = 0;
    public static int width = 0;

    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "k", "4"},
                {"1", "2", "3", "4"}
        };

        try {
            System.out.println(summArray(arr));
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива");
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка значения элемента в массиве");
            System.out.println("Ошибка находится в ячейке: " + "[" + hight + "]" + "[" + width + "]");
        }
    }

    public static int summArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    hight = i;
                    width = j;
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}
