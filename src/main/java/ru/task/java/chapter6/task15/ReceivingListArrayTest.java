package ru.task.java.chapter6.task15;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReceivingListArrayTest {

    @Test
    public void receivingListArray() {
        List<String> list = new ArrayList<>(List.of("12", "123", "1234"));
        Map<String, Integer> map = ReceivingListArray.map(list, String::length);
        assertEquals(map.get("12"), list.get(0).length());
    }
}
