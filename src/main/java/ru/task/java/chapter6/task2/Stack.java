package ru.task.java.chapter6.task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack<E> {

    E[] mass;

    public void push(E e) {
        if (mass == null) {
            mass = (E[]) new Object[1];
        } else {
            E[] tempMass = Arrays.copyOf(mass, mass.length + 1, (Class<? extends E[]>) mass.getClass());
            System.arraycopy(mass, 0, tempMass, 0, mass.length);
            mass = tempMass;
        }
        mass[mass.length - 1] = e;
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        E e = mass[mass.length - 1];
        E[] tempMass = (E[]) Array.newInstance(mass.getClass().getComponentType(), mass.length - 1);
        System.arraycopy(mass, 0, tempMass, 0, mass.length - 1);
        mass = tempMass;
        return e;
    }

    public boolean isEmpty() {
        return mass.length == 0;
    }

    public E[] getMass() {
        return mass;
    }
}
