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
    public static void zadanie_8_10(){
        int num = rnd.nextInt(250-0);
        System.out.println("num-->"+num);
        if(num>0){
            num=num*num;
            System.out.println("Квадрат числа-->"+num);
        }else{
            System.out.println("Ошибка!");
        }
    }
    public static void zadanie_8_11(){
        int people = rnd.nextInt(100-1);
        int chers = rnd.nextInt(100-1);
        int tmp;
        if(people>chers){
            tmp = people-chers;
            System.out.println(tmp+" стульев Не хватает ");
        }else{
            tmp = chers-people;
            System.out.println("Стульев больше чем людей на "+tmp);
        }

    }
    public static void zadanie_8_12(){
        System.out.println("Enter your mark");
        int mark = in.nextInt();
        if(mark>10){
            System.out.println("Error, Mark cant be larger then 10");
        }else System.out.println("Mark excepted");
        if (mark<1){
            System.out.println("Error, mark cant be less than 1");
        }
    }
 public static void zadanie_8_13(){
        System.out.print("Enter 2 symbol number-->");
        int number = in.nextInt();
        if(number>0){
            System.out.println("Number Excepted");
        }else {
            System.out.println("Error! Number is not Valid");
        }
        int num1 = number/10;
        int num2 = number%10;
        System.out.println("Variable is consist from numbers-->"+num1+" -->"+num2);
     if(num1==num2){
         System.out.println("The numbers are equals");
     }else {
         System.out.println("The numbers are not equals");
     }
        if (num1>num2){
            System.out.println("Number1 is bigger than Number2");
        }
        if(num2>num1){
            System.out.println("Number2 is bigger than Number1");
        }}
     public static void zadanie_8_14(){
         System.out.print("Enter 2 symbol number-->");
         int number = in.nextInt();
         if(number>0){
             System.out.println("Number Excepted");
         }else {
             System.out.println("Error! Number is not Valid");
         }
         int num1 = number/10;
         int num2 = number%10;
         System.out.println("Variable is consist from numbers-->"+num1+" -->"+num2);
         if(num1==num2){
             System.out.println("The numbers are equals");
         }
         if (num1>num2){
             System.out.println("Number1 is bigger than Number2");
         }
         if(num2>num1){
             System.out.println("Number2 is bigger than Number1");
         }
 }
 public static void zadanie_8_15(){
     System.out.print("Enter 2 symbol number-->");
     int number = in.nextInt();
     if(number>0){
         System.out.println("Number Excepted");
     }else {
         System.out.println("Error! Number is not Valid");
     }
     int num1 = number/10;
     int num2 = number%10;
     System.out.println("Variable is consist from numbers-->"+num1+" -->"+num2);
     if(num1==num2){
         System.out.println("The numbers are equals");
     }
     if (num1>num2){
         System.out.println("Number1 is bigger than Number2");
     }
     if(num2>num1){
         System.out.println("Number2 is bigger than Number1");
     }
 }
 public static void zadanie_8_16(){
        System.out.println("Трехзначное число является семитричным, если первая и последняя цифра одинаковая");
        System.out.print("Введите трехзначное число-->");
        int number = in.nextInt();
        int num1 = number/100;
        int num2 = number%10;
        System.out.println("num1-->"+num1+"--num2-->"+num2);
        if(num1==num2){
            System.out.println("Поздравляю это семитричное число");
        }else {
            System.out.println("Это число не семитрично");
        }
 }
    public static void zadanie_8_17(){
        System.out.println("Дваждычетное число");
        System.out.println("Введите трехзначное число");
        int number = in.nextInt();
        int num1 = number/100;
        int num2 = (number/10)%10;
        int num3 = number%10;
        int summ = num1+num2+num3;
        int check1 = number%2;
        int check2 = summ%2;
        System.out.println("-->"+num1+"-->"+num2+"-->"+num3);
        if(check1==0){
            System.out.println(" Первичное Число четное");
        }else {System.out.println("Первичное число не четное");}
        if (check2 == 0){
            System.out.println("Вторичное число четное");
        }else{System.out.println("Вторичное число не четное");}
            if (check1==check2){
                System.out.println("Вы нашли дваждычетное число!!!");
            }else {System.out.println("Попробуйте еще раз...");}
    }
    public static void zadanie_8_18(){
        System.out.println("Степень четности");
        System.out.print("Введите трехзначное число-->");
        int i = 0;
        int number = in.nextInt();
        int num1 = number/100;
        int num2 = (number/10)%10;
        int num3 = number%10;
        System.out.println("Контроль чисел");
        System.out.println(num1+"-->"+num2+"-->"+num3);
        int check1 = num1%2;
        int check2 = num2%2;
        int check3 = num3%2;
        System.out.println("Контроль чеков");
        System.out.println(check1+"-->"+check2+"-->"+check3);
        if (check1==0){
            i++;
        }
        if (check2==0){
            i++;
        }
        if (check3==0){
            i++;
        }
        System.out.println("Степень четности введеного числа -->"+i);
    }
    public static void zadanie_8_19(){
        System.out.println("Четырехзначное парно - семитричное число");
        System.out.print("Введите четырехзначное число-->");
        int number = in.nextInt();
        int num1 = number/100;
        int num2 = number%100;
        System.out.println("Контроль чисел");
        System.out.print(num1+"--"+num2);
        if(num1==num2){
            System.out.println("Parnosemetrichoe chislo");
        }else System.out.println("Chislo ne parno semetrichoe");
    }
    public static void zadanie_8_20(){
        System.out.println("Enter 3 symbol number");
        int number = in.nextInt();
        int num = number/100;
        int num2 = (number%10)/10;
        int num3 = number%10;
        System.out.println("Проверка чисел");
        System.out.println(num+" "+num2+" "+num3);
        if (num==0){
            System.out.println("Первое число содержит 0");
        }else {System.out.println("Первое число не содержит 0");}
        if(num2==0){
            System.out.println("Второе число содержит 0");
        }else {System.out.println("Второе число не содержит 0");}
        if(num3==0){System.out.println("Третье число содержит 0");
        }else {System.out.println("Третье число не содержит 0");}
    }
    public static void zadanie_8_21(){
        System.out.println("Введите трех значное число");
        int number = in.nextInt();
        int num =number%10;
        int tmp = 0;
        System.out.println("Проверка-->"+num);
        if(num<5){
            tmp = (number/10)*10;
        }else{
            tmp = (number/10+1)*10;
        }
        System.out.println(tmp);
    }
    public static void zadanie_8_22(){
        System.out.println("Введите любое трехзначное число");
        int number = in.nextInt();
        int num = number%10;
        int tmp = 0;
        if(number%2==0){
            System.out.println("Up to");

                tmp = (number/10)*10;

            System.out.println(tmp);
            System.out.println(number);
        }else{
            System.out.println("Down to");
            tmp = (number/10+1)*10;
            System.out.println(tmp);
        }
        /*Данную задачу переделать,ответ не корректный*/
    }
    public static void zadanie_8_23(){
        System.out.println("Изменения чисел");
        System.out.println("Введите два числа");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if(num1>num2){
            num1--;
            num2++;
        }else if(num1<num2) {
            num1++;
            num2--;
        }
        if(num1==num2){
            num1++;
            num2++;
        }
    System.out.println("Число1-->"+num1+" Число2-->"+num2);
    }
    public static void zadanie_8_24(){
        System.out.println("Туда-сюда числа");
        System.out.println("Введите трехзначное число");
        int number = in.nextInt();
        int num = number/100;
        int num2 = (number/10)%10;
        int num3 = number%10;
        System.out.println("---Контроль---");
        System.out.println("-->"+num+"-->"+num2+"-->"+num3);
        System.out.println("-----------");
        if (number>500){
            int tmp = (num3*100)+(num2*10)+num;
            System.out.println("Результат-->"+tmp);
        } else if (number<500){
            int tmp1 = (num*100)+(num3*10)+num2;
            System.out.println("Результат"+tmp1);
        }
    }
    public static void zadanie_8_25(){
        System.out.println("=======================");
        System.out.print("Введите число-->");
        int number = in.nextInt();
        if (number%2==0){
            System.out.println("Введите дробное число");
            double num = in.nextDouble();
            double rezult = number*num;
            System.out.println("Результат умножения-->"+rezult);
        } else {
            System.out.println("Введите целое число");
            int num1 = in.nextInt();
            int rez = number+num1;
            System.out.println("Результат сложения-->"+rez);
        }
    }
    public static void zadanie_8_26(){
        System.out.println("Число Палиндром");
        System.out.println("Введите число");
        int number = in.nextInt();
        if (number>99&number<999){
            int num1 = number/100;
            int num2 = (number/10)%10;
            int num3 = number%10;
            System.out.println("-->"+num1+"-->"+num2+"-->"+num3);
        }else{System.out.println("");}
    }
}
