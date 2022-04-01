package Razdel11;

import java.util.Random;
import java.util.Scanner;

public class Glava11 {
    static Random rnd = new Random();
    static Scanner scn = new Scanner(System.in);


    void zadanie_11_1() {
    }

    void zadanie_11_2() {
    }

    public static void zadanie_11_3(int x) {
        int sum = 0;
        for (int i = 1; i < 6; i++) {
            if (x > 100) sum = sum + x;
        }
        System.out.println(sum);
    }

    public static void zadanie_11_4() {
        System.out.println("Введите число---");
        int x = scn.nextInt();
        for (int i = 0; i < 5; i++) {
            int x2 = scn.nextInt();
            if (x2 > x) {
                System.out.println(x2);
                x = x2;
            }
        }
    }

    public static void zadanie_11_8() {
        System.out.println("Вывод 20 случайных значений в 1 строку");

        for (int i = 1; i <= 20; i++) {
            int num = rnd.nextInt(-20, 35);
            if (num < 0) {
                System.out.print(num + "? ");
            } else {
                System.out.print(num + " ");
            }
        }
    }

    public static void zadanie_11_9() {
        System.out.println("Вывод 20 случайных значений в 1 строку");
        System.out.println("Если число делится на 3 без остатка, выводится (#ЧИСЛО)");
        for (int i = 1; i < 20; i++) {
            int num = rnd.nextInt(27, 73);
            if (num % 3 == 0) {
                System.out.print("#" + num + " ");
            } else {
                System.out.print(num + " ");
            }
        }
    }

    public static void zadanie_11_10() {
        System.out.println("19 случайных однозначных чисел");
        System.out.println("0 в окружении %");
        for (int i = 1; i < 20; i++) {
            int num = rnd.nextInt(0, 9);
            if (num == 0) {
                System.out.print("%" + num + "% ");
            } else {
                System.out.print(num + " ");
            }
        }
    }

    public static void zadanie_11_11() {
        System.out.println("11 положительных двухзначных случайных чисел");
        System.out.println("------");
        for (int i = 1; i < 12; i++) {
            int number = rnd.nextInt(10, 99);
            int num = number / 10;
            int num2 = number % 10;
            if (number % 5 == 0) {
                System.out.print(number + "(" + (num + num2) + ") ");
            } else {
                System.out.print(number + "[" + num * num2 + "] ");
            }

        }
    }

    public static void zadanie_11_12() {
        System.out.println("Вывод на экран положительных двухзначных чисел");
        System.out.println("Старт ");
        for (int i = 9; i < 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("Финиш");
    }

    public static void zadanie_11_13() {
        System.out.println("Вывод всех трехзначных чисел на экран");
        System.out.println("Начало");
        for (int i = 999; i > 99; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Завершено");
    }

    public static void zadanie_11_14() {
        System.out.println("От");
        for (int i = 0; i < 10; i++) {
            System.out.print("," + i);
        }
        System.out.println("и до");
    }

    public static void zadanie_11_15() {
        System.out.println("Простой вывод чисел");
        for (int i = 10; i < 100; i++) {
            System.out.print(i + "_");
        }
        System.out.println("Сообщение!");
    }

    public static void zadanie_11_16() {
        System.out.println("Простой вывод двухзначных чисел");
        for (int i = 10; i < 99; i++) {

            if (i % 4 == 0) {
                System.out.print("#" + i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println("Сообщение");
    }

    public static void zadanie_11_17() {
        System.out.println("Положительные трехзначные числа оканчивающиеся на 7");
        for (int i = 107; i < 997; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println("Сообщений!");
    }

    public static void zadanie_11_18() {
        System.out.println("Четырех значные числа с окончанием 00");
        for (int i = 1000; i < 10000; i += 100) {
            System.out.print(i + " ");
        }
        System.out.println("Сообщение!");
    }

    public static void zadanie_11_19() {
        System.out.println("Двузначные числа делящиеся на 5");
        for (int i = 100; i > 9; i--) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void zadanie_11_20() {
        System.out.println("Трехзначные числа делящиеся на 80 с остатком 45");
        for (int i = 99; i < 999; i++) {
            if (i % 80 == 45) {
                System.out.print(i + " ");
            }
        }
        System.out.println("Конец цикла for");
    }

    public static void zadanie_11_21() {
        System.out.println("Числовые хитрости");
        int x = rnd.nextInt(1, 999);
        for (int i = 1; i < 17; i++) {
            x += 1;
            System.out.print((x) + " ");
        }
        System.out.println("Сообщение");
    }

    public static void zadanie_11_22() {
        System.out.println("Числовые хитрости");
        int x = rnd.nextInt(1, 999);
        x -= 10;
        for (int i = 1; i < 17; i++) {
            System.out.print((x) + " ");
            x -= 6;
        }
        System.out.println("Сообщение");
    }

    public static void zadanie_11_23() {
        System.out.println("Магия чисел");
        int x = rnd.nextInt(9, 999);
        for (int i = 7; i < x; i += 4) {
            System.out.print(i + " ");
        }
        System.out.println("Конец цикла");
    }

    public static void zadanie_11_24() {
        int x = rnd.nextInt(1, 99);
        for (int i = 0; i < 2; i++) {
            x -= 8;
            System.out.println(x);
        }
    }

    public static void zadanie_11_25() {
        int x = rnd.nextInt(1, 99);
        for (int i = 0; i < x; i++) {
            System.out.println(i + " ");
        }
    }

    public static void zadanie_11_26() {
        int x = rnd.nextInt(-10, 999);
        if (x < 0)
            x = -x;
        System.out.println("От ");
        for (int i = 0; i < x; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" и до");

    }

    public static void zadanie_11_27() {
        System.out.println("################");
        int num = rnd.nextInt(10, 198);
        System.out.println("-->" + num);
        for (int i = 10; i < 99; i++) {
            for (int x = 10; x < 99; x++) {
                if (x + i == num) {
                    System.out.println("x-->" + x + " i-->" + i);
                }
            }
        }

    }

    public static void zadanie_11_28() {
        System.out.println("################");
        int num = rnd.nextInt(100, 999);
        System.out.println("-->" + num);
        for (int i = 100; i < 999; i++) {
            for (int x = 100; x < 999; x++) {
                if (x + i == num) {
                    System.out.println("x-->" + x + " i-->" + i);
                }
            }
        }
    }

    public static void zadanie_11_29() {
        System.out.println("---###---");
        int number = rnd.nextInt(1, 999);
        int num = number % 10;
        System.out.println(number + " Последняя цифра --->" + num);
        for (int i = 0; i <= 9; i++) {
            for (int x = 0; x <= 9; x++) {
                for (int y = 0; y <= 9; y++) {
                    if (y == num) {
                        System.out.print(i + "" + x + "" + y + " ");
                    }
                }
            }
        }
    }

    public static void zadanie_11_30() {
        System.out.println();
        int number = rnd.nextInt(1,99);
        for(int x = 0;x<=9;x++){
            for(int y = 0;y<=9;y++){
                if(x*y<number){
                    System.out.print("-->"+x+""+y+" ");
                }
            }
        }
    }
     public static void zadanie_11_31(){
        System.out.println("==============");
        for (int i = 7;i<=100;i+=10){
            System.out.print("-->"+i);
        }
     }
     public static void zadanie_11_32(){
         System.out.println("==============");
         for (int i = 97;i>=7;i-=10){
             System.out.print("-->"+i);
         }
     }
    public static void zadanie_11_33(){
        System.out.println("Числа которые делятся на 11 без остатка");
        for(int i = 0;i<999;i++){
            if(i%11==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void zadanie_11_34(){
        System.out.println("18 чисел после старта");
        int number = rnd.nextInt(0,999);
        System.out.println("Старт с числа -->"+number);
        for(int i = 1;i<=18;i++){
            number+=1;
            System.out.print("("+i+")"+"-->"+number);
        }
    }
    public static void zadanie_11_35(){
        System.out.println("25 нечетных после старта");
        int num = rnd.nextInt(1,999);
        int count = 0;
        System.out.println("Старт после числа-->"+num);
       for(int i = 1;i<=99;i++){
            num++;
            if(num%2!=0){
                count++;
                System.out.print(count+"__"+num+" --> ");
                if(count==25){
                    break;
                }
            }
        }
    }
    public static void zadanie_11_36(){
        System.out.println("10 предшествующих чисел");
        int num = rnd.nextInt(1,999);
        System.out.println("Старт с числа-->"+num);
        for (int i = 0;i<10;i++){
            num-=6;
            System.out.print(num+" ");
        }
    }
    public static void zadanie_11_37(){
        System.out.println("20 случайных чисел");
        for(int i = 1;i<=20;i++){
            int num = rnd.nextInt(-18,18);
            if(num<0){
                System.out.println(num+" "+Math.pow(num,2));
            }else {
                System.out.println(num+" "+Math.round(Math.sqrt(num)));
            }
        }
    }
    public static void zadanie_11_38(){
        System.out.println("15 случайных трехзначных чисел");
        System.out.print("Введите число-->");
        int enter_num = scn.nextInt();
        for(int i = 0;i<15;i++){
            int number = rnd.nextInt(100,999);
                if(number%enter_num==0){
                    int num = number/100;
                    int num2 = number%100;
                    System.out.println(number+"---"+num+"-->"+num2);
                }
        }
    }
}


