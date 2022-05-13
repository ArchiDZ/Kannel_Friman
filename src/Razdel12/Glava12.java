package Razdel12;

import java.util.Random;
import java.util.Scanner;

public class Glava12 {
   static Random rnd = new Random();
   static Scanner read = new Scanner(System.in);

   public static void zadanie_12_1(){
       System.out.println("Счет положительных чисел");
       int count = 0;
       for (int i=0;i<10;i++){
           int num = rnd.nextInt(-10,10);
           if(num>0){
                count++;
           }
           System.out.print(num+" ");
       }
       System.out.println("Положительных чисел в ряде было-->"+count);
   }
   public static void zadanie_12_2(){
       System.out.println("Счет четных и нечетных чисел");
       int count = 0;
       int count_nech = 0;
       for (int i=0;i<17;i++){
           int num = rnd.nextInt(1,1000);
           if(num%2==0){
               count++;
           }else{
               count_nech++;
           }
           System.out.print(num+" ");
       }
       System.out.println("Четных чисел было в ряде-->"+count);
       System.out.println("НЕчетных чисел было в ряде-->"+count_nech);
   }
   public static void zadanie_12_3(){
       System.out.println("Принимает 12 чисел и сообщаеет сколько чисел было больше первого");
       int counter = 0;
       System.out.print("Введите первое число-->");
       int num1 = read.nextInt();
       for (int i = 1;i<=12;i++){
           System.out.print("-->");
           int number = read.nextInt();
           if(num1<number){
               counter++;
           }
       }
       System.out.println("Больше первого числа было "+counter+" чисел");
   }
   public static void zadanie_12_4(){
       System.out.println("Принимает 17 чисел и подсчитывает сколько было чисел больше предыдущего");

       int counter = 0;
      // System.out.print("-->");
       //int number = read.nextInt();
       for (int i = 1;i<=17;i++){
           int tmp = 0;
           System.out.print("_>");
           int num = read.nextInt();
           if(tmp>num){

               counter++;
           }
           num = tmp;
           //int x = tmp;

           System.out.println("tmp-"+tmp+" num-"+num );
       }
       System.out.print("total: "+counter);

       // !!!задача не решена!!!
   }

   public static void zadanie_12_5(){
       System.out.println("Генерация 15 случайных чисел и статистика по ним");
       int plusCounter = 0;
       int chetCounter = 0;
       int oneNumCounter = 0;
       for (int i = 0;i<=15;i++){
           int number = rnd.nextInt(-25,25);
           if (number>0){
               plusCounter++;
           }
           if (number%2==0){
               chetCounter++;
           }
           if(number>-10 && number<10){
               oneNumCounter++;
           }
           System.out.print(number+" ");
       }
       System.out.println();
       System.out.println("Положительных чисел -->"+plusCounter);
       System.out.println("Четных чисел -->"+chetCounter);
       System.out.println("Однозначных чисел -->"+oneNumCounter);
   }
    public static void zadanie_12_6(){
       System.out.println("Проверка целого числа на какое количество двух значных чисел оно делится");
       int counter = 0;
       System.out.print("Введите число для проверки-->");
       int number = read.nextInt();
       for(int i = 10;i<=99;i++){
           if(number%i==0){
               counter++;
           }
       }
       System.out.println("Число "+number+" делится на "+counter+" чисел");
    }
    public static void zadanie_12_7(){
       System.out.println("Сравнение 1 введеного числа с 29 случайными" +
               "Числа в диапозоне от 1 до 100 без проверки");
       int biggerCount = 0;
       int smaller = 0;
       int equalCounter = 0;
       System.out.print("Введите число-->");
       int keyboard_num = read.nextInt();
       for(int i = 1;i<=30;i++){
           int rnd_num = rnd.nextInt(1,100);
           if(rnd_num>keyboard_num){
               biggerCount++;
           }
           if(rnd_num<keyboard_num){
               smaller++;
           }
           if(rnd_num==keyboard_num){
               equalCounter++;
           }
           System.out.print(rnd_num+" ");
       }
       System.out.println();
       System.out.println(" Числа которые больше: "+biggerCount);
        System.out.println("Числа которые меньше: "+smaller);
        System.out.println("Числа которые равны: "+equalCounter);
    }
    public static void zadanie_12_8(){
       System.out.println("Выводит все целые положительные двухзначные числа," +
               "в которых разница между первой и последней цифрой не превышает 3");
       for(int i = 10;i<=99;i++){
           int num1 = i/10;
           int num2 = i%10;
           int s = num1-num2;
           int s1 = num2-num1;

           if(s<=3 && s1<=3){
               System.out.print(" "+i);
           }
       }
    }
    public static void zadanie_12_9(){
       System.out.println("Крвсивое число: сумма квадратов первой и последней цифр равно квадрату средней");
       int counter = 0;
       for(int i = 100;i<=999;i++){
           int num1 = i/100;
           int num2 = (i/10)%10;
           int num3 = i%10;
           if(Math.pow(num1,2)+Math.pow(num3,2)==Math.pow(num2,2)){
               System.out.println(i+" ");
                counter++;
           }
       }
       System.out.println("Всего красивых чисел "+counter);
    }
    public static void zadanie_12_10(){
       System.out.println("Контрольная считается провальной если более половины получили " +
               "неудовлетворительные оценки");
       int couter = 0;
       for(int i = 1;i<=30;i++){
           int mark = rnd.nextInt(1,5);
           System.out.print(mark+" ");
           if(mark<=3){
               couter++;
           }
       }
       if(couter>15){
           System.out.println("Контрольная провалена ");
           System.out.println("Неудовлетворительных оценок "+couter);
       }
       if (couter<15){
           System.out.println("Контрольная прошла успешно");
           System.out.println("Неудовлетворительных оценок "+couter);
       }
    }
}
