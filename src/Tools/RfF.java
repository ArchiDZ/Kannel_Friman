package Tools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RfF {
    //читаем из файла
    static Scanner scn = new Scanner(System.in);

    public static void readFromCsv(){
        String filePath = "src/Files/testcsv.csv";
        BufferedReader reader = null;
        String line = "";
        System.out.println("Что ищем?");
        String serch = scn.next();
        try{
            reader = new BufferedReader(new FileReader(filePath));
            while((line = reader.readLine())!=null){
                String [] row = line.split(",");

                for(String index : row){
                    if(serch.equals(row)){
                        System.out.println(line);
                    }
                   // System.out.printf("%-10s",index);
                }
                System.out.println();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
