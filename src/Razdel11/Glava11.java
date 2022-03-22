package Razdel11;

import java.util.Random;
import java.util.Scanner;

public class Glava11 {
    static Random rnd = new Random();
    static Scanner scn = new Scanner(System.in);

    void zadanie_11_1(){}
    void zadanie_11_2(){}
    public static void zadanie_11_3(int x){
        int sum = 0;
        for(int i=1;i<6;i++){
            if(x>100) sum=sum+x;
        }
        System.out.println(sum);
    }
    public static void zadanie_11_4(){
    System.out.println("Введите число---");
    int x = scn.nextInt();
    for(int i = 0;i<5;i++){
        int x2 = scn.nextInt();
        if(x2>x){
            System.out.println(x2);
            x=x2;
        }
    }
    }
}
