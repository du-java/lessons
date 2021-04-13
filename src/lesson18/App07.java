package lesson18;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App07 {
    public static void main(String[] args) {
        try(
        FileReader abc= new FileReader("file.txt")){
            int read = abc.read();
            StringBuilder stringBuilder = new StringBuilder();
            while (read != -1){
                stringBuilder.append((char)read);
                read= abc.read();
            }
            System.out.println(stringBuilder);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
