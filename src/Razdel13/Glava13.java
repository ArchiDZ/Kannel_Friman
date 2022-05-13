package Razdel13;

import java.util.Random;
import java.util.Scanner;

public class Glava13 {
    Random rnd = new Random();
    static Scanner scn = new Scanner(System.in);

    public static void zadanie_13_1(){
        int s1 = 0;
        int s2 = 0;
        for(int i=1;i<7;i++){
            int x = scn.nextInt();
            if(x%2==0){
                s1=s1+x;
            }
            if(x%3==0){
                s2=s2+x;
            }
        }
        System.out.println("s1-->"+s1);
        System.out.println("s2-->"+s2);
    }
}
