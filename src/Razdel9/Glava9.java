package Razdel9;

import java.util.Random;
import java.util.Scanner;

public class Glava9 {
static Random rnd = new Random();
static Scanner input = new Scanner(System.in);

   public void zadanie_9_1(int a, int b) {
       boolean z = a > 10 && b > 100;
       System.out.println(z);


       //задача 9.1
       /*Дано (a>10&&b>100)
        * a---b---result
        * 20---231---true
        * 6---131---false
        * 28---87---false
        * 10---10---false
        * 10---31---false
        * */
   }
   public void zadanie_9_2(int a, int b){
       boolean z = a > 10 || b > 100;
       System.out.println(z);
       /*Дано (a>10||b>100)
        * a---b---result
        * 20---31---true
        * 6---100---false
        * 28---8---true
        * 10---10---false
        * 10---1---false
        * */
   }

   public static void  zadanie_9_4(){
       int number = rnd.nextInt(40,100);
       System.out.println("-->"+number);
       System.out.println("1...==============");
       if(number>=40||number<=100){
           System.out.println("Да");
       }else System.out.println("Нет");
       System.out.println("2...==============");
       if (number>=40&&number<=100)
           System.out.println("Да");
       else  System.out.println("Нет");
       System.out.println("3...==============");
       if(number<40&&number>100)
           System.out.println("Нет");
       else System.out.println("Да");
       System.out.println("4...==============");
       if (number>39&&number<101)
           System.out.println("Да");
       else System.out.println("Нет");
   }
   public static void zadanie_9_5(){
       System.out.println("   |_____________|");
       System.out.println("(6)|-16--17--18--|");
       System.out.println("(5)|-13--14--15--|");
       System.out.println("(4)|-10--11--12--|");
       System.out.println("(3)|--7---8---9--|");
       System.out.println("(2)|--4---5---6--|");
       System.out.println("(1)|--1---2---3--|");

       System.out.println("Введите номер квартиры");
       System.out.print("--->");
       int num = input.nextInt();
        if (num%3==0){
            int x = num%3;
            System.out.println("Крайняя квартира с права на этаже"+x);
        }

   }

   public static void zadanie_9_6(){
       System.out.println("Проверка длин для треугольника");
       System.out.print("(1)-->");
       int a = input.nextInt();
       System.out.print("(2)-->");
       int b = input.nextInt();
       System.out.print("(3)-->");
       int c = input.nextInt();
       if((a+b)>c && (a+c)>b && (b+c)>a){
           System.out.println("---ДА---");
       }else {
           System.out.println("---НЕТ---");
       }
   }
   public static void zadanie_9_7(){
       System.out.println("Проверка треугольника по 2 углам");
       System.out.println("...Введите 2 Значения...");
       System.out.print("(1)--->");
       int a = input.nextInt();
       System.out.print("(2)--->");
       int b = input.nextInt();
       if (a<90 && b<90)
       {
           System.out.println("Данный треугольник острый ");
       }
       if (a==90 || b==90){
           System.out.println("Прямоугольный треугольник");
       }
   }

}
