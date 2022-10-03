package BookKannnel.Razdel1.Razdel13;

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
    public static void zadanie_13_18(){
        String head = "На вклад в банке ежемесячно начисляются сумма которая зависит от ежемесячного " +
                "процента на вклад.";
        System.out.println(head);
        Delimetr.deleq(head.length());
        System.out.print("Введите сумму вклада-->");
        double money = scn.nextDouble();
        Delimetr.delmin(30);
        System.out.print("Введите процентную ставку-->");
        int stavka = scn.nextInt();
        Delimetr.delmin(30);
        System.out.print("Введите количество месяцев вклада-->");
        int month = scn.nextInt();
        Delimetr.delmin(30);
        for (int i= 1;i<=month;i++){
            money+=money/100*stavka;
        }
        System.out.print("Сумма накоплений "+money);
    }
    public static void zadanie_13_19(){
        String str1 = "Стабильное положительное двузначное число которое при умножении на " +
                "2 дает такое двухзначное число, в котором сумма цифр равна сумме цифр" +
                "до умножения";
        System.out.println(str1);
        Delimetr.deleq(str1.length());
        int counter=0;
        for(int i=10;i<=99;i++){
            int num1 = i/10;
            int num2 = i%10;
            int summ = num1+num2;
            int number1 = (i*2)/10;
            int number2 = (i*2)%10;
            int sum = number1+number2;
            if(sum==summ){
                System.out.print(i+" ");
                counter++;
            }
        }
        System.out.println("Общее количество стабильных двузначных чисел "+counter);
    }
    public static void zadanie_13_20(){
        String str = "Двузначные числа , сумма чисел куба равна квадрату самого числа";
        System.out.println(str);
        Delimetr.deleq(str.length());
        int summ = 0;
        for(int i=10;i<=99;i++){
            int number = (int)Math.pow(i,3);
            int sqNumber = (int)Math.pow(i,2);
        if(number<=9999 && number>1000 ){
            int num1 = number/1000;
            int num2 = (number/100)%10;
            int num3 = (number%100)/10;
            int num4 = number%10;
            summ = num1+num2+num3+num4;
            if(summ==sqNumber){
                System.out.println(i+"--"+number+"--"+num1+" "+num2+" "+num3+" "+num4+"-->"+summ+"--"+sqNumber);
            }
            }
        if(number<=99999 && number>9999){
            int num1 = number/10000;
            int num2 = (number/1000)%10;
            int num3 =(number/100)%10;
            int num4 = (number%100)/10;
            int num5 = number%10;
            summ = num1+num2+num3+num4+num5;
            if(summ==sqNumber){
                System.out.println(i+"--"+number+"--"+num1+" "+num2+" "+num3+" "+num4+" "+num5+"-->"+summ+"--"+sqNumber);
            }
        }
        if (number<=999999 && number>99999){
            int num1 = number/100000;
            int num2 = (number/10000)%10;
            int num3 = (number/1000)%10;
            int num4 =(number/100)%10;
            int num5 = (number%100)/10;
            int num6 = number%10;
            summ = num1+num2+num3+num4+num5+num6;
            if(summ==sqNumber){
                System.out.println(i+"--"+number+"--"+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+"-->"+summ+"--"+sqNumber);
            }
        }
            System.out.println(i+"--"+number+"-->"+summ+"--"+sqNumber);
        Delimetr.delmin(22);
        }
    }
    public static void zadanie_13_21(){
        String str = "Вывод на экран все двузначные числа,равные утроеному произведению их цифр";
        System.out.println(str);
        Delimetr.deleq(str.length());
        for(int i=10;i<=99;i++){
            int num1 = i/10;
            int num2 = i%10;
            int number = (num1*num2)*3;
            System.out.print(i+"--"+num1+" "+num2+"-->"+number);
            Delimetr.delmin(20);
        }
    }
    public static void zadanie_13_22(){
        String str = "Число Армстронга называется то число куб суммы цифр равен самому числу";
        System.out.println(str);
        Delimetr.deleq(str.length());
        int counter=0;
        int total_sum = 0;
        for(int i=100;i<=999;i++){
            int num1 = i/100;
            int num2 = (i/10)%10;
            int num3 = i%10;
            int sum = (int) (Math.pow(num1,3)+Math.pow(num2,3)+Math.pow(num3,3));//num1+num2+num3;
          //  int total = (int) Math.pow(sum,3);
            if(sum==i){
                counter++;
                total_sum+=sum;
                System.out.print(i+" "+sum+" ");//+total);
                Delimetr.delmin(25);
            }
        }
        System.out.println("Общаая сумма все чисел Армстронга-->"+total_sum);
        System.out.println("Кол-во чисел армстронга = "+counter);
    }
    public static void zadanie_13_23(){
        String str = "Все двузначные числа, у которых удвоенная сумма цифр равна их произведению";
        System.out.println(str);
        Delimetr.deleq(str.length());
        int total = 0;
        int counter=0;
        for(int i=10;i<=99;i++){
            int num1 = i/10;
            int num2 = i%10;
            int doSum = (num1+num2)*2;
            int multi = num1*num2;
            if(doSum==multi){
                counter++;
                total+=i;
                System.out.print(i+" ");
            }
        }
        Delimetr.delmin(20);
        System.out.println("Кол-во таких чисел-->"+counter);
        System.out.println("Общая сумма данных чисел-->"+total);
    }

    public static void zadanie_13_24(){
        String s = "Серия из 20 случайных чисел в диапазоне 30..49, числа меньше первого в серии " +
                "вывести со знаком -, больше со знаком +";
        System.out.println(s);
        Delimetr.deleq(s.length());
        int first_num = rnd.nextInt(30,49);
        int min = 0;
        int pl = 0;
        System.out.print(first_num+" ");
        for(int i=0;i<19;i++){
            int number = rnd.nextInt(30,49);
            if(first_num>number){
                System.out.print("-"+number);
                min++;
            }
            if(first_num<number){
                System.out.print("+"+number);
                pl++;
            }
        }
        Delimetr.delmin(25);
        System.out.println("(-)-->"+min);
        System.out.println("(+)-->"+pl);
    }
    public static void zadanie_13_25(){
        String s = "Серия 25 случайных чисел в диапазоне от 10 до 99, вывод только тех чисел которые " +
                "делятся на первое число в серии без остатка";
        System.out.println(s);
        Delimetr.deleq(s.length());
        int first_num = rnd.nextInt(10,99);
        System.out.println(first_num);
        for(int i=0;i<25;i++){
            int num = rnd.nextInt(10,99);
            if(num%first_num==0){
                System.out.println(num+" ");
            }
        }
    }
    public static void zadanie_13_26(){
        String s = "Серия из 15 случайных чисел из диапазона -30..+30, вывести на экран только те числа которые" +
                "имеют такой же знак как и предыдущее число, 0 значится как положительное";
        System.out.println(s);
        Delimetr.deleq(s.length());
        int max = 15;
        int counter=0;
        int first_num = rnd.nextInt(-30,30);
        System.out.println(first_num);
        for(int i=1;i<90;i++){
            int num = rnd.nextInt(-30,30);
            if (first_num<0 && num<0){
                System.out.print(num+" ");
                counter++;

            }
            if(first_num>=0 && num>=0){
                System.out.print(num+" ");
                counter++;
            }

            if (counter==15){
                break;
            }
        }
    }
    public static void zadanie_13_27(){
        String s = "Программа принимает 3 целых числа и проверяет являются ли тремя последовательными " +
                "членами арифмитеческой прогресси. Если ДА то вывести на экран 14 чисел данной прогресии," +
                "если НЕТ то вывести соответсвующие сообщение";
        System.out.println(s);
        Delimetr.deleq(s.length());
        System.out.println("Введите 3 числа последовательности");
        System.out.print("1-->");
        int num1 = scn.nextInt();
        System.out.print("2-->");
        int num2 = scn.nextInt();
        System.out.print("3-->");
        int num3 = scn.nextInt();
        Delimetr.delmin(25);
        int d1 = num2-num1;
        int d2 = num3-num2;
        if(d1!=d2){
            System.out.print("Данные числа не является из 1 серии арифмитеской прогрессии");
        }
        else
            for(int i = 1;i<14;i++){
                num3+=d2;
                System.out.print(num3+" ");
            }
    }
    public static void zadanie_13_28(){
        String s = "Вводимы 4 числа являются указателями для ряда чисел одной прогресии." +
                "1 и 2 пара чисел - значение и порядковый номер одной прогресии, необходимо вывести все значения между " +
                "двумя введенными";
        System.out.println(s);
        Delimetr.deleq(s.length());
        System.out.println("Введите первую пару");
        System.out.print("1-->");
        int num1 = scn.nextInt();
        System.out.print("2-->");
        int num2 = scn.nextInt();
        System.out.println("Введите вторую пару чисел");
        System.out.print("3-->");
        int num3 = scn.nextInt();
        System.out.print("4-->");
        int num4 = scn.nextInt();
        // Не закончена
    }
    public static void zadanie_13_29(){
        String s ="Для участия в финале принимали участия 12 человек, всего 3 этапа для прохождения в третий этап" +
                "необходимо было набрать 80 баллов";
        System.out.println(s);
        Delimetr.deleq(s.length());
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        int num5=0;
        int num6=0;
        int num7=0;
        int num8=0;
        int num9=0;
        int num10=0;
        int num11=0;
        int num12=0;
        for (int i=1;i<3;i++){
            int score = rnd.nextInt(1,50);
            num1+=score;
            System.out.print("Этап ("+i+") участник 1 получил "+score);

        }
        if(num1>80){
            System.out.println("Участник прошел в третий этап");
        }
        Delimetr.delmin(20);
        for (int i=1;i<3;i++){
            int score = rnd.nextInt(1,50);
            num2+=score;
            System.out.print("Этап ("+i+") участник 2 получил "+score);
        }
        if(num2>80){
            System.out.println("Участник прошел в третий этап");
        }
        Delimetr.delmin(20);
        for (int i=1;i<3;i++){
            int score = rnd.nextInt(1,50);
            num3+=score;
            System.out.print("Этап ("+i+") участник 3 получил "+score);
        }
        if(num3>80){
            System.out.println("Участник прошел в третий этап");
        }
        Delimetr.delmin(20);
        for (int i=1;i<3;i++){
            int score = rnd.nextInt(1,50);
            num4+=score;
            System.out.print("Этап ("+i+") участник 4 получил "+score);
        }
        if(num4>80){
            System.out.println("Участник прошел в третий этап");
        }
        Delimetr.delmin(20);
        for (int i=1;i<3;i++){
            int score = rnd.nextInt(1,50);
            num5+=score;
            System.out.print("Этап ("+i+") участник 5 получил "+score);
        }
        if(num5>80){
            System.out.println("Участник прошел в третий этап");
        }
        Delimetr.delmin(20);
        for (int i=1;i<3;i++){
            int score = rnd.nextInt(1,50);
            num6+=score;
            System.out.print("Этап ("+i+") участник 6 получил "+score);
        }
        if(num6>80){
            System.out.println("Участник прошел в третий этап");
        }
        Delimetr.delmin(20);
        for (int i=1;i<3;i++){
            int score = rnd.nextInt(1,50);
            num7+=score;
            System.out.print("Этап ("+i+") участник 7 получил "+score);
        }
        if(num7>80){
            System.out.println("Участник прошел в третий этап");
        }
        Delimetr.delmin(20);
        for (int i=1;i<3;i++){
            int score = rnd.nextInt(1,50);
            num8+=score;
            System.out.print("Этап ("+i+") участник 8 получил "+score);
        }
        if(num8>80){
            System.out.println("Участник прошел в третий этап");
        }
        Delimetr.delmin(20);
        for (int i=1;i<3;i++){
            int score = rnd.nextInt(1,50);
            num9+=score;
            System.out.print("Этап ("+i+") участник 9 получил "+score);
        }
        if(num9>80){
            System.out.println("Участник прошел в третий этап");
        }
        Delimetr.delmin(20);
        for (int i=1;i<3;i++){
            int score = rnd.nextInt(1,50);
            num10+=score;
            System.out.print("Этап ("+i+") участник 10 получил "+score);
        }
        if(num10>80){
            System.out.println(" Участник прошел в третий этап");
        }
        Delimetr.delmin(20);
        for (int i=1;i<3;i++){
            int score = rnd.nextInt(1,50);
            num11+=score;
            System.out.print("Этап ("+i+") участник 11 получил "+score);
        }
        if(num11>80){
            System.out.println(" Участник прошел в третий этап");
        }
        Delimetr.delmin(20);
        for (int i=1;i<3;i++){
            int score = rnd.nextInt(1,50);
            num12+=score;
            System.out.print("Этап ("+i+") участник 12 получил "+score);
        }
        if(num12>80){
            System.out.println(" Участник прошел в третий этап");
        }
        Delimetr.delmin(20);
    }
    public static void zadanie_13_30(){
        String s = "Производство стальных шариков шарик должен быть 24мм отклонение +-2мм, вес 74грамм +-3";
        System.out.println(s);
        Delimetr.deleq(s.length());
        int ideal=0;

        for(int i=0;i<=1000;i++){
            int razmer = rnd.nextInt(22,26);
            int ves = rnd.nextInt(71,77);
            System.out.println("Шарик № "+i+" диаметр: "+razmer+"мм"+" Вес: "+ves+"грамм");
            if(razmer==24 && ves==74){
                System.out.print("Идеальный шарик");
                ideal++;
            }
            if(razmer>24){
                System.out.println("Шарик чуть больше стандарта");
            } if(razmer<24) {
                System.out.println("Шарик чуть меньше стандарта");
            }
            if(ves>74){
                System.out.println("Шарик немного тяжелее стандарта");
            }if(ves<74) {
                System.out.println("Шарик немного легче");
            }
            Delimetr.delmin(25);
        }
        System.out.println("Всего идеальных шариков получилось-->"+ideal);
    }
    public static void zadanie_13_31(){
        String s = "Распределение по классам 40 человек. Оценки по 10 бальной шкале. Два направления физико-математический и" +
                "физико-информационный. Если оценка по математике выше чем по информатике-->физико-математический";
        System.out.println(s);
        Delimetr.deleq(s.length()/2);
        int mathFizik = 0;
        int infoFizik = 0;
        int doubleChance = 0;
        int noChoice=0;
        for(int i = 0;i<=40;i++){
            int scoreMath = rnd.nextInt(1,10);
            int scoreFizik = rnd.nextInt(1,10);
            System.out.println("Студент №("+i+")");
            System.out.println("Математика - "+scoreMath);
            System.out.println("Физика - "+scoreFizik);
            if(scoreMath>=7){
                System.out.println("Может быть зачислен в Физико-Математический класс");
                mathFizik++;
            }
            if(scoreFizik>=7){
                System.out.println("Студент может быть зачислен в Физико-Информационный класс");
                infoFizik++;
            }
            if(scoreMath>=7 && scoreFizik>=7){
                System.out.println("Студент может быть зачислен в оба класса");
                doubleChance++;
            }
            if(scoreMath<7 && scoreFizik<7){
                System.out.println("Студент не сможет учиться ни в одном классе");
                noChoice++;
            }
            Delimetr.delmin(25);
        }
        System.out.println("Физико-Матетический "+mathFizik+" человек");
        System.out.println("Физико-Информационный "+infoFizik+" человек");
        System.out.println("Студенты которые могут поступить на оба потока "+doubleChance);
        System.out.println("Студенты которые не смогут учится ни по одной программе "+noChoice);
    }
    public static void zadanie_13_32(){
        String s = "Принимает число слогаемых в ряду Эйлера";
        System.out.println(s);
        Delimetr.deleq(s.length());
        double Pi = 3.14;
        double summ=0;
        System.out.print("Введите число слогаемых-->");
        int num = scn.nextInt();
        for(int i=1;i<=num;i++){
            summ += (1/Math.pow(i,2));
        }
        System.out.println("Ряд Эйлера-->"+summ);
        System.out.print(Pi/num);
        //Работает но,явно не так как должно...
    }
    public static void zadanie_13_33(){
        String s = "Принимает число слогаемых в ряду Махадевы-Эйлера и вычисляет значение числа ПИ";
        System.out.println(s);
        Delimetr.deleq(s.length());
        System.out.print("Введите число слогаемых-->");
        int num = scn.nextInt();
        int alpha = 1;
        double summ = 0;
        for(int i=1;i<=num;i++){
            if(i%2==1){
                summ+=4.0/alpha;
            }else
                summ-=4.0/alpha;
            alpha+=2;
        }
        Delimetr.delsharp(1);
        System.out.print(summ);
    }
}