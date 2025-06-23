package ru.task.java.codeReview.interview3;

import java.util.ArrayList;
import java.util.Collections;

// Сделать класс иммутабельным
public record Person(String fio, List<Address> addressList) {
    // Канонический конструктор с глубокой копией списка

    public Person(String fio, List<Address> addressList) {
        this.fio = fio;
        this.addressList = new ArrayList<>(addressList); // Глубокая копия (если Address иммутабелен)
    }

    // Геттер, возвращающий неизменяемую обёртку
    @Override
    public List<Address> addressList() {
        return Collections.unmodifiableList(addressList);
    }
}
