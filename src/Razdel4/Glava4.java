package Razdel4;

import java.util.Random;
import java.util.Scanner;

public class Glava4 {
    static Scanner input = new Scanner(System.in);
    static Random rnd = new Random();

    public static void zadanie_4_1(){
        System.out.println("Введите двухзначное число");
        int num = input.nextInt();
        System.out.println(num/10+" "+num%10);
    }
    public static void zadanie_4_2() {
        System.out.println("Введите трехзначное число");
        int num = input.nextInt();
        System.out.println(num / 100 + " --> " +(num/10)%10+ " --> " + num%10);
    }
    public static void zadanie_4_3(){
        System.out.println("Введите двухзначное число");
        int num = input.nextInt();
        System.out.println(num%10+" "+num/10);
    }
    public static void zadanie_4_4(){
        System.out.println("Введите трехзначное число");
        int num = input.nextInt();
        System.out.println(num % 10 + " --> " +(num/10)%10+ " --> " + num/100);
    }
    public static void zadanie_4_5(){
        System.out.println("Введите двухзначное число");
        int num = input.nextInt();
        System.out.println((num/10)*10+" + "+num%10);
    }
    public static void zadanie_4_6(){
        System.out.println("Введите трехзначное число");
        int num = input.nextInt();
        System.out.println((num / 100)*100 + "+" +((num/10)%10)*10+ "+" + num%10);
    }
    public static void zadanie_4_7(){
        System.out.println("Введите двухзначное число");
        int num = input.nextInt();
        int number1 = (num%10)*10;
        int number2 = (number1+(num/10))+8;
        System.out.println("Магическое число-->"+number2);
    }
    public static void zadanie_4_8(){
        System.out.println("Введите трехзначное число");
        int num = input.nextInt();
        int number1 = (num % 10)*100;
        int number2 = number1+((num/10)%10)*10+(num/100);
        int number3 = number2-20;
        System.out.println("Магия цифр-->"+number3);
    }
    public static void zadanie_4_9(){
        System.out.println("Вес числа (Сумма цифр числа)");
        System.out.print("Введите двухзначное число");
        int num = input.nextInt();
        int number1 = num/10;
        int number2 = num%10;
        int summ = number1+number2;
        System.out.println("Вес числа "+num+"  -->"+summ);
    }
    public static void zadanie_4_10(){
        System.out.println("Вес числа (Сумма цифр числа)");
        System.out.print("Введите трехзначное число-->");
        int num = input.nextInt();
        int number1=num/100 ;
        int number2=(num/10)%10;
        int number3 = num%10;
        int sum = number1+number2+number3;
        System.out.println("Вес числа "+num+"  -->"+sum);
    }
    public static void zadanie_4_11(){
        System.out.println("Длинна двухзначного числа");
        System.out.println("Введите двухзначное число");
        int num = input.nextInt();
        int number1 = (num/10)*10;
        int number2 = number1 -num%10;
        System.out.println("Длинна числа "+number2);
    }
    public static void zadanie_4_12(){
        System.out.println("Длинна трехзначного числа");
        System.out.print("Введите трехзначное число--> ");
        int num = input.nextInt();
        int number1 = (num/100)*100;
       // int number2 = num%
    }

}
