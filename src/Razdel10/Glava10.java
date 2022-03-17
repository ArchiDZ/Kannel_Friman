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
    public static void zadanie_10_7(){
    System.out.println("Генеразия случайного отрезка");
    int dot1,dot2,dot3;
    int num1 = rnd.nextInt(10,99);
    int num2 = rnd.nextInt(10,99);
    if (num1<num2){
        dot1 = rnd.nextInt(num1,num2);
        dot2 = rnd.nextInt(num1,num2);
        dot3 = rnd.nextInt(num1,num2);
        System.out.println("На отрезке от "+num1+" до "+num2);
        System.out.println("Существует три точки-->"+dot1+"-->"+dot2+"-->"+dot3);
    } else if(num1>num2){
        dot1 = rnd.nextInt(num2,num1);
        dot2 = rnd.nextInt(num2,num1);
        dot3 = rnd.nextInt(num2,num1);
        System.out.println("На отрезке от "+num2+" до "+num1);
        System.out.println("Существует три точки-->"+dot1+"-->"+dot2+"-->"+dot3);
    }
    }
    public static void zadanie_10_8(){
        System.out.println("Угадайка");
        //int x = rnd.nextInt(0,11);
        int x = input.nextInt();
        System.out.println("-->"+x);
        System.out.println("Было загадано число от 1 до 10");
        System.out.println("Попробуй угадай___");
        while (true){
            //int num = input.nextInt();
            int num = rnd.nextInt(0,11);
            if(num>x){
                System.out.println("Не угадал твое число больше загаданного");
            }
            if(num<x){
                System.out.println("Не угадал твое число меньше загаданного");
            }
            if(num==x){
                System.out.println("Верно! Отгадал,а ты молодец");
                break;
            }
        }
    }
    public static void zadanie_10_9(){
        System.out.println("Угадайка");
        int x = rnd.nextInt(0,11);
        System.out.println("-->"+x);
        System.out.println("Было загадано число от 1 до 10");
        System.out.println("Попробуй угадай___");
        while (true){
            int num = rnd.nextInt(0,11);
            if(num>x){
                System.out.println("Не угадал твое число больше загаданного");
            }
            if(num<x){
                System.out.println("Не угадал твое число меньше загаданного");
            }
            if(num==x){
                System.out.println("Верно! Отгадал,а ты молодец");
                break;
            }
        }
    }
    public static void zadanie_10_10(){
        /*
        * Задача полностью идентична с задачей 10_9
        * */
    }
    public static void zadanie_10_11(){
        System.out.println("Прототип игры в блэк джэк");
        int card1 = rnd.nextInt(2,11);
        int card2 = rnd.nextInt(2,11);
        int card3 = rnd.nextInt(2,11);
        System.out.println("-->"+card1+"-->"+card2+"-->"+card3);
        int summ = card1+card2+card3;
        if (summ>21){
            System.out.println("Проигрышь, перебор");
        }
        if (summ<21){
            System.out.println("Проигрышь, недобор");
        }
        if(summ==21){
            System.out.println("Победа!");
        }
    }
    public static void zadanie_10_12(){
        System.out.println("Прототип игры в блэк джэк версия 2");
        int card1 = rnd.nextInt(2,11);
        int card2 = rnd.nextInt(2,11);
        int card3 = rnd.nextInt(2,11);
        int choice;
        System.out.println("-->"+card1+"-->"+card2+"-->"+card3);
        int summ = card1+card2+card3;
        if (summ>21){
            System.out.println("Проигрышь, перебор");
        }
        if (summ<21){
            System.out.println("Не добор, желаете еще 1 карту");
            choice = input.nextInt();
            if(choice==1){
                int card4 = rnd.nextInt(2,11);
                summ=+card4;
                if(summ==21){
                    System.out.println("Победа");
                }else System.out.println("Проигрышь");
            }
        }
        if(summ==21){
            System.out.println("Победа");
        }
    } //Не самый удачный вариант***Ё

    public static void zadanie_10_13(){
        System.out.println("Игра в кости");
        int player1;

    }

}
