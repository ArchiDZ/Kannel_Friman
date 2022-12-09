package BookKannnel.Razdel1.Razdel9;

import Tools.Tool3;
import Tools.Tool6;

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
   public static void zadanie_9_8(){
       /*Счастливый 6-значный билет,если сумма первых трех его цифр равна сумме последних трех цифр
       * и обе суммы являются четными.*/
       int ticket = rnd.nextInt(100000,999999);
       System.out.println("Билет с номером "+ticket);
       Tool6 tl = new Tool6();
       tl.sixDec(ticket);
       int summ1 = tl.getNum1()+ tl.getNum2()+ tl.getNum3();
       int summ2 = tl.getNum4()+tl.getNum5()+ tl.getNum6();
        if (summ1 == summ2 && summ1%2==0){
            System.out.println("Поздравляю счастливый билет найден");
        }
       System.out.println(summ1+"  "+summ2);
   }
   public static void zadanie_9_9(){
       /*Метод который принимает с клавиатуры коэффициенты А и В линейного уровнения
       * (уравнение первой степени ax+b=0)и решает его. То есть выводит на экран корень
       * (корни) уравнения, или соответсвующее смыслу текстовое сообщение*/
       //пример из книги c некоторыми изменениями

       int a = rnd.nextInt(-100,100);
       int b = rnd.nextInt(-100,100);
       System.out.println("a="+a+" b="+b);
       if (a==0 && b==0){
           System.out.println("Бесконечное множество решений");
       }
       if(a==0 && b!=0){
           System.out.println("Нет решений");
       }
       if(1!=0){
           System.out.println(-b/a);
       }
   }
   public static void zadanie_9_10(){
       /*Метод который принимает с клавиатуры три целых числа и определяет,
       * в каких соотношениях с точки зрения они находятся( больше, меньше или равно)
       * На экран следует вывести сообщение с точным указанием результатов проверки*/
       //Поправка числа генерируются случайным образом
       int num1 = rnd.nextInt(-100,100);
       int num2 = rnd.nextInt(-100,100);
       int num3 = rnd.nextInt(-100,100);
       System.out.println("Число_1-->"+num1+" Число_2-->"+num2+" Число_3-->"+num3);
       if(num1>num2){
           System.out.println("Число_1 больше чем число_2");
       }
       if(num1>num3){
           System.out.println("Число_1 больше чем число_3");
       }
       if (num1==num2){
           System.out.println("Число_1 равно числу_2");
       }
       if (num1 == num3){
           System.out.println("Число_1 равно числу_3");
       }
        if(num2==num3){
            System.out.println("Число_2 равно числу_3");
        }
        if(num2>num1){
            System.out.println("Число_2 больше числа_1");
        }
        if(num2>num3){
            System.out.println("Число_2 больше числа_3");
        }
        if (num3>num1){
            System.out.println("Число_3 больше числа_1");
        }
        if(num3>num2){
            System.out.println("Число_3 больше числа_2");
        }
   }
   public static void zadanie_9_11(){
       /*Число является плосским, если оно составлено из одинаковых цифр.
       * Метод который проверяет является ли число плосским*/

       int number = rnd.nextInt(100,999);
       System.out.println(number);
       Tool3 tl = new Tool3();
       tl.threeDec(number);
       if(tl.getNum1() == tl.getNum2() && tl.getNum2()==tl.getNum3()){
           System.out.println("Вы нашли плоское число");
       }
   }

   public static void zadanie_9_12(){
       /*Трехзначное число называется поднимающиемся ,
       * если оно составлено из цифр, расположенных в порядке возрастания
       * Метод который принимает с клавиатуры трехзначное число и проверяет является ли оно возрастающим
       * */
        int number = rnd.nextInt(99,999);
       System.out.println(number);
        Tool3 tl = new Tool3();
        tl.threeDec(number);
        if(tl.getNum1()<tl.getNum2() && tl.getNum2()<tl.getNum3()){
            System.out.println("Поднимающиеся число");
        }else System.out.println("Число обычное");
   }
   public static void zadanie_9_13(){
       /*Трехзначное число называется "Опускающимся",
        * если оно составлено из цифр, расположенных в порядке убывания
        * Метод который принимает с клавиатуры трехзначное число и проверяет является ли оно возрастающим
        * */
       int number = rnd.nextInt(99,999);
       System.out.println(number);
       Tool3 tl = new Tool3();
       tl.threeDec(number);
       if(tl.getNum1()>tl.getNum2() && tl.getNum2()>tl.getNum3()){
           System.out.println("Опускающиеся число");
       }else System.out.println("Число обычное");
   }
   public static void zadanie_9_14(){
       /*Определим "Текстовую форму оценки следующим образом: 1 или 2 Неудовлетворительно
       * 3 - Удовлетворительно, 4 - хорошо, 5 - Отлично.
       * Метод который принимает с клавиатуры число и выводит соответсвующие сообщение на экран*/
       System.out.println("Введите оценку");
       int mark = input.nextInt();
       switch (mark){
           case 1:
               System.out.println("Неудовлетворительно");
               break;
           case 2:
               System.out.println("Неудовлетворительно");
               break;
           case 3:
               System.out.println("Удовлетварительно");
               break;
           case 4:
               System.out.println("Хорошо");
               break;
           case 5:
               System.out.println("Отлично");
               break;
       }
       if(mark>5){
           System.out.println("Оценка не может быть выше 5");
       }
       if(mark<1){
           System.out.println("Оценка не может быть ниже 1");
       }
   }
   public static void zadanie_9_15(){
       /* Метод который принимает с клавиатуры число которое должно означать порядковый номер месяца
       * Если номер соответсвует порядковому номеру месяца,далее следует вывест сезон к которому относится месяц*/
       System.out.println("Введите число месяца");
       int number = input.nextInt();
       String month = "";
       String season = "";
       if(number>12){
           System.out.println("Число месяца не может быть больше 12");
       }
       if(number<1){
           System.out.println("Число месяца не может быть меньше 1");
       }
       switch (number){
           case 1:
               month = "Январь";
               break;
           case 2:
               month = "Февраль";
               break;
           case 3:
               month = "Март";
               break;
           case 4:
               month = "Апрель";
               break;
           case 5:
               month = "Май";
               break;
           case 6:
               month = "Июнь";
               break;
           case 7:
               month = "Июль";
               break;
           case 8:
               month = "Август";
               break;
           case 9:
               month = "Сентябрь";
               break;
           case 10:
               month = "Октябрь";
               break;
           case 11:
               month = "Ноябрь";
               break;
           case 12:
               month = "Декабрь";
               break;
       }
       if(month.equals("Декабрь") || month.equals("Январь")
               || month.equals("Февраль")){
           season = "Зима";
       }
       if(month.equals("Март") || month.equals("Апрель") || month.equals("Май")){
           season = "Весна";
       }
       if(month.equals("Июнь") || month.equals("Июль") || month.equals("Август")){
           season = "Лето";
       }
       if(month.equals("Сентябрь") || month.equals("Октябрь") || month.equals("Ноябрь")){
           season = "Осень";
       }
       System.out.println(number+" -->"+month+" "+season);
   }
   public static void zadanie_9_16(){
       /**
        * Определим следующие периоды суток:
        * -Утро с 6(включая) до 10(невключая)
        * -День с 10 (не включая) до 18 (включая)
        * -Вечер с 18 (не включая) до 22 (не включая)
        * -Ночь с 22 (не включая) до 6 (не включая)
        *
        * Метод который принимает с клавиатуры целое число,
        * которое должно указывать на определенный час в сутках
        * и выводит на экран сообщение, к какому периоду в сутках этот
        * час относится. В случае если введеное значение не позволяет
        * выполнить указанное действие, следует вывести на экран
        * соответсвующие сообщение
        */
       // int hour = input.nextInt();
       for(int hour = 1; hour<24;hour++) {
           if (hour > 24 || hour < 1) {
               System.out.println("Недопустимое время");
           }
           if (hour >= 6 && hour < 10) {
               System.out.println("Утро");
           }
           if (hour > 10 && hour <= 18) {
               System.out.println("День");
           }
           if (hour > 18 && hour < 22) {
               System.out.println("Вечер");
           }
           if (hour > 22 && hour <= 24) {
               System.out.println("Ночь");
           }
           if (hour >= 1 && hour < 6) {
               System.out.println("Ночь");
           }
           System.out.println("--="+hour+"=--");
       }
   }
   public static void zadanie_9_17(){
    /*Метод который принимает с клавиатуры три числа и проверяет, является ли
    * ли эти числа углами одного и тогоже треугольника
    * По результатам проверки необходимо вывести сообщение*/

       int a = rnd.nextInt(1,180);
       int b = rnd.nextInt(1,180);
       int c = rnd.nextInt(1,180);
       int summ = a+b+c;
       System.out.println(a+" "+b+" "+c);
       if (summ == 180){
           System.out.println("Три угла принадлежат к одному треугольнику");
       }
       if (summ<180){
           System.out.println("Улы не принадлежат к 1 треугольнику");
       }
       if(summ>180){
           System.out.println("Это не треугольник");
       }
   }
   public static void zadanie_9_18(){
       /*Метод который принимает с клавиатуры три числа и проверяет
       * являтся ли эти числа длинами сторон одного и того же треугольника.
       * По результатам проверки необходимо вывести соответствующие
       * сообщение*/
       int a = rnd.nextInt(1,100);
       int b = rnd.nextInt(1,100);
       int c = rnd.nextInt(1,100);
       String triagle = "";
       System.out.println("a="+a+" b="+b+" c="+c);
       if(a==b && a!=c && b!=c){
           triagle="Равнобедренный треугольник";
       }
       if(a==b && b==c && c==a){
           triagle = "Равносторонний треугольний";
       }
       if (a!=b && b!=c && c!=a){
           triagle = "Разносторонний треугольник";
       }
       System.out.println(triagle);
   }
   public static void zadanie_9_19(){
       /*Метод который принимает два положительных числа,
       * которые могут быть длинами смежных сторон квадрата
       * или прямоугольника. Метод должен определить к каакой фигуре
       * относятся данные стороны*/
       int a = rnd.nextInt(2,25);
       int b = rnd.nextInt(2,25);
       String result = "";
       System.out.println("a="+a+" b="+b);
       if(a==b){
           result = "Квадрат";
       }
       if(a!=b){
           result = "Прямоугольник";
       }
       System.out.println(result);
   }
   public static void zadanie_9_20(){
      /*Метод который принимает с клавиатуры временной интервал
      * выраженный в секундах, и выводит на экран тот же интервал только
      * в минутах,секундах
      * Если промежуток превышает сутки,то вывести сообщение о том что
      * рассчеты не производятся*/
       System.out.print("Введите временной интервал-->");
       int time = input.nextInt();
       int min = time/60;
       int sec = time%60;

       System.out.println(min+" мин "+sec+" сек");
   }
   public static void zadanie_9_21(){
       /*Метод который принимает с клавиатуры временной интервал
        * выраженный в секундах, и выводит на экран тот же интервал только
        * в часах,минутах,секундах
        * Если промежуток превышает сутки,то вывести сообщение о том что
        * рассчеты не производятся*/
       System.out.print("Введите временной интервал-->");
       int time = input.nextInt();
       int min = time/60;
       int sec = time%60;
       int hour = 0;
       if(min >= 60){
           hour=min/60;
           min = min%60;
       }
       System.out.println(hour+" час "+min+" мин "+sec+" сек");
   }
   public static void zadanie_9_22(){
       /*В кассе имеются купюры достоинством 100, 50, 10 рублей.
       * Метод который принимает с клавиатуры целое число выражающее сумму в рублях которую надо выплатить.
       * Метод должен определить  каким минимальным набором купюр можно выдать введеную сумму и какими купюрами.
       * Если нет возможности выплатить указанную сумму вывести соответсвующее сообщение
       *  */
       System.out.print("Введите сумму-->");
       int num = input.nextInt();
       if(num%10!=0){
           System.out.println("Нет расчета");
       }
       Tool3 tl = new Tool3();
       int ost = 0;
       tl.threeDec(num);
       tl.getNum1();
       int x = tl.getNum2();
       if (x>50){
           x= tl.getNum2()/50;
            ost = x%50;
           ost/=10;
       }
       System.out.println("100-->"+tl.getNum1()+" 50-->"+x+" 10-->"+ost);


   }

}
