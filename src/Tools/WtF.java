package Tools;

import java.io.*;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.Arrays;

public class WtF {
    //Write to File

    public static void letsSaveIt (int [] array){
        String str = Arrays.toString(array);
        LocalDateTime ldt = LocalDateTime.now();
        try {
            FileWriter fl = new FileWriter("src/Files/arrayFile.txt",true);//true метка для разрешения добавления новой строки
            fl.append(str+" added -->"+ldt+"\n");
            fl.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
