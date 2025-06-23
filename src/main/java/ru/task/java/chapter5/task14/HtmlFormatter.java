package ru.task.java.chapter5.task14;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class HtmlFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        return "<p>" +
                formatMessage(record) +
                "</p>\n";
    }
}
