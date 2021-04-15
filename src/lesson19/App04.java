package lesson19;

import java.io.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class App04 {
    public static void main(String[] args) throws IOException {
        write(Arrays.asList(
        new Student("Sasha" ,"Ivanov", LocalDate.of(2000,1,1),"g1",1.58,175),
        new Student("Masha" ,"Ivanova", LocalDate.of(2001,11,11),"g1",5.8,155)));
    }
     private static void write (List<Student>list) throws IOException {
        try(
         DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data.bin"));)
        {
            for(int i=0; i< list.size();i++){
                dataOutputStream.writeUTF(list.get(i).getFirstname());
                dataOutputStream.writeUTF(list.get(i).getLastname());
                dataOutputStream.writeLong(list.get(i).getBirthday().toEpochDay());
                dataOutputStream.writeUTF(list.get(i).getGroup());
                dataOutputStream.writeDouble(list.get(i).getWeight());
                dataOutputStream.writeLong(list.get(i).getHeight());
            }
        }

     }
}
