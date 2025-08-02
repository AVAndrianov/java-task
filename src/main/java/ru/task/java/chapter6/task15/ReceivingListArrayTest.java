package ru.task.java.chapter6.task15;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReceivingListArrayTest {

    @Test
    public void receivingListArray() {
        List<String> list = new ArrayList<>(List.of("12", "123", "1234"));
        Map<String, Integer> map = ReceivingListArray.map(list, (String str) -> {
            return str.length();
        });
        assert map.get("12").equals(list.get(0).length());
    }
}
