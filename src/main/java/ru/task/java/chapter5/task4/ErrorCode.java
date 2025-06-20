package ru.task.java.chapter5.task4;

public enum ErrorCode {

    OK(20),
    FORBIDDEN(43),
    NOT_FOUND(44),
    INTERNAL_ERROR(50);

    private final int code;

    ErrorCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
