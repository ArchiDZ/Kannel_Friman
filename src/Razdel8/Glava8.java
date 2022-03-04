package Razdel8;

import java.util.Random;
import java.util.Scanner;

public class Glava8 {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();

    public static void zadanie_8_1(){
        System.out.println("Введите целое число");
        int num = in.nextInt();
        if(num%2==0){
            num++;
            System.out.println("DA");
        }else {System.out.println("NE");
    }
        System.out.println(num);
    }
    /*
    * 1)6-->DA--7
    * 2)453-->NE--453
    * 3)85-->NE--85
    * 4)0-->DA--1
    * 5)122-->DA--123
    * *******************************************/
    public static void zadanie_8_2(){
        System.out.println("Введите целое число");
        int num1 = in.nextInt();
        System.out.println("Введите еще одно число");
        int num2 = in.nextInt();
        if (num1%num2==0)
            System.out.println("DA");
        else
            System.out.println("NET");
        if (num2%num1==0){
            num1+=2;
            System.out.println("GOOD");
        }else{
            num1=2;
            System.out.println("BAD");
        }
        System.out.println(num1);
    }
    /*
    * 1)--3--21-->NET--Good--5
    * 2)--21--3-->DA--BAD--2
    * 3)--13--13-->DA--GOOD--15
    * 4)--5--12-->NET--BAD--2
    * *********************************/
    public static void zadanie_8_3(){
        System.out.println("Введите целое двухзначное число");
        int a = in.nextInt();
        int b = a/10;
        int c = a%10;
        if (b==c)System.out.println("YES");
        else System.out.println("NO");
        if(b>c)System.out.println("Good");
        else System.out.println("BAD");

        /*
        * 1)21-->NO--GOOD
        * 2)12-->NO--BAD
        * 3)22-->YES--BAD
        *****************************/
    }
    public void zadanie_8_4(int num){
        int t;
        if(num/10==5){
             t = 20;
        } else t=0;
        System.out.println("Если значение "+num+"-->"+t);
    /*
        1)Если значение 59-->20
        2)Если значение 8-->0
        3)Если значение 21-->0
        4)Если значение 20-->0
     */
    }
    public static void zadanie_8_5(){
        int x = rnd.nextInt(1500 - 1);
        int a = rnd.nextInt(1500 - 1);

        if (x>0){
            System.out.println("Плюс");
        }else System.out.println("Не плюс");
        if (x>a){
            a=-1;
            System.out.println("-->"+a);
        }else {a=0; System.out.println("-->"+a);}
        if (a>100){System.out.println("Верное число");}
        else System.out.println("Ошибка");
        if (a!=x){
            a=x;
            System.out.println("=->"+a);
        }else {System.out.println("=->"+(x=a*2));}
        if(x>0){
            x+=1;
            System.out.println("==>"+x);
        }else{x-=1; System.out.println("==>"+x);}
    }
    public void zadanie_8_6(int a,int b){
        int x;
        if(a*2!=b)
            x=a/2+b;
        else x=b/2+a;
        if(x<15)
            System.out.println("X="+x);
        else System.out.println(x);

       /*
        Результат:
        16
        X=8
        X=12
        X=12
        X=10
        21
        18
               */
    }
    public static void zadanie_8_7(){
        int num1 = rnd.nextInt(150-1);
        int num2 = rnd.nextInt(150-1);
        int result;
            System.out.println("Сгенерировано два случайных числа");
            System.out.println("I-->"+num1+" II-->"+num2);
        if(num1>num2){
            result = num1-num2;
            System.out.println("Разница между первым и вторым числом-->"+result);
        }else {
            result = num2-num1;
            System.out.println("Разница между вторым и первым -->"+result);
        }
        if (num1==num2) {
            result = num1 * num2;
            System.out.println("Значения равны друг другу-->" + result);
        }
        }
        public void zadanie_8_8(int a, int b){
        int c = a/2+b/2;
        System.out.println("Начальное значение С "+c);
        if(a+b!=c){
            c=a/2+b/2;
            System.out.println("C-->"+c);
        }
        else {
            c=a%2+b%2;
            System.out.println("C==>"+c);
        }
            /*
             *Начальное значение С 6
             * C-->6
             * Начальное значение С 5
             * C-->5
             * Начальное значение С 4
             * C-->4
              */
    }
public void zadanie_8_9(int a, int b, int c){
        //int a,b,c;
        if (a%2!=1){
            b=a/2;
            c = (a+b)%10;
        }else{
            b=a/2+1;
            c=(a*b)%10;
            System.out.println(c-a-b);
        }

}

}
