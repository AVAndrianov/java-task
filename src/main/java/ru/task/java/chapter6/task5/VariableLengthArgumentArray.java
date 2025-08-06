package ru.task.java.chapter6.task5;

public class VariableLengthArgumentArray {

    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }


    public static void main(String[] args) {
        //incompatible types: inference variable T has incompatible bounds
        //невозможно точно определить тип объекта из литерала
//        Double[] result = VariableLengthArgumentArray.swap(0, 1, 1.5, 2, 3);
        //Тип объекта определен <Double> при этом литералы без плавающей точки будут расценены как int
        //ошибка при этом стала менее кртичной
        //varargs mismatch; int cannot be converted to java.lang.Double
//        Double[] result = VariableLengthArgumentArray.<Double>swap(0, 1, 1.5, 2, 3);

        //Необходимо передавать значения одного типа
        Double[] result = VariableLengthArgumentArray.<Double>swap(0, 1, 1.5, 2.0, Double.valueOf(3));
    }
}
