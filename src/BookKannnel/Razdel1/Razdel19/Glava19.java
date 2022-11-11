package BookKannnel.Razdel1.Razdel19;

import Tools.Tool2;

import java.lang.reflect.Array;
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
            while (num%3!=1 || num==0){
                num = rnd.nextInt(10,99);
            }
            arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));
//Работает но не корректно если число не попало под условие записывает 0
    }
    public static void zadanie_19_11(int [] arr){
        /*Метод который получает в качестве параметра массив и
        заполняет его положительными случайными двузначными числами
         у каждой из которых цифра десятков равна цифре едениц*/
        for(int i = 0;i<arr.length;i++){
            int rnd_num = rnd.nextInt(10,99);
            int num1 = rnd_num/10;
            int num2 = rnd_num%10;
            while(num1!=num2){
                 rnd_num = rnd.nextInt(10,99);
                 num1 = rnd_num/10;
                 num2 = rnd_num%10;
            }
            arr[i] = rnd_num;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void zadanie_19_12(int [] arr){
        /*Метод который получает в качестве параметра массив и заполняет его
        * положительными случайными двузначными числами, у которых числа десятка больше
        * чем число едениц*/
        for (int i = 0; i<arr.length;i++){
            int random_number = rnd.nextInt(10,99);
            int num1 = random_number/10;
            int num2 = random_number%10;
            while(num1<num2 || num1 == num2){
                 random_number = rnd.nextInt(10,99);
                 num1 = random_number/10;
                 num2 = random_number%10;
            }
            arr[i]=random_number;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void zadanie_19_13(int [] arr){
        /*Метод который получает в качестве параметра массив и заполняет его положительными
        * случайными двузначными числами у каждого из которых сумма цифр делится на 9 без остатка*/
        int [] test_arr = new int[arr.length];
        for (int i = 0; i<arr.length; i++){
            int random_number = rnd.nextInt(10,99);
            int sum = Tool2.sumOfTwoDigits(random_number);
            while (sum%9 !=0 || sum == 0){
                 random_number = rnd.nextInt(10,99);
                 sum = Tool2.sumOfTwoDigits(random_number);
            }
            test_arr[i]=random_number;
            arr[i] = sum;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(test_arr));
    }
    public static void zadanie_19_14(int [] arr){
        /*Метод который получает в качестве параметра массив
        * и заполняет его случайными двузначными значениями так,
        * что бы цифра десятков каждого элемента массива была равна цифре едениц
        * следующего элемента*/

        for (int i =0; i< arr.length-1; i+=2){
            int random_num = rnd.nextInt(10,99);
            int random_num2 = rnd.nextInt(10,99);
            int num1 = random_num/10;
            int num2 = random_num2%10;
            while(num1!=num2){
                 random_num = rnd.nextInt(10,99);
                 random_num2 = rnd.nextInt(10,99);
                 num1 = random_num/10;
                 num2 = random_num2%10;
            }
            arr[i] = random_num;
            arr[i+1]=random_num2;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void zadanie_19_15(int [] arr,int s){
        /*Метод который получает в качестве параметра массив и дополнительный параметр S
        * Метод сначала заполняет четные ячейки массива двузначными значениями
        * Затем нечетные ячейки заполняет так что бы сумма значений в нечетной и в предыдущей четной
        * была равна S. Какими условиями должен отвечать параметр S,для того что бы задача имела решение*/

        for (int i = 0;i<arr.length;i+=2){
            arr[i]=rnd.nextInt(10,99);
        }
        for(int i=1;i<arr.length;i+=2){
            arr[i] = s-arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void zadanie_19_16(){
        /*Метод который получает в качестве параметра массив
        * и заполняет его положительными случайными двузначными числами так ,
        * что бы значеие первого элемента было равно значению
        * последнего элемента, значение второго элемента было равно значению предпоследнего
        * и так далее*/
    }

}
