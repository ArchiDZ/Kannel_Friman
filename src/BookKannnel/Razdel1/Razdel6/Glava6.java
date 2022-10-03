package BookKannnel.Razdel1.Razdel6;

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
     public static void zadanie_6_5(){
         System.out.print("Введите целое число-->");
         int num = input.nextInt();
         if(num==0){
             System.out.println("Ноль");
         }
     }
     public static void zadanie_6_6(){
         System.out.print("Введите число--> ");
         int num = input.nextInt();
         if(num>0)
             System.out.println("Число положительное");
         if (num<0)
             System.out.println("Число отрицательное");
         if (num == 0)
             System.out.println("Ноль");
     }
     public static void zadanie_6_7(){
         int num = input.nextInt();
         if(num>99)
             num--;
         System.out.println(num);
     }
     public static void zadanie_6_8(){
         System.out.println(" Введите 2 числа");
         System.out.print(" Первое число-->\n");
         int num1 = input.nextInt();
         System.out.print("Второе число-->");
         int num2 = input.nextInt();
         if(num1>num2){
             num1+=num2;
             System.out.println(num1);
         }
         if(num1<num2){
             num2*=num1;
             System.out.println(num2);
         }
         if(num1 == num2)
             System.out.println("Числа равны");
     }
     public static void zadanie_6_9(){
         System.out.print("Введите трехзначное число-->");
         int num = input.nextInt();
         if (num>99){
             int number1 = num/100;
             int number2 = (num%100)/10;
             int number3 = num%10;
             if (number1%2==0)
                 if(number2%2==0)
                     if (number3%2==0)
                         System.out.println("Четно-Красивое число");
                     else System.out.println("Не является четно красивым числом");
         }if(num>999)
             System.out.println("Число слишком большое");
     }
     public static void zadanie_6_10(){
         System.out.print("Введите двухзначное число-->");
         int num = input.nextInt();
         if(num>99){
             System.out.println("Число не двухзначное");
         }
         if(num<=0){
             System.out.println("Число отрицательное или равно нулю");
         }
         int number1 = num/10;
         int number2 = num%10;
         System.out.println(number1+" "+number2);
         int result = number1*number2;
         if (num>result){
             System.out.println("Введеное число больше чем произведения цифр числа");
         }else
             System.out.println("Произведение больше числа");
     }
     public static void zadanie_6_11(){}// Условия задачи не совсем понятны.
                                        // Что конкретно требуется
    public static void zadanie_6_12(){
         System.out.println("Определение есть ли у уровнения хотябы 1 корень");
         System.out.println("Введите 3 числа");
         System.out.print("Первое число-->");
         int a = input.nextInt();
         System.out.println();
         System.out.print("Второе число-->");
         int b = input.nextInt();
         System.out.println();
         System.out.print("Третье число-->");
         int c = input.nextInt();
         int d = b*b-4*a*c;
         if (d<0)
             System.out.println("Да");
         else
             System.out.println("Нет");
    }
    public static void zadanie_6_13(){
         System.out.println("проверка дроби");
         System.out.println("Введите числитель");
         int chisl = input.nextInt();
         System.out.println("Введите знаменатель");
         int znam = input.nextInt();
         if(chisl<znam)
             System.out.println("Правильная дробь");
         else
             System.out.println("Дробь не правильная");
    }
    public static void zadanie_6_14(){
        System.out.println("Введите числитель");
        int chisl = input.nextInt();
        System.out.println("Введите знаменатель");
        int znam = input.nextInt();
        if(chisl*znam>0)
            System.out.println("Положительная");
        else
            System.out.println("Отрицательная");
    }

}
