package ru.task.java.chapter5.task4;

public final class ReturningErrorCode {

    public static void main(String[] args) {
        Integer errorCode = null;
        Double sum = null;
        for (double v : SumValuesFromFile.sumOfValues("listDoubleNumber.txt")) {
            if (sum == null) {
                sum = v;
            } else {
                errorCode = (int) v;
            }
        }
        switch (errorCode) {
            case ErrorCode.OK -> System.out.println("Успех.");
            case ErrorCode.FORBIDDEN -> System.out.println("Что то пошло не так.");
            case ErrorCode.NOT_FOUND -> System.out.println("Файл не найден.");
            case ErrorCode.INTERNAL_ERROR -> System.out.println("Неизвестная ошибка.");
        }
    }
}
