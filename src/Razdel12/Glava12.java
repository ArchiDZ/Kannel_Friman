package Razdel12;

import java.util.Random;
import java.util.Scanner;

public class Glava12 {
   static Random rnd = new Random();
   static Scanner read = new Scanner(System.in);

   public static void zadanie_12_1(){
       System.out.println("Счет положительных чисел");
       int count = 0;
       for (int i=0;i<10;i++){
           int num = rnd.nextInt(-10,10);
           if(num>0){
                count++;
           }
           System.out.print(num+" ");
       }
       System.out.println("Положительных чисел в ряде было-->"+count);
   }
   public static void zadanie_12_2(){
       System.out.println("Счет четных и нечетных чисел");
       int count = 0;
       int count_nech = 0;
       for (int i=0;i<17;i++){
           int num = rnd.nextInt(1,1000);
           if(num%2==0){
               count++;
           }else{
               count_nech++;
           }
           System.out.print(num+" ");
       }
       System.out.println("Четных чисел было в ряде-->"+count);
       System.out.println("НЕчетных чисел было в ряде-->"+count_nech);
   }


}
