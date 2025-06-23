package ru.task.java.chapter5.task4;

import java.util.Optional;

public final class ReturningErrorCode {

    public static Optional<Integer> processDate(String input) {
        if (input == null) {
            return Optional.of(ErrorCode.INTERNAL_ERROR.getCode());
        }
        if (input.equals("-1")) {
            return Optional.of(ErrorCode.FORBIDDEN.getCode());
        }
        return Optional.of(ErrorCode.OK.getCode());
    }

    public static void main(String[] args) {
        ReturningErrorCode.processDate("123").ifPresent(System.out::println);
        ReturningErrorCode.processDate("-1").ifPresent(System.out::println);
        ReturningErrorCode.processDate(null).ifPresent(System.out::println);
    }
}
