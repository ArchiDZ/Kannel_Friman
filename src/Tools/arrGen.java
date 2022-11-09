package Tools;

import java.util.Arrays;
import java.util.Random;

public class arrGen {
    public int [] arrayGenerator(int x){
        Random rnd = new Random();
        int [] array = new int[x];
        for (int i = 0;i<array.length;i++){
            array[i] = rnd.nextInt(0,99);
        }
        System.out.println( Arrays.toString(array));
        return array;
    }
    public static void checkArrafterDelimetr(int [] array_from_19_10){
        /*Для проверки результата содержимого массива из задачи
        * Каннель и Фриман глава 19 задача 19.10*/

        for(int i = 0;i<array_from_19_10.length;i++){
            int remain = array_from_19_10[i]%3;
            System.out.println(array_from_19_10[i]+" остаток-->"+remain);
        }
    }
}
