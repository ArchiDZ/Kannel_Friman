package Zlatpol.Glava3;

import java.util.Random;
import java.util.Scanner;

public class GL3 {
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
            int a = 543/130;
        System.out.println(a);
    }
    public static void z_3_6(){
        /*В купейном вагоне имеется 9 купе с 4 местами для пассажиров в каждом.
        * Определить номер купе, в котором находиться место с заданным номером
        * (нумерация мест сквозная, начинается с 1)*/
        int mesto = 0;
        for (int i=1;i<=9;i++){
            for(int x=1;x<=4;x++){
                mesto++;
                System.out.print("|Вагон № "+i+". Место"+mesto+"| ");
            }
            System.out.println();
        }
    }
    public static void z_3_7(){
        /*В подьезде №1 пяти этажного жилого дома 15 квартир. определить на
        каком этаже находиться квартира с заданным номером*/
        int kvartira = 0;
        for(int i =1;i<=5;i++){
            System.out.print(i+".");
            for (int x = 1;x<4;x++){
                kvartira++;
                System.out.print(" |"+kvartira+"| ");
            }
            System.out.println();
        }
    }
    public static void z_3_8(){
        /*В кинотеатре имеется 20 рядов мест для зрителей в каждом
        * и которых располодено 15 кресел. Билет имеет серию
        * АВ и номер билета, для первого места в первом ряду равного 01643
        * (Далее этот номер увеличивается согласно условному обозначению мест. Имеющий вид,
        *  показанный в таблице ниже
        *
        * |1|2|...|15|
        * 16|17|..|30|
        * |..|..|..|..|
        * |286|287|..|300|
        * */
    }
}
