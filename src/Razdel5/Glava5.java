package Razdel5;

import java.util.Random;
import java.util.Scanner;

//import static sun.jvm.hotspot.HelloWorld.c;

public class Glava5 {
    static Scanner input = new Scanner(System.in);
    static Random rnd = new Random();

    public static void zadanie_5_1() {
        int a = 0;
        int b = -3;
        int c = 9;

        boolean que1 = (a + b) == -9;
        boolean que2 = b*a == c*(-a); // видоизменен оригинал в примере ba==c(-a)
        boolean que3 = c/b==b*(-1);
        boolean que4 = (-b)*(-b)>=c;
        boolean que5 = b/(-c) == 1/b;
        boolean que6 = 80>=80;
        boolean que7 = b*b != a*c;
        boolean que8 = b<a;
        boolean que9 = b*b == c;
        boolean que10 = -c/b == -b;

        System.out.println("(a + b) == -9-->"+que1);
        System.out.println("b*a == c*(-a)-->"+que2);
        System.out.println("c/b==b*(-1)-->"+que3);
        System.out.println("(-b)*(-b)>=c-->"+que4);
        System.out.println("b/(-c) == 1/b-->"+que5);
        System.out.println("80>=80-->"+que6);
        System.out.println("b*b != a*c-->"+que7);
        System.out.println("b<a-->"+que8);
        System.out.println("b*b == c-->"+que9);
        System.out.println("-c/b == -b-->"+que10);
    }
    public static void zadanie_5_2(){
        /*
        * Значение переменной больше90
        * a > 90;
        * Оценка - не меньше 75
        * int score;
        * score>=75
        * Разница между значениями от 0
        *
        * Значение не превышает 200
        * Значение хотя бы не больше 120
        * Значение одной переменной равно сумме значений двух других переменных */
    }
    public static void zadanie_5_3(){}
    public static void zadanie_5_4(){
        double x = -2;
        double y = 5;
        double z = 13;


        boolean que1 = ((z>x)||(x<0));
        boolean que = que1&&(z-y-9);
    }
}
