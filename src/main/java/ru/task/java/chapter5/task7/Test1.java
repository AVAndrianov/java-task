package ru.task.java.chapter5.task7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Scanner;

@ExtendWith(MockitoExtension.class)
public class Test1 {

    @Test
    void testTryWithResourcesSuccess() {
        try (Scanner sc = new Scanner(new ErrorClosingResource())) {
            sc.hasNext();
        } catch (Exception e) {
            System.err.println("Ошибка при закрытии Scanner: " + e.getMessage());
        }
    }
}
