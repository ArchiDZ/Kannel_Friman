package Razdel9;

import java.util.Random;

public class Glava9 {
static Random rnd = new Random();
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
}
