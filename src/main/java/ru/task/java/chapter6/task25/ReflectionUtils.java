package ru.task.java.chapter6.task25;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

public class ReflectionUtils {

    public static void printMethodTypeInfo(Method method) {
        TypeVariable<?>[] paramType = method.getTypeParameters();
        for (TypeVariable<?> typeVariable : paramType) {
            System.out.println("Имя параметра: " + typeVariable.getTypeName());
            Type[] bounds = typeVariable.getBounds();
            for (Type bound : bounds) {
                System.out.println("Ограничение: " + bound.getTypeName());
            }
        }
        Type[] paramTypes = method.getGenericParameterTypes();
        for (int i = 0; i < paramTypes.length; i++) {
            Type t = paramTypes[i];
            System.out.println("  Параметр " + i + ": " + t.getTypeName());
            if (t instanceof ParameterizedType pt) {
                Type rawType = pt.getRawType();
                System.out.println("    Raw тип: " + rawType.getTypeName());
                Type[] actualArgs = pt.getActualTypeArguments();
                for (int j = 0; j < actualArgs.length; j++) {
                    System.out.println("    Аргумент типа " + j + ": " + actualArgs[j].getTypeName());
                }
            }
        }
    }

    // Пример использования
    public static void main(String[] args) throws NoSuchMethodException {
        // Предположим, есть такой метод:
        class Example {
            public <T extends Number & Comparable<T>> void exampleMethod(List<T> list, Object item) {
            }
        }

        Method method = Example.class.getDeclaredMethod("exampleMethod", List.class, Object.class);
        printMethodTypeInfo(method);
    }
}
