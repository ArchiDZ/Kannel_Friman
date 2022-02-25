package Razdel6;

import java.util.Random;
import java.util.Scanner;

public class Glava6 {
    static Scanner input = new Scanner(System.in);
     static Random rnd = new Random();

     public static void zadanie_6_1(){
         int x = input.nextInt();
         int y = input.nextInt();
         if (x<y)
             System.out.println("Х меньше У");
         if (x==y)
             System.out.println("Х раввен У");
         if (x>y)
             System.out.println("Х больше У");
         // 1.Х меньше У
         //2.Х раввен У
         //3.Х больше У
         //4.x=2  y=1
         //5.x=3 y=6
         //6.x=2 y=7
     }
     public static void zadanie_6_2(){
         System.out.println("Введите любое число-->");
         double num = input.nextDouble();
         if (num>0)
             System.out.println("Положительное число");
         System.out.println("Завершено");
         //1.Выведет на экран сообщение "Число положительное"
         //2.Выведет на экран сообщение "Завершено"
         //3.Выведет на экран сообщение "Завершено"
         //4.Значение --> 2
         //5.Значение --> 0 или любое отрицательное число
         //6. Область видимости
         //7.Закрыть их в блок из { }
     }
     public static void zadanie_6_3(){
         System.out.println("Введите свой возраст ");
         int age = input.nextInt();
         if(age>=18)
             System.out.println("Можешь участвовать в выборах");
         //1.Ничего,программ предусматривает только наличае возраст от 18
         //2.Сообщение-->Можешь участвовать в выборах
         //3.Сообщение-->Можешь участвовать в выборах
         //4.20
         //5.17
         //6.else System.out.println("НЕможешь участвовать в выборах");
     }
     public static void zadanie_6_4(){
         System.out.print("Введите любое целое число-->");
         int num = input.nextInt();
         if (num>0){
             System.out.println("Число положительное");
             num*=2;
             System.out.println("Новое значение-->"+num);
         }else
             System.out.println("Введеное число отрицательное или равно 0");
     }

}
