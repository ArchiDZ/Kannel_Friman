package Razdel7;

import java.util.Random;
import java.util.Scanner;

public class Glava7 {
    static Scanner input = new Scanner(System.in);
    static Random rnd = new Random();

    public static void zadanie_7_1(){
        System.out.println("Введите значение АВГ");
        int avg = input.nextInt();
        if(avg==100){
            System.out.println("Молодец");
        }
        System.out.println("Введите значение МАРК");
        int mark = input.nextInt();
        if (mark<60){
            int sum=mark+(mark/100*10);
            System.out.println("Значение МАРК-->"+sum);
        }
        int one = rnd.nextInt(10)+1;
        int two = rnd.nextInt(10)+1;
        if(one>two){
            System.out.println("Значение one-->"+one);
    }else System.out.println("Значение two-->"+two);
        int  min = -10;
        int max = 10;
        int num = rnd.nextInt(max-min)-min;
        if(num>0){
            System.out.println(num);
            System.out.println("Положительное");
        }else System.out.println("Отрицательное");

        int ugol1,ugol2,ugol3;
        ugol1 = rnd.nextInt(100-10);
        ugol2 = rnd.nextInt(100-10);
        ugol3 = rnd.nextInt(100-10);
        System.out.println("Значение угол1-->"+ugol1);
        System.out.println("Значение угол2-->"+ugol2);
        System.out.println("Значение угол3-->"+ugol3);
        int sumUgol = ugol1+ugol2+ugol3;
        if (sumUgol==180){
            System.out.println("Это углы одного треугольника-->"+sumUgol);
        }else System.out.println("Это не углы одного треугольника-->"+sumUgol);

}
public static void zadanie_7_2(){
        int a = rnd.nextInt(100-1);
        System.out.println("Значение переменной а-->"+a);
        int digit1 = a/10;
        int digit2 = a%10;
    System.out.println("Значение переменной digit1-->"+digit1);
    System.out.println("Значение переменной digit2-->"+digit2);
        if(digit1==digit2)
            System.out.println("Значения равны");
        else System.out.println("Значения не равны");
}
public static void zadanie_7_3(){
        int a =2;
        int a1 = 4;
        int a2 = 9;
        int a3 = 4;
        int a4 = 3;
        int a5 = 6;

        int b = 6;
        int b1 = 4;
        int b2 = 2;
        int b3 = 9;
        int b4 = 9;
        int b5 = 0;
        if(a%3==b%4) {
            System.out.println(a - b);
        }else System.out.println(b-a);
    if(a1%3==b1%4) {
        System.out.println(a1 - b1);
    }else System.out.println(b1-a1);
    if(a2%3==b2%4) {
        System.out.println(a2 - b2);
    }else System.out.println(b2-a2);
    if(a3%3==b3%4) {
        System.out.println(a3 - b3);
    }else System.out.println(b3-a3);
    if(a4%3==b4%4) {
        System.out.println(a4 - b4);
    }else System.out.println(b4-a4);
    if(a5%3==b5%4) {
        System.out.println(a5 - b5);
    }else System.out.println(b5-a5);
}
public static void mod_zadanie_7_3(){
        int [] a = {2,4,9,4,3,6};
        int [] b = {6,4,2,9,9,0};

}
}
