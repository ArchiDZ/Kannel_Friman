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
    public static void zadanie_5_3(){
        /*
        * Словестное описание логических условий
        * */
        String [] s1 = {"Equal=(x==t)",
                "proverka=(a==b && t==z)",
                "check = num1>num2;",
                "result = ((a+b)>100)",
                "ok = ((a+b10-100)!=0)"
        };

    }
    public static void zadanie_5_4(){
        double x = -2;
        double y = 5;
        double z = 13;
        boolean a = z>x;
        boolean b = x<0;
        boolean result = a||b;
        boolean a1 = z-y>9;
        System.out.println("-->"+result);
        System.out.println(result&&a1);
    }
    public static void zadanie_5_5(){
        int x = -2;
        int y = 5;
        int z = 13;
        boolean a = z>x;
        boolean b = x<0;
        boolean result = a||b;
        boolean a1 = z-y>9;
        System.out.println("z>x-->"+a);
        System.out.println("x<0-->"+b);
        System.out.println("-----------------");
        System.out.println(result);
        System.out.println(result&&a1);
    }
    public static void zadanie_5_6(){
        int a = rnd.nextInt(100)+1;
        int b = rnd.nextInt(100)+1;
        System.out.println("a-->"+a+" b-->"+b);
        if((a<b)||(a<100))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
        /*при переменной а=100 и b=5 значение FALSE*/
    }
}
