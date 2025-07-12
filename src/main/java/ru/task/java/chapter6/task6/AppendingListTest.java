package ru.task.java.chapter6.task6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AppendingListTest {

    @Test
    public void concatListStringSuperTest() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("1");
        list2.add("2");
        AppendingList<String> appendingList = new AppendingList<>();
        appendingList.concatListSuper(list, list2);
        assert list.toString().equals("[1, 2]");
    }

    @Test
    public void concatListStringExtendsTest() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("1");
        list2.add("2");
        AppendingList<String> appendingList = new AppendingList<>();
        appendingList.concatListExtends(list, list2);
        assert list.toString().equals("[1, 2]");
    }

    @Test
    public void concatListIntegerSuperTest() {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(1);
        list2.add(2);
        AppendingList<Integer> appendingList = new AppendingList<>();
        appendingList.concatListSuper(list, list2);
        assert list.toString().equals("[1, 2]");
    }

    @Test
    public void concatListIntegerExtendsTest() {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(1);
        list2.add(2);
        AppendingList<Integer> appendingList = new AppendingList<>();
        appendingList.concatListExtends(list, list2);
        assert list.toString().equals("[1, 2]");
    }

    @Test
    public void concatListDoubleSuperTest() {
        List<Double> list = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        list.add(1.0);
        list2.add(2.0);
        AppendingList<Double> appendingList = new AppendingList<>();
        appendingList.concatListSuper(list, list2);
        assert list.toString().equals("[1.0, 2.0]");
    }

    @Test
    public void concatListDoubleExtendsTest() {
        List<Double> list = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        list.add(1.0);
        list2.add(2.0);
        AppendingList<Double> appendingList = new AppendingList<>();
        appendingList.concatListExtends(list, list2);
        assert list.toString().equals("[1.0, 2.0]");
    }
    @Test
    public void concatListNumberSuperTest() {
        List<Number> list = new ArrayList<>();
        List<Number> list2 = new ArrayList<>();
        list.add(1.0);
        list2.add(2.0);
        AppendingList<Number> appendingList = new AppendingList<>();
        appendingList.concatListSuper(list, list2);
        assert list.toString().equals("[1.0, 2.0]");
    }

    @Test
    public void concatListNumberExtendsTest() {
        List<Number> list = new ArrayList<>();
        List<Number> list2 = new ArrayList<>();
        list.add(1.0);
        list2.add(2.0);
        AppendingList<Number> appendingList = new AppendingList<>();
        appendingList.concatListExtends(list, list2);
        assert list.toString().equals("[1.0, 2.0]");
    }
}
