package ru.task.java.chapter4.dop;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Animal {

    public static class Cat {
        @Key
        private String name;
        @Key
        private Integer age;
        @Key
        private Double weight;

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    '}';
        }
    }

    public static <T> Object set(Class<T> clazz, Map<String, Object> map) throws Exception {
        Object obj = clazz.getDeclaredConstructor().newInstance();
        List<Field> fields = Arrays.stream(obj.getClass().getDeclaredFields()).filter(i -> i.isAnnotationPresent(Key.class)).collect(Collectors.toList());
        for (Field field : fields) {
            field.setAccessible(true);
            field.set(obj, map.get(field.getType().getSimpleName()));
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("String", "Cat");
        map.put("Integer", 5);
        map.put("Double", 5.5d);
        System.out.println(set(Cat.class, map));
    }
}
