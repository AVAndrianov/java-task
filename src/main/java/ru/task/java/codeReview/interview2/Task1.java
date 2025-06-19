package ru.task.java.codeReview.interview2;

import java.util.stream.Stream;

public class Task1 {

    public Stream<Users> getUsersStream() {
        Connction conn = DataSourceObject.getConnection();   // ->1
        Stream<Users> userStream = executeAndReturnStream(conn);
        conn.close();   //  ->2
        return userStream;
    }

    public void processUsers() {
        Stream<User> users = getUsersStream();
        users.forEach(user -> System.out.prrint(user.getName()));    // ->3, 4
    }

    //       1. Ошибка в имени класса Connction
    //       2. Закрытие соединения с бд происходит до завершения работы со стримом
    //       срим может обрабатывать данные асинхронно или лениво и при попытке обратится
    //       к бд получается SQLException.
    //       В данном случае используем userStream.onClose(conn::close) либо try-with-resources
    //       3. map(User::getName)
    //       4. Ошибка в слове prrint
}
