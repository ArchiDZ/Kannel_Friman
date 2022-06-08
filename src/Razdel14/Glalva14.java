package Razdel14;

import Tools.Delimetr;

import java.util.Random;
import java.util.Scanner;

public class Glalva14 {
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void zadanie_14_1(){
        String s = "В соревнованиях по бегу принимали участие 150 учеников школы. Доска результатов и лучший результат";
        System.out.println(s);
        Delimetr.deleq(s.length());
        double time_zero = rnd.nextDouble(10.0,200.0);
        int best = 0;
        for(int i=1;i<=149;i++){
            double time = rnd.nextDouble(10.0,200.0);
            System.out.println("Участник №("+i+")--Время-->"+Math.round(time*100.0)/100.0);
            if(time<time_zero){
                time_zero=time;
                best=i;
            }
        }
        System.out.println("Лучшее время показал участник №("+best+")"+"время-->"+Math.round(time_zero*100.0)/100.0);
    }
    public static void zadanie_14_2(){
        //Аналогичная задача 14_1
    }
    public static void zadanie_14_3(){
        String s = "Генерация 50 случайных чисел из диапазона -40..+40. Выделить самое маленькое и самое большое";
        System.out.println(s);
        Delimetr.deleq(s.length());
        int min = 0;
        int max = 0;
        for (int i = 1; i<=50;i++){
            int number = rnd.nextInt(-40,40);
            System.out.print(number+" ");
            if(number<min){
                min=number;
            }
            if(number>max){
                max=number;
            }
        }
        Delimetr.delmin(s.length());
        System.out.println("min-->"+min+" max-->"+max);
    }
    public static void zadanie_14_4(){
        String s = "Генерация 50 случайных чисел из диапазона -40..+40. Выделить самое маленькое и самое большое" +
                "Вывести минимум и максимум у положительных и отрицательных";
        System.out.println(s);
        Delimetr.deleq(s.length());
        int min = 0;
        int minmin = 0;
        int minmax = 0;
        int max = 0;
        int maxmin = 0;
        int maxmax = 0;
        for (int i = 1; i<=50;i++){
            int number = rnd.nextInt(-40,40);
            System.out.print(number+" ");
            if(number<min){
                min=number;
                if(min<minmax){
                    minmin=min;
                }
                if(min>minmax){
                    minmax=min;
                }
            }
            if(number>max){
                max=number;
                if(max<maxmin){
                    maxmin=max;
                }
                if(max>maxmax){
                    maxmax=max;
                }
            }
        }
        Delimetr.delmin(s.length());
        System.out.println("min-->"+min+" max-->"+max);
        System.out.println("minmin-->"+minmin+" minmax-->"+minmax);
        System.out.println("maxmin-->"+maxmin+" maxmax-->"+maxmax);
    // minmax always 0 and maxmin always 0.
    }
    public static void zadanie_14_5(){
        String s = "Ввод 12 чисел, определение максимума и минимума и среднее арифметического";
        System.out.println(s);
        Delimetr.deleq(s.length());
        int min = 0;
        int max = 0;
        int avg = 0;
        for(int i=1;i<=12;i++){
            System.out.println("("+i+")-->");
            int number = sc.nextInt();
            if(number<min){
                min=number;
            }
            if(number>max){
                max=number;
            }
            avg+=number;
        }
        System.out.println("min-->"+min+" max-->"+max+" avg-->"+avg/12);
    }
    public static void zadanie_14_6(){
        String s = "Серия из 27 целых чисел. Среднее арифметическое максимума и минима и всего ряда";
        int min = 0;
        int max = 0;
        int avg = 0;
        for(int i = 1;i<=27;i++){
            int number = rnd.nextInt(-100,100);
            System.out.print(number+" ");
            if(number<min){
                min=number;
            }
            if(number>max){
                max=number;
            }
          avg+=number;

        }
        System.out.println();
        System.out.println("min-->"+min+" max-->"+max+" avg-->"+avg/27);
        System.out.println("minAVG-->"+min/27+" maxAVG-->"+max/27);
    }
    public static void zadanie_14_7(){
        System.out.println("Серия из 20 целых двзначных чисел, у максимального числа вывести сумму цифр");
        int max=0;
        int sum = 0;
        for (int i=1;i<=20;i++){
            int num = rnd.nextInt(10,99);
            System.out.print(num+" ");
            if(num>max){
                max=num;
                int l1 = max/10;
                int l2 = max%10;
                sum=l1+l2;
            }
        }
        System.out.println("max-->"+max);
        System.out.println("summ-->"+sum);
    }
    public static void zadanie_14_8(){
        System.out.println("Серия из 20 целых трехзначных чисел, у максимального числа вывести сумму цифр");
        int max=999;
        int sum = 0;
        for (int i=1;i<=20;i++){
            int num = rnd.nextInt(100,999);
            System.out.print(num+" ");
            if(num<max){
                max=num;
                int l1 = max/100;
                int l2 = (max/10)%10;
                int l3 = max%10;
                sum=l1+l2+l3;
            }
        }
        System.out.println("max-->"+max);
        System.out.println("summ-->"+sum);
    }
    public static void zadanie_14_9(){
        String s="Серия из 24 чисел, выводи ряд чисел максимальное число и его порядковый номер в ряду";
        System.out.println(s);
        Delimetr.deleq(s.length());
        int max = 0;
        int position = 0;
        for(int i=1;i<=24;i++){
            int num = rnd.nextInt(1,10000);
            System.out.print("("+i+")"+num+" ");
            if(num>max){
                max=num;
                position=i;
            }
        }
        System.out.println("Самое большое число-->"+max+" находится на позиции-->"+position);
    }
    public static void zadanie_14_10(){
        String s = "25 целых положительных чисел,выводит на экран сумму цифр которого была максимальной";//не точное описание,делаем отсебятину
        System.out.println(s);
        int sum = 0;
        int max = 0;
        int max_sum=0;
        for (int i=1;i<=25;i++){
            int num = rnd.nextInt(100,999);
            System.out.print("("+i+")"+num+" ");
            if(num>max){
                max=num;
            }
            int l1 = num/100;
            int l2 = (num/10)%10;
            int l3 = num%10;
            sum = l1+l2+l3;
            if(sum>max_sum){
                max_sum=sum;
            }
            System.out.print("("+i+")"+sum+" ");
        }
        System.out.print("Максимальное число-->"+max);
        System.out.print("Максимальная сумма цифр числа-->"+max_sum);
    }
}
