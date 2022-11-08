package BookKannnel.Razdel1.Razdel19;

import java.util.Arrays;
import java.util.Random;

public class Glava19 {
    static Random rnd = new Random();
    public static void zadanie_19_7(int [] arr){
        /*метод который принимает в качестве параметра
        * массив и заполняет его случайными значеними от 0
        * до 99*/
        for (int i = 0;i< arr.length;i++){
            arr[i] = rnd.nextInt(0,99);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void zadanie_19_8(int [] arr){
        /*метод который принимает в качестве параметра
         * массив и заполняет его случайными двузначнми значеними */
        for (int i = 0;i< arr.length;i++){
            arr[i] = rnd.nextInt(10,99);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void zadanie_19_9(int [] arr){
        /*Метод который получает в качестве параметра массив
        * и заполняет его случайными двузначными четными числами*/
        for(int i = 0;i< arr.length;i++){
            int x = rnd.nextInt(10,99);
             if (x%2==0){
                arr[i]=x;
            }else arr[i] = x+1;
        }
        System.out.println(Arrays.toString(arr));
        }



    public static void zadanie_19_10(int [] arr){
        /*Метод который принимает массив как параметр и заполняет его
        * положительными случайными числами, каждое из которых делится на
        * 3 с остатком 1*/

        for (int i = 0; i<arr.length;i++){
            int num = rnd.nextInt(10,99);
            while (num%3!=1){
                System.out.println(num);
                if(num%3==1){
                    arr[i]=num;
                }
                num = rnd.nextInt(10,99);
            }

         //   arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));
//Работает но не корректно если число не попало под условие записывает 0
    }
    public static void zadanie_19_11(int [] arr){
        /*Метод который получает в качестве параметра массив и
        заполняет его положительными случайными двузначными числами
         у каждой из которых цифра десятков равна цифре едениц*/

        //Пример взят из книги


    }

}
