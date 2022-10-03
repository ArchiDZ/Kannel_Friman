package BookKannnel.Razdel1.Razdel17;

import java.util.Scanner;

public class Excer_17_36 {
    public static Scanner in =  new Scanner(System.in);

    public static void ex_17_36(){
        int x = in.nextInt();
        int y = what(x);
        System.out.println(y);
    }
    public static int what(int temp){
        int count1 = 0;
        int count2 = 0;
        int digit = 0;

        while(temp>0){
            digit=temp%10;
            if (digit%2==0){
                count1++;
            }else count2++;
            temp/=10;
        }
        if (count1>count2)
            return 1;
        if (count1<count2)
            return -1;
        return 0;
    }
}
