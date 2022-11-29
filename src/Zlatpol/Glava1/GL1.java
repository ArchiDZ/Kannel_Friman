package Zlatpol.Glava1;

import java.util.Random;
import java.util.Scanner;

public class GL1 {
    static Scanner scn = new Scanner(System.in);
    static Random rnd = new Random();
    public static void z_1_1(){
        int a = 31;
        int b = 18;
        int c = 79;

        System.out.println(a+" "+b+" "+c);
    }
    public static void z_1_2(){
    /*Вывести в одной строке числа 47 52 и 150
    * с двумя пробелами*/
        System.out.println(47+"  "+52+"  "+150);
    }
    public static void z_1_3(){
        /*Вывести на экран числа 50 и 10 одно под другим*/
        System.out.println(50);
        System.out.println(10);
    }
    public static void z_1_4(){
        /*Вывести на экран числа 5 10 и 21 одно под другим*/
        System.out.println(5);
        System.out.println(10);
        System.out.println(21);
    }
    public static void z_1_5(){
        /*вывести числа 1 и 2 одно под другим*/
        System.out.println(1);
        System.out.println(2);
    }
    public static void z_1_6(){
        /*Число ПИ-3,1415926 вывести на экран это число
        * с тремя числами после дробной части */
        double pi = 3.1415926;
        System.out.println(Math.round(pi*1000.00)/1000.00);
    }
    public static void z_1_7(){
        /*Число е (основание натурального логарифма)
        * приблизительно равно 2.71828 Вывести на экран
        * это число с точностью до десятых.*/
        double e = 2.71828;
        double e_round = Math.round(e*10.0)/10.0;
        System.out.println(e_round);
    }
    public static void z_1_8(){
        /*Составить программу вывода на экран числа,вводимого
        * с клавиатуры. Выводимому числу должно предшествовать
        * сообщение "Вы ввели число"*/

        int number = scn.nextInt();
        System.out.println("Вы ввели число-->"+number);
    }
    public static void z_1_9(){
        /*Программа которая выводит на экран числа вводимые с
        * клавиатуры. После вводимого числа должно следовать сообщение
        * "- вот какое число вы ввели"*/
        int number = scn.nextInt();
        System.out.println(number+"- вот какое число вы ввели");
    }
    public static void z_1_10(){
        /*Программа которая запрашивает имя
        человека и выводит его на экран*/
        System.out.print("-->");
        String name = scn.next();
        System.out.println("Привет, "+name+"!!!");
    }
    public static void z_1_11(){
        /*Составить программу которая запрашивает название
        * футбольной команды и повторяет ее со словами "- Чемпион"*/
        String football_team = scn.next();
        System.out.println(football_team+"-Чемпион");
    }
    public static void z_1_12(){
        /*Напишите программув которой вводится имя
        человека и выводится на экран приветствие в виде
        слова "Привет", после которого должна стоять заяпятая,
        введное имя и восклицательный знак.*/
        System.out.print("-->");
        String name = scn.next();
        System.out.println("Привет, "+name+"!!!");
    }
    public static void z_1_13(){
        /*Напишите программу, в которую вводится целое число,
        *после чего на экран выводится следующее и предыдущее целое число.
        * Например при вводе числа 15 на экран должно быть выведено
        * -Следующее за числом 15 - 16
        * -Для числа 15 предыдущее число - 14 */
        int number = scn.nextInt();
        System.out.println("Следующее за числом "+number+" - "+(number+1));
        System.out.println("Для числа "+number+" предыдущее число - "+(number-1));
    }
    public static void z_1_14(){
        /*Составить программу вывода на экран в одну строку трех любых чисел,
        * вводимых с клавиатуры, с двумя пробелами между ними*/
        System.out.print("-->");
        int num1 = scn.nextInt();
        System.out.print("-->");
        int num2 = scn.nextInt();
        System.out.print("-->");
        int num3 = scn.nextInt();
        System.out.println(num1+"  "+num2+"  "+num3);
        scn.close();
    }
    public static void z_1_15(){
        /*Составить программу вывода на экран в одну строку четырех любых чисел ,
        * вводимы с клавиатуры,с одним пробелом между ними*/
        System.out.print("-->");
        int num1 = scn.nextInt();
        System.out.print("-->");
        int num2 = scn.nextInt();
        System.out.print("-->");
        int num3 = scn.nextInt();
        System.out.print("-->");
        int num4 = scn.nextInt();
        System.out.println(num1+" "+num2+" "+num3+" "+num4);
        scn.close();
    }
    public static void z_1_16(){
        /*Составить программу вывода на экран следующей информации
        * а)5 10
        *   7 см
        *
        * б) 100 t
        *    1949 v
        *
        * в) x 25
        *    x y
        *
        * ПРИМЕЧАНИЕ: t,v,x,y - переменные величины целого типа, значения которых
        * вводятся с клавиатуры (или генерируются случайным образом)
        *  и должны быть выведены вместо имен величин*/
        int t = rnd.nextInt(1,100);
        int x = rnd.nextInt(1,100);
        int y = rnd.nextInt(1,100);
        int v = rnd.nextInt(1,100);
        System.out.println("Вариант А");
        System.out.println(5+" "+10);
        System.out.println(7+" "+"см");
        System.out.println("Вариант Б");
        System.out.println(100+" "+t);
        System.out.println(1949+" "+v);
        System.out.println("Вариант В");
        System.out.println(x+" "+25);
        System.out.println(x+" "+y);
    }
    public static void z_1_17(){
        /*Составить программу вывода на экран следующей информации
        * а)2 кг
        *   13 17
        *
        * б) a 1
        *    19 b
        *
        * в) x y
        *    5 y
        *
        * ПРИМЕЧАНИЕ: a,b,x,y - переменные величины целого типа, значения которых
         * вводятся с клавиатуры (или генерируются случайным образом)
         *  и должны быть выведены вместо имен величин
        */
        int a = rnd.nextInt(1,100);
        int b = rnd.nextInt(1,100);
        int y = rnd.nextInt(1,100);
        int x = rnd.nextInt(1,100);
        System.out.println("Вариант А");
        System.out.println(2+" кг");
        System.out.println(13+" "+17);
        System.out.println("Вариант Б");
        System.out.println(a+" "+1);
        System.out.println(19+" "+b);
        System.out.println("Вариант В");
        System.out.println(x+" "+y);
        System.out.println(5+" "+y);
    }
}
//Глава 1 решена