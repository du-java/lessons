package lesson20;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App01 {
    public static void main(String[] args) throws IOException {

        final File bmwTxt = new File("bmw.txt");

        System.out.println("is created " + bmwTxt.createNewFile());
        System.out.println("is exists " + bmwTxt.exists());

        System.out.println("isDirectory " + bmwTxt.isDirectory());
        System.out.println("isFile " + bmwTxt.isFile());

        System.out.println("getAbsolutePath " + bmwTxt.getAbsolutePath());
        System.out.println("getParent " + bmwTxt.getParent());

        final Path dir = Paths.get("files/txt");

        System.out.println("created files/txt" + Files.createDirectories(dir));

        System.out.println("isDirectory " + Files.isDirectory(Paths.get("files/txt")));

        Files.move(bmwTxt.toPath(), Paths.get(dir.toString(), bmwTxt.getName()));


    }
}
