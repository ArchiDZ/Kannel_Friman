package Razdel10;

import java.util.Random;
import java.util.Scanner;

public class Glava10 {
    static Random rnd = new Random();
    static Scanner input = new Scanner(System.in);

    public static void zadanie_10_1(){
        int num = rnd.nextInt(10,99);
        System.out.println("-->"+num);
    }
    public static void zadanie_10_2(){
        int num1 = rnd.nextInt(-9,9);
        int num2 = rnd.nextInt(-9,9);
        System.out.println("(1)-->"+num1+" (2)-->"+num2);
    }
    public static void zadanie_10_3(){
        int num1 = rnd.nextInt(-9,9);
        int num2 = rnd.nextInt(-9,9);
        System.out.println("(1)-->"+num1+" (2)-->"+num2);
        if(num1>num2){
            System.out.println("Большее-->"+num1);
            System.out.println("Меньшее-->"+num2);
        }
        if (num1<num2){
            System.out.println("Большее-->"+num2);
            System.out.println("Меньшее-->"+num1);
        }
        if (num1==num2){
            System.out.println(num1+"<--Значения равны-->"+num2);
        }
    }
    public static void zadanie_10_4(){
        System.out.print("Введите число-->");
        int x = input.nextInt();
        for (int i=0;i<=2;i++) {
            int num = rnd.nextInt(x);
            System.out.println("("+i+")"+"--->"+num);
        }
    }
    public static void zadanie_10_5(){
        int x = rnd.nextInt(10,99);
        System.out.println("Сгенерированое число-->"+x);
        for (int i=1;i<=3;i++) {
            int num = rnd.nextInt(x);
            System.out.println("("+i+")"+"--->"+num);
        }
    }
    public static void zadanie_10_6(){
        int x = rnd.nextInt(10,99);
        System.out.println("Сгенерировано число--->"+x);
        for(int i=1;i<=3;i++){
            int num = rnd.nextInt(x,99);
            System.out.println("("+i+")"+"--->"+num);
        }
    }
}
