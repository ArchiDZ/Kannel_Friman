package Razdel16;

import Tools.Delimetr;

import java.util.Scanner;

public class Glava16 {
    public static Scanner scan = new Scanner(System.in);
    public static void zadanie_16_1(){
        for(int i = 0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(i+j);
            }
        }
    }

    public static void zadanie_16_2(){
    for (int i = 0;i<4;i++){
        for(int j=0;j<i;j++){
            System.out.print(i*j);
        }
    }
    }
    public static void zadanie_16_3(){
        for (int i =0;i<4;i++){
            int s = 0;
            for (int j = 0; j<i;j++){
                s = s+i+j;
                System.out.print(s+" ");
            }
        }
    }
    public static void zadanie_16_4(){
        for(int i = 1;i<=9;i++){
            System.out.println();
            for(int j = 1;j<=9;j++){
                System.out.print(i*j+" ");
            }
        }
    }
    public static void zadanie_16_5(){
        for(int i = 2;i<=9;i++){
            System.out.println();
            for(int j = 10;j<100;j++) {
                if (j % i == 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }
    public static void zadanie_16_6(){
        String str = "Бюджет 100р, 1 бык - 10р, 1 корова 5р. Сколько вариантов покупки";
        System.out.print(str);
        Delimetr.deleq(str.length());
        int b = 100;
        int res = 0;
        for(int i = 1;i<=10;i++){

            System.out.print(i);
            for(int j =5;j<100;j+=5){
                res = (b-(10*i))/j;
                System.out.println(" "+res);
            }
        }
    }
    public static void zadanie_16_7(){
       String s = "Метод который будет выводить на экран делители каждого числа от 1 до 75";
        System.out.println(s);
        Delimetr.deleq(s.length());
        for(int i=1;i<=75;i++){
            System.out.print(i+":");
            for (int j=1;j<=i/2;j++){
                if(i%j==0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie_16_8(){
        String s = "Метод который будет выводить сумму всех делителей каждого числа от 1 до 75";
        System.out.println(s);
        Delimetr.deleq(s.length());
        for(int i = 1; i<=75;i++){
            System.out.print(i+"-->");
            for (int j=1;j<=i/2;j++){
                int sum = 0;
                if (i%j==0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie_16_9(){
        String s = "Метод который выводит изображение делимости чисел от 1 до N ";
        System.out.println(s);
        Delimetr.deleq(s.length());
        for(int i=1;i<=10;i++){
            System.out.print(i+":");
            for (int j=1;j<=i;j++){
                if(i%j==0) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie_16_10(){
        String s = "Целое число считается полноценным если сумма делителей включая 1" +
                "но не включая само число,равна самому числу";
        System.out.println(s);
        Delimetr.deleq(s.length());
        for(int i=1;i<=10000;i++){
            int sum = 0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum+=j;
                    if(sum == i){
                        System.out.println(i+"="+sum+"|");
                    }
                }
            }
        }
    }

    public static void zadanie_16_11(){
        String s = "Метод который принимает с клавиатуры целое число" +
                "а затем проверяет можно ли это число представить в виде " +
                "суммы квадратов";
        System.out.println(s);
        Delimetr.deleq(s.length());
        int flag= 0;
        System.out.print("-->");
        int x = scan.nextInt();
        for(int i = 1;i<=x/2;i++){
            for(int j = 1;j<=i;j++){
                if((i*i+j*j)==x){
                    System.out.println(i*i+"+"+j*j);
                    flag = 1;
                }
            }
            if (flag==1)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static void zadanie_16_12(){
        String s = "Метод который находит натуральное число от 1 до 10000 с максимальной суммой делителей";
        System.out.println(s);
        Delimetr.deleq(s.length());
        int max = 0;
        for(int i = 1; i<10000;i++){
            System.out.println(i+":");
            int sum = 0;
            for (int j = 1;j<i;j++){
                if(j%j==0){
                    sum+=j;
                    if(sum>max){
                        max=sum;
                        System.out.println(max);
                }

                }
            }
        }
        //System.out.println("Maximum-->"+max);
    }






}
