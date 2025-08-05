package ru.task.java.chapter6.task5;

public class VariableLengthArgumentArray {

    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }

    //Необходимо передавать значения одного типа

    public static void main(String[] args) {
//        Double[] result = VariableLengthArgumentArray.swap(0, 1, 1.5, 2, 3);
//        result = VariableLengthArgumentArray.<Double>swap(0, 1, 1.5, 2, 3);
    }
}
