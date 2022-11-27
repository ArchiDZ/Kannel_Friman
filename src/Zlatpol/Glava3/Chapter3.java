package Zlatpol.Glava3;

import java.util.Random;
import java.util.Scanner;

public class Chapter3 {
    static Random rnd =new Random();
    static Scanner scn = new Scanner(System.in);

    public static void zadanie_3_1() {
        /*Дано расстояние в сантиметрах, вывести на экран в метрах*/
        double dlin_cm = 360;
        double dlin_m = dlin_cm / 100;
        System.out.println(dlin_m+"m");
    }
    public static void zadanie_3_2(){
        /*Дана масса в килонграммах, вывести на экрон информацию
        в центнерах*/
        double kg = 122;
        double cent = kg/100;
        System.out.println(kg+" = "+cent+" центнерам");
    }
    public static void zadanie_3_3(){
        /*С некоторого момента прошло 234 дня сколтко полных неледель
        * прошло*/
        int days = 234;
        int week = 234/7;
        int not_week = 234%7;
        System.out.println("Прошло "+week+" недели и "+not_week+" дней");
    }
    public static void zadanie_3_4(){
        /*Школьники делят яблоки, количество школьников и количество яблок
        * генерируется случайно*/
        int schkolnik = rnd.nextInt(15,35);
        int dop_jabloki = rnd.nextInt(1,100);
        int korzina = schkolnik+dop_jabloki;
        System.out.println("Всего школьников "+schkolnik);
        System.out.println("В корзине "+korzina+" яблок");
        System.out.println((korzina/schkolnik)+" яблок досталось " +
                "каждому школьнику");
        System.out.println(korzina%schkolnik+" яблок осталось в корзине");
    }
    public static void zadanie_3_5(){
        /*Дан прямоугольник 543х130 см сколько квадратов можно нарезать
        * из данного прямоугольника*/

    }
}
