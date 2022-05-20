package Razdel12;

import javax.swing.*;
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
    public static void zadanie_12_11(){
       System.out.println("Опросник для учеников, кто готов поехать на экскурсию" +
               "всего 200 учеников. программа генерирует рандомные ответы готов и ли не готов");
       int ready_counter = 0;
       int notReady_counter = 0;
       for(int i = 1;i<=200;i++){
           int rand = rnd.nextInt(0,2);
           if(rand == 1){
               ready_counter++;
           }
           if(rand == 0){
               notReady_counter++;
           }
       }
        System.out.println("На экскурсию готов поехать "+ready_counter+" ученик");
        System.out.println("Не готовы к поездке "+notReady_counter+" учеников");
    }
    public static void zadanie_12_12(){
       System.out.println("Генерируем случайную дату рождения для 1234 человек. Далее подсчет сколько " +
               "Человек родилось в какое время года");
       int summer = 0;
       int autumn = 0;
       int winter = 0;
       int spring = 0;
       int age = 2022;

       for(int i=1;i<=1234;i++){
           int date = rnd.nextInt(1,29);
           int month = rnd.nextInt(1,12);
           int year = rnd.nextInt(1945,2022);
           if(month == 12 || month==1 || month == 2){
               winter++;
           }
           if(month == 3 || month==4 || month == 5){
               spring++;
           }
           if(month == 6 || month==7 || month == 8){
               summer++;
           }
           if(month == 9 || month==10 || month == 11){
               autumn++;
           }
           System.out.println(i+"# "+date+"."+month+"."+year+"-- возраст: "+(age-year)+" лет");
       }
        System.out.println("Зимой родилось "+winter+" человек");
        System.out.println("Весной родилось "+spring+" человек");
        System.out.println("Летом родилось "+summer+" человек");
        System.out.println("Осенью родилось "+autumn+" человек");
    }
    public static void zadanie_12_13(){
       System.out.println("Имитация подбрасывания монетки (Орел или Решка)" +
               "10,100 и 1000 раз.");
       int orel = 0;
       int resh = 0;

       for(int i = 1;i<=10;i++){
           int brosok = rnd.nextInt(0,2);
           if (brosok == 1){
               orel++;
           }else
               resh++;
       }
       System.out.println("Результаты подбрасывания 10");
       System.out.println("Орел->"+orel+" Решка->"+resh);
       System.out.println("-----------------------------");
        for(int i = 1;i<=100;i++){
            int brosok = rnd.nextInt(0,2);
            if (brosok == 1){
                orel++;
            }else
                resh++;
        }
        System.out.println("Результаты подбрасывания 100");
        System.out.println("Орел->"+orel+" Решка->"+resh);
        System.out.println("-----------------------------");
        for(int i = 1;i<=1000;i++){
            int brosok = rnd.nextInt(0,2);
            if (brosok == 1){
                orel++;
            }else
                resh++;
        }
        System.out.println("Результаты подбрасывания 1000");
        System.out.println("Орел->"+orel+" Решка->"+resh);
        System.out.println("-----------------------------");
    }
    public static void zadanie_12_14(){
       System.out.println("Серия чисел называется уравновешенной если количество положительных" +
               "и отрицательных чисел одинаково. Генерация 30 случайных");
       int plus = 0;
       int minus = 0;
       for (int i = 1;i<=30;i++){
           int number = rnd.nextInt(-20,20);

           if(number<0){
               minus++;
           } else
               plus++;
           System.out.print(number+" ");
       }
       System.out.println("Положительных чисел--"+plus+" Отрицательных--"+minus);
       if(plus==minus){
           System.out.println("Числовой ряд является уравновешанным");
       } else
           System.out.println("Числовой ряд не уравновешен");
    }
    public static void zadanie_12_15(){
       System.out.println("Принимает число Х и выводит все его делители");
       System.out.print("Введите число__");
       int number = read.nextInt();
       for (int i=1;i<number;i++){
           if(number%i==0){
               System.out.println(i+" ");
           }
       }
    }
    public static void zadanie_12_16(){
       System.out.println("Проверка простых чисел");
        System.out.print("Введите число__");
        int number = read.nextInt();
        for (int i=1;i<number;i++){
            if(number%i==0){
                System.out.println("Число не простое");
            }else
                System.out.println("Это простое число");
        }
    }
    public static void zadanie_12_17(){
       System.out.println("Число называют родственным если у них есть одинаковое количество делителей");
        int number1 = rnd.nextInt(1,100);
        int number2 = rnd.nextInt(1,100);
        int counter1 = 0;
        int counter2 = 0;
        for (int i=1;i<number1;i++){
            if(number1%i==0){
                counter1++;
            }
        }
        for (int i = 1;i<number2;i++){
            if(number2%i == 0){
                counter2++;
            }
        }
        System.out.print(counter1+"==="+counter2);
    }
    public static void zadanie_12_18(){
       System.out.println("Степень родства двух целых чисел количество их общих делителей");
       System.out.print("Первое число--> ");
       int number1 = read.nextInt();
       System.out.print("Второе число-->");
       int number2 = read.nextInt();
       int count = 0;
       int tmp;
       if (number1>number2){
           tmp=number1;
       }else
           tmp=number2;
       for(int i = 1;i<=tmp/2;i++){
           if (number1%i==0 && number2%i==0){
               count++;
           }
       }
       System.out.print("-->"+count);
    }
    public static void zadanie_12_19(){
       System.out.println("15 точек на плоскости окружности");
       System.out.println("-Центр окружности (два действительных числа");
       System.out.println("--Радиус окружности");
       System.out.println("---15 пар координат на плоскости");
       System.out.println("==============================================");
       System.out.println("                Центр окружности");
       System.out.println("===============================================");
       System.out.print("Введите Х-->");
       double x = read.nextDouble();
       System.out.print("Введите У-->");
       double y = read.nextDouble();
       System.out.print("Введите радиус окружности-->");
       double R = read.nextDouble();
       double D = R*2;
       int counter = 0;
       System.out.println("=================================================");
       for(int i=1;i<=15;i++){
           double dotX = Math.round(rnd.nextDouble(-25,25)*100.0)/100.0;
           double dotY = Math.round(rnd.nextDouble(-25,25)*100.0)/100.0;
           System.out.println("Точка ("+i+"): {"+dotX+";"+dotY+"}");
           double leftSide = Math.pow(x-dotX,2)+Math.pow(y-dotY,2);
           if(leftSide<=Math.pow(R,2)){
               System.out.println("Точка находится в окружности");
               counter++;
           }else
               System.out.println("Точка за приделами окружности");
           System.out.println("------------------------------------------------");
       }
       System.out.println("==================================================");
       System.out.println("В окружность попало "+counter+" точек из 15");
    }
}
