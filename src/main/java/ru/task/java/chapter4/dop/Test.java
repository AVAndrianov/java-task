package ru.task.java.chapter4.dop;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    @Key
    String line;
    @Key
    Integer number;
    @Key
    Double aDouble;

    @Override
    public String toString() {
        return "Test{" +
                "line='" + line + '\'' +
                ", number=" + number +
                ", aDouble=" + aDouble +
                '}';
    }

    public <T> void set(Class<T> clazz, Map<String, Object> map) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object obj = clazz.getDeclaredConstructor().newInstance();
        List<Field> fields = Arrays.stream(obj.getClass().getDeclaredFields()).filter(i -> i.isAnnotationPresent(Key.class)).collect(Collectors.toList());
        for (Field field : fields) {
            field.setAccessible(true);
            field.set(obj, map.get(field.getType().getSimpleName()));
        }
        System.out.println(obj);
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Test test = new Test();
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("String", "Hello");
        map.put("Integer", 1);
        map.put("Double", 1.1d);
        test.set(Test.class, map);
    }
}
