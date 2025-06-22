package ru.task.java.codeReview.interview2;

import java.util.HashMap;

public class Task2 {

    static class User {
        int id;
        String name;
    }

    HashMap<User, String> map = new HashMap();


    public static void main(String[] args) {
        User u = new User();
        u.id = 5;
        System.out.println(u.hashCode());
        u.id = 6;
        System.out.println(u.hashCode());
    }
    // В какой ситуации будет утерян элемент внутри map?

    // 1. HashCode и equals не переопределены, значит у объектов с одинаковыми полями будут разные hashCode,
    // при этом они и по equals будут разные потому что по ссылке будет сравнение.
    // 2. Если изменить объект после добавления в мапу.
    // 3. Несколько потоков меняют структуру hashMap
    //    В остальном - положить объект удастся, вытащить его по get - только если у нас есть изначальный объект.
    //    В остальных случаях - нет, тк контракт хэш код - иквалс не переопределен
    //    Хэш код у Object для объекта - детерминированный внутри одного запуска jvm
}
