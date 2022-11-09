package Tools;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class WtF {
    //Write to File

    public static void letsSaveIt (int [] array){
        String str = Arrays.toString(array);
        try(FileOutputStream fos = new FileOutputStream("src/Files/arrayFile.txt")) {
            byte [] buffer = str.getBytes();
            fos.write(buffer);
            System.out.println("Запись прошла успешно!");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
