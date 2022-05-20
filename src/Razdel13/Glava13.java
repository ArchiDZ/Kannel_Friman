package Razdel13;

import Tools.Delimetr;
import Tools.Tool1;

import java.util.Random;
import java.util.Scanner;

public class Glava13 {
    static Random rnd = new Random();
    static Scanner scn = new Scanner(System.in);

    public static void zadanie_13_1() {
        int s1 = 0;
        int s2 = 0;
        for (int i = 1; i < 7; i++) {
            int x = scn.nextInt();
            if (x % 2 == 0) {
                s1 = s1 + x;
            }
            if (x % 3 == 0) {
                s2 = s2 + x;
            }
        }
        System.out.println("s1-->" + s1);
        System.out.println("s2-->" + s2);
    }

    public static void zadanie_13_2() {
        System.out.println("Генерация серии 20 случайных чисел от 10 до 100 и сумма серии");
        Delimetr.deleq(75);
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            int number = rnd.nextInt(10, 100);
            System.out.print(number + " ");
            sum += number;
        }
        Delimetr.delmin(75);
        System.out.println("Сумма серии-->" + sum);
    }

    public static void zadanie_13_3() {
        String s = "Генерация серии 20 случайных чисел от 0 до 100 и сумма четных значений в серии";
        System.out.println(s);
        Delimetr.deleq(s.length());
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            int number = rnd.nextInt(0, 100);
            System.out.print(number + " ");
            if (number % 2 == 0) {
                sum += number;
            }
        }
        Delimetr.delmin(s.length());
        System.out.println("Сумма четных значений в серии-->" + sum);
    }

    public static void zadanie_13_4() {
        String head = "Программа получает положительное целое число и выводит все его делители " +
                "и сумму его делителей";
        System.out.println(head);
        Delimetr.deleq(head.length());
        System.out.print("Введите число-->");
        int number = scn.nextInt();
        int counter = 0;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
                sum += i;
                System.out.print(i + " ");
            }
        }
        Delimetr.delmin(head.length());
        System.out.println("У числа " + counter + " делителей");
        System.out.println("Сумма делителей-->" + sum);
    }

    public static void zadanie_13_5() {
        String head = "База числа Х это сумма всех положительных целых чисел, меньше чем Х";
        System.out.println(head);
        Delimetr.deleq(head.length());
        System.out.print("Введите число-->");
        int number = scn.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        Delimetr.delmin(head.length());
        System.out.println("База числа-->" + sum);
    }

    public static void zadanie_13_6() {
        String head = "Удивительное число это число сумма делитетелей которого равна самому числу";
        System.out.println(head);
        Delimetr.deleq(head.length());
        int sum = 0;
        for (int n = 1; n <= 100; n++) {
            sum = 0;
            System.out.print(n + "# ");
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                    sum += i;

                    if (sum == n) {
                        System.out.print("--Удивительное число");
                    }
                }
            }
            System.out.print(" --общая сумма делителей " + sum);
            Delimetr.delmin(head.length());
        }
    }

    public static void zadanie_13_7() {
        String head = "Дважды четное число это четное число и четная сумма всех его делителей";
        System.out.println(head);
        Delimetr.deleq(head.length());
        System.out.print("Введите четное число-->");
        int number = scn.nextInt();
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        Delimetr.delmin(head.length());
        System.out.println("Сумма делителей-->" + sum);
        if (sum % 2 == 0) {
            System.out.println("Дважды четное число");
        }
    }

    public static void zadanie_13_8() {
        String head = "Дважды делимое число если оно и сумма делителей делятся без остатка на ко-во делителей";
        System.out.println(head);
        Delimetr.deleq(head.length());
        System.out.print("Введите число-->");
        int number = scn.nextInt();
        int counter = 0;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                counter++;
                sum += i;
                System.out.print(i + " ");
            }
        }
        Delimetr.delmin(head.length());
        System.out.println("Количество делителей числа-->" + counter);
        System.out.println("Сумма делителей-->" + sum);
        if (number % counter == 0 && sum % counter == 0) {
            System.out.println("Дважды делимое число");
        } else
            System.out.println("Число не является дважды делимым");
    }

    public static void zadanie_13_9() {
        String head = "Четно-близкими по сумме, те числа если сумма их общих делителей является четным числом";
        System.out.println(head);
        Delimetr.deleq(head.length());
        System.out.print("Введите первое число-->");
        int num1 = scn.nextInt();
        System.out.print("Введите второе число-->");
        int num2 = scn.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                sum1 += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("Сумма делителей-->" + sum1);
        Delimetr.delsharp(10);
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                sum2 += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("Сумма делителей-->" + sum2);
        Delimetr.deleq(head.length());
        if(sum1%2==0 && sum2%2==0){
            System.out.println("Четно близкие числа");
        }else
            System.out.println("Числа не близки друг другу");
    }
    public static void zadanie_13_10(){
        String head = "Степень близости, сумма их общих делителей";
        System.out.println(head);
        Delimetr.deleq(head.length());
        System.out.print("Введите первое число-->");
        int num1 = scn.nextInt();
        System.out.print("Введите второе число-->");
        int num2 = scn.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                sum1 += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("Сумма делителей-->" + sum1);
        Delimetr.delsharp(10);
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                sum2 += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("Сумма делителей-->" + sum2);
        Delimetr.deleq(head.length());
    }
    public static void zadanie_13_11(){
        String head = "Данные 50 измерений загрязнения в реке. Уровень загрязнения от 1 до 10";
        System.out.println(head);
        Delimetr.deleq(head.length());
        for(int i = 1; i<=50;i++){
            int day = rnd.nextInt(0,8);
            int lvl_waste = rnd.nextInt(0,11);
            if (lvl_waste>=7){
                System.out.println("("+i+")"+"День "+day+" ВНИМАНИЕ ОПАСНЫЙ УРОВЕНЬ ЗАГРЯЗНЕНИЯ!!! "+lvl_waste);
            }
            if (day==2 && lvl_waste<5){
                System.out.println("Спокойный вторник");
            }
        }
    }
    public static void zadanie_13_11_v2(){
        String head = "Данные 50 измерений загрязнения в реке. Уровень загрязнения от 1 до 10";
        System.out.println(head);
        Delimetr.deleq(head.length());
        for(int i = 1; i<=50;i++){
            int day = rnd.nextInt(0,8);
            int lvl_waste = rnd.nextInt(0,11);
            System.out.println("("+i+")");
            Tool1.week(day);
        }
// Не законченный выриант
    }
    public static void zadanie_13_12(){
    String head = "Оценки 30 учеников. Средняя оценка класса и число неудов в классе";
    System.out.println(head);
    Delimetr.deleq(head.length());
    int counter =0;
    double sum = 0;
    System.out.print("Введите кол-во учеников в классе-->");
    int people = scn.nextInt();
    for(int i = 1;i<=people;i++){
        int mark = rnd.nextInt(1,5);
        if (mark <3){
            counter++;
            sum+=mark;
        }
        System.out.print(mark+" ");
    }
    Delimetr.delmin(head.length());
    double avg = sum/people;
    System.out.println("Вклассе "+people+" человек");
    System.out.println("Средняя оценка в классе-->"+avg);
    System.out.println("кол-во неудов в классе-->"+counter);
    }
    public static void zadanie_13_13(){
        String head = "Оценки 30 учеников. Средняя оценка удовлетворительных оценок и средняя по неудам";
        System.out.println(head);
        Delimetr.deleq(head.length());
        int good_counter = 0;
        int bad_counter = 0;
        int gcount = 0;
        int bcount = 0;
        for(int i=1;i<=30;i++){
            int mark = rnd.nextInt(1,5);
            if(mark<3){
                System.out.print(mark+" ");
            bad_counter+=mark;
            bcount++;
            }
            if(mark>3){
                System.out.print(mark+" ");
                good_counter+=mark;
                gcount++;
            }
        }
        int bad_avg = bad_counter/bcount;
        int good_avg = good_counter/gcount;
        Delimetr.delmin(head.length());
        System.out.println(good_counter+"---"+bad_counter);
        System.out.println("Средняя оценка неудов-->"+bad_avg);
        System.out.println("Средняя значение удовлетворительных оценок-->"+good_avg);
    }
    public static void zadanie_13_14(){
        String str1 = "Школьная распродажа. На распродаже продавались билеты 2х видов.";
        String str2 = "1) обычный билет участника распродажи";
        String str3 = "2) билет с правом посещения концерта";
        String str4 = "Тот кто приобрел более 10 обычных билетов, получал еще 1 такойже";
        System.out.println(str1+"\n"+str2+"\n"+str3+"\n"+str4+"\n");
        Delimetr.deleq(str4.length());
        double price_simpleTicket = 25.0;
        double price_fullTicket = 55.0;
        int free_ticket = 0;
        int totalSimpleTicket = 0;
        int totalFullTicket = 0;

        for(int i=1;i<=200;i++){
            int simpleTicket = rnd.nextInt(0,100);
            int fullTiscket = rnd.nextInt(0,100);
        if(simpleTicket>=10){
            free_ticket++;
        }
        totalSimpleTicket+=simpleTicket;
        totalFullTicket+=fullTiscket;
        System.out.println("Участник ("+i+") купил");
        System.out.println("простых билетов--"+simpleTicket);
        System.out.println("полных билетов--"+fullTiscket);
        System.out.println("Заплатил "+((simpleTicket*price_simpleTicket)+(fullTiscket*price_fullTicket)));
        Delimetr.delmin(str4.length());
        }
        System.out.println("Всего было продано "+(totalFullTicket+totalSimpleTicket)+" билетов");
        System.out.println("простых билетов--"+totalSimpleTicket);
        System.out.println("полных билетов--"+totalFullTicket);
        System.out.println("Бесплатных билетов было выдано--"+free_ticket);
        System.out.println("Общая выручка распродажи составила--"+((totalSimpleTicket*price_simpleTicket)+(totalFullTicket*price_fullTicket)));
    }
    public static void zadanie_13_15(){
        String str1 = "Программа принимает двухзначное целое число и выводит на экран сумму между цифрами " +
                "данного числа.";
        System.out.println(str1);
        Delimetr.deleq(str1.length());
        System.out.print("Введите число--");
        int number = scn.nextInt();
        int num1 = number/10;
        int num2 = number%10;
        int sum = 0;
        if(num1>num2){
            for(int i=num2;i<=num1;i++){
                sum+=i;
                if (i<num1) {
                    System.out.print(i + "+");
                }
                if(i==num1){
                    System.out.print(i+"="+sum);
                }
            }
        }else
            for(int i=num1;i<=num2;i++){
                sum+=i;
                if(i<num2) {
                    System.out.print(i + "+");
                }
                if (i==num2){
                System.out.print(i+"="+sum);
            }
            }
    }
    public static void zadanie_13_16(){
        String str1 = "Последовательность задана математической формулой An=(2n-1)^0.5";
        System.out.println(str1);
        Delimetr.deleq(str1.length());
        int number = rnd.nextInt(1,10);
        double sum =0;
        for(int i=1;i<=number;i++){
        double step =Math.pow(2*i-1,0.5);
         sum+=step;
        System.out.println(step+" ");
        }
        Delimetr.delmin(str1.length());
        System.out.println("-->"+sum);
    }
    public static void zadanie_13_17 (){
      String str1 = "Числа Фибоначчи";
      System.out.println(str1);
      Delimetr.deleq(str1.length());
      System.out.print("Введите число-->");
      int number = scn.nextInt();
      for(int i=1;i<=number;i++){
          int step = (i-1)+(i-2);
          System.out.print(step+" ");

      }
    }
}