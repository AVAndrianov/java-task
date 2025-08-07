package ru.task.java.chapter6.task25;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.List;

public class ReflectionUtilsTest {

    @Test
    public void reflectionUtilsTest() {
        class Example {
            public <T extends Number & Comparable<T>> void exampleMethod(List<T> list, Object item) {
            }
        }
        Method method = null;
        try {
            method = Example.class.getDeclaredMethod("exampleMethod", List.class, Object.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        assert method != null;
        ReflectionUtils.printMethodTypeInfo(method);
    }
}
