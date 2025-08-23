package ru.task.java.chapter5.task1;

import java.io.File;
import java.io.FileNotFoundException;

public final class FileReaderCustom {

    public static File getDirectories(String fileName) throws FileNotFoundException {
        String root =
                System.getProperty("user.dir")
                        + System.getProperty("file.separator");
        File file = new File(root + "src/main/resources/chapter5/" + fileName);
        if (file.isFile()) {
            return file;
        } else {
            throw new FileNotFoundException();
        }
    }
}
