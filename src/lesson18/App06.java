package lesson18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
       try ( FileOutputStream fos = new FileOutputStream("file.txt")){
           fos.write(line.getBytes(StandardCharsets.UTF_8));
       }
        catch (IOException ex){

        }


    }
}
