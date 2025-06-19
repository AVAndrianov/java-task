package ru.task.java.codeReview.interview2;


import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        for (Integer integer : list) {
            list.remove(1);
        }
    }

    //  На второй итерации ConcurrentModificationException.

}
