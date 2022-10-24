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
}
