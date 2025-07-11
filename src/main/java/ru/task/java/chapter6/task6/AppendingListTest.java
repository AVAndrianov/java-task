package ru.task.java.chapter6.task6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AppendingListTest {

    @Test
    public void concatListSuperTest() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("1");
        list2.add("2");
        AppendingList<String> appendingList = new AppendingList<>();
        appendingList.concatListSuper(list, list2);
        assert list.toString().equals("[1, 2]");
    }

    @Test
    public void concatListExtendsTest() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("1");
        list2.add("2");
        AppendingList<String> appendingList = new AppendingList<>();
        appendingList.concatListExtends(list, list2);
        assert list.toString().equals("[1, 2]");
    }
}
