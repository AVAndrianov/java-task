package ru.task.java.chapter5.task14;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class FormatterLogged extends ConsoleHandler {

    private static Logger logged;

    public static void logged(String line) {
        logged.fine(line);
        System.out.println(logged.getName());
    }

    public static void main(String[] args) throws IOException {
        logged = Logger.getLogger("ru.task.java");
        logged.setLevel(Level.FINE);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.FINE);
        handler.setFormatter(new HtmlFormatter());
        logged.addHandler(handler);
        logged.setFilter(record -> !record.getMessage().equals("123"));
        FormatterLogged.logged("1");
        FormatterLogged.logged("123");
        FormatterLogged.logged("2");
        FormatterLogged.logged("3");
    }
}
