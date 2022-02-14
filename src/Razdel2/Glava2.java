package Razdel2;

/*
* Задания из главы 2 с Задание 2.1 по Задание 2.4*/

import java.util.Scanner;

public class Glava2 {

    static Scanner reader = new Scanner(System.in);

    public static void zadanie_2_1(){
        System.out.println("Hello,world");
    }
    public static void zadanie_2_2(){
        System.out.println("H-e-l-l-o-,-f-r-i-e-n-d!");
    }
    public static void zadanie_2_3(){
        System.out.println("+++");
        System.out.println("!!!!");
        System.out.println("??");
    }
    public static void zadanie_2_4(){
        System.out.println("+++!!!!??");
    }

    public static void zadanie_2_5(){
        System.out.println("Введите целое число");
        int a = reader.nextInt();
        System.out.println("aa= "+a+a);
        System.out.println("a10= "+(a)+10);
    }

    public static void zadanie_2_6(){
        System.out.println("Введите целое число");
        int a = reader.nextInt();
        System.out.println(" "+(a));
        System.out.println(" "+(a+1));
        System.out.println(" "+(a-2));
    }
    public static void zadanie_2_7(){
        int a = reader.nextInt();
        System.out.println(a-10);
    }
    public static void zadanie_2_8(){
        System.out.print("Введите значение: ");
        int x = reader.nextInt();
        System.out.println("Значение х: "+x);
        System.out.println("Значение х в квадрате: "+(x*x));
        System.out.print("Значение х в кубе: "+(x*x*x));
    }
    public static void zadanie_2_9(){
        int x = 9;
        System.out.println("Значение х: "+x);
        System.out.println("Значение х в квадрате: "+(x*x));
        System.out.print("Значение х в кубе: "+(x*x*x));
    }
    public static void zadanie_2_10(){
        int x = 12;
        int y = 359;
        System.out.println("Значение Х:"+x+" Значение У:"+y);
        System.out.println("Проихведение Х и У: "+x*y);
        System.out.println("Сумма Х и У: "+(x+y));
    }
    public static void zadanie_2_11(){
        System.out.println("************************");
        System.out.println("***Вася  Пупкин*********");
        System.out.println("***7-927-6492864********");
        System.out.println("************************");
    }
    public static void zadanie_2_12(){
        System.out.println("******");
        System.out.println(" **** ");
        System.out.println("  ** ");
        System.out.println("  * ");
        System.out.println("   *");
        System.out.println("  ** ");
        System.out.println(" **** ");
        System.out.println("******");
    }

}
