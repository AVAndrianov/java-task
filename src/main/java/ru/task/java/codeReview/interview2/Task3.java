package ru.task.java.codeReview.interview2;


public class Task3 {

    public class Main {
        public static void main(String[] args) {
            A objA = new A();
            B objB = new B();

            objA.b = objB; // ->  2
            objB.a = objA;

            // Удалятся ли объекты A и B?
            System.gc();   // ->  1
        }
    }
    //  1. Не гарантирует вызов сборщика мусора
    //  2. Тут объекты удалятся, тк гц не проверяет счетчик ссылок, а смотрит их достижимость с рутсета
    //    (Утечки памяти в джаве бывают, если ссылки достижимы)

}
