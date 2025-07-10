package ru.task.java.chapter6.task2;

public class StackObject<E> {

    Object[] mass;

    public void push(Object e) {
        if (mass == null) {
            mass = new Object[1];
        } else {
            Object[] tempMass = new Object[mass.length + 1];
            System.arraycopy(mass, 0, tempMass, 0, mass.length);
            mass = tempMass;
        }
        mass[mass.length - 1] = e;
    }

    public Object pop() {
        Object e = mass[mass.length - 1];
        Object[] tempMass = new Object[mass.length - 1];
        System.arraycopy(mass, 0, tempMass, 0, mass.length - 1);
        mass = tempMass;
        return e;
    }

    public boolean isEmpty() {
        return mass.length == 0;
    }

    public Object[] getMass() {
        return mass;
    }
}
