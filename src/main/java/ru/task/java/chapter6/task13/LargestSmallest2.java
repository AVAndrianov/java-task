package ru.task.java.chapter6.task13;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LargestSmallest2 {

    public static <E> void minmax(List<E> elements, Comparator<? super E> comp, List<? super E> result) {
        result.add(elements.stream().max(comp).orElse(null));
        result.add(elements.stream().min(comp).orElse(null));
    }

    public static <E> void maxmin(List<E> elements, Comparator<? super E> comp, List<? super E> result) {
        minmax(elements, comp, result);
        LargestSmallest2.swapHelper((ArrayList<E>) result, 0, 1);
    }

    private static <E> void swapHelper(ArrayList<E> elements, int i, int j) {
        E temp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, temp);
    }
}

interface LargestSmallest {
    <E> void minmax(List<E> elements, Comparator<? super E> comp, List<? super E> result);
}

class LargestSmallestImpl implements LargestSmallest {

    @Override
    public <E> void minmax(List<E> elements, Comparator<? super E> comp, List<? super E> result) {
        result.add(elements.stream().max(comp).orElse(null));
        result.add(elements.stream().min(comp).orElse(null));
    }


}
