package ru.task.java.codeReview;

public class Transaction {

    @Service
    public class MyService {
        @Transactional
        public void test() {
            test1();
        }

        @Transactional(propagation = PROPAGATION.REQUIRE_NEW)
        public void test1() {
        ...
        }
    }

    //Спринг оборачивает бины в прокси с пмощью сджелиб джедекапрокси  !!!!
    // из за этого механизма в 5 строке  метод не будет обернут в прокси
}
