package BookKannnel.Razdel1.Razdel18;

import Tools.Delimetr;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Glava18 {
    static Scanner scn = new Scanner(System.in);
    static Random rnd = new Random();
    public static void zadanie_18_1(){
        int n = 5;
        int [] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i]=i*(i+1);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void zadanie_18_2(){
        int n = 5;
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            int x=scn.nextInt();
            arr[i]=x%2;
        }
        System.out.println(Arrays.toString(arr));
    }
    public  static void zadanie_18_3(){
        int n = 5;
        int [] arr = new int[n];
        for (int i = 0;i<n;i++){
            int x = rnd.nextInt(1,999);
            try {
                arr[i] = x/i;
            }catch (ArithmeticException exc){
                System.out.println("Попытка деления на нуль");
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void zadanie_18_4(){
        int n = 5;
        int [] arr = new int[n];
        for (int i = 0;i<n;i++){
            int x = rnd.nextInt(1,999);
            try {
                arr[i] = x/10;
            }catch (ArithmeticException exc){
                System.out.println("Попытка деления на нуль");
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void zadanie_18_5(){
        int n = 5;
        int [] arr = new int[n];
        for(int i = 0;i<n;i+=2){
            int x = rnd.nextInt(1,999);
            try {
                arr[i] = x%10;
                arr[i+1] = x/10;
            }catch (ArithmeticException ex){
                System.out.println("!!!ВНИМАНИЕ!!!Попытка деления на НУЛЬ!!!");
            }
            catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("!!!ВНИМАНИЕ!!! Вы покидаете приделы массива!!!");
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void zadanie_18_6(){
        int n = 5;
        int [] arr = new int[n];
        int x = rnd.nextInt(1,999);
        for (int i = 0;i<n;i++){
            arr[i] = x;
            x=x+x%10;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void zadanie_18_7(){
        int n = 5;
        int [] arr = new int [n];
        int x = rnd.nextInt(1,999);
        for(int i = 0;i<n;i++){
            arr[i] = x;
            x +=x;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void zadanie_18_8(){
        int n = 5;
        int [] arr = new int[n];
        for (int i =0;i<n/2;i++){
            int num = scn.nextInt();
            arr[i] = num;
            arr[n-1-i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void zadanie_18_9(){
        int n = 5;
        int [] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void zadanie_18_12(){
        /*Метод который заполняет массив трехзначными числами
        * Длинна массива вводится с клавиатуры
        * Массив выводится на экран от первой ячейки*/
        System.out.println("Введите длинну массиыва");
        System.out.print("-->");
        int arrLength = scn.nextInt();
        int [] arr = new int[arrLength];
        for (int i=0;i<arr.length;i++){
            int nums = rnd.nextInt(99,999);
            arr[i] = nums;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void zadanie_18_13(){
        /*Метод который заполняет массив четырехзначными числами
         * Длинна массива вводится с клавиатуры
         * Массив выводится на экран от последней ячейки*/
        System.out.println("Введите длинну массиыва");
        System.out.print("-->");
        int arrLength = scn.nextInt();
        int [] arr = new int[arrLength];
        for (int i=0;i<arr.length;i++){
            int nums = rnd.nextInt(999,9999);
            arr[i] = nums;
        }
        System.out.println("Контроль");
        System.out.println(Arrays.toString(arr));
        for(int i = arrLength;i>=0;i--){
            try {
                System.out.print(arr[i]+" ");
            }catch (ArrayIndexOutOfBoundsException e){
                 System.out.println("!!! Внимание !!!");
            }
        }
    }
    public static void zadanie_18_14(){
        /*Метод который создает массив с случайными значениями,размер массива задается с клавиатуры
        * после чего массив выводится на экран :
        * -в первой строке первая половина массива
        * --во второй строке вторая половина массива
        * ---если массив имеет не четный размер центральная ячейка выводится в первой строке с
        *    соответствующим сообщением*/

        System.out.println("Введите размер массива");
        System.out.print("-->");
        int arL = scn.nextInt();
        int centerArr = arL/2;
        int [] arr = new int[arL];
        for(int i = 0;i<arr.length;i++){
            int nums = rnd.nextInt(1,9999);
            arr[i] = nums;
        }
        Delimetr.deleq(arL*4);
        System.out.println("!!! Контроль !!!");
        System.out.println(Arrays.toString(arr));
        Delimetr.deleq(arL*4);
        if(arr.length%2==0){
            for (int i = 0;i<arr.length/2;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            for (int i = arr.length/2;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }else
            System.out.println(arr[centerArr]+" ---Значение в центре массива");
            for (int i = 0;i<arr.length/2;i++){
                System.out.print(arr[i]+" ");
            }
        System.out.println();
        for (int i = centerArr+1;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void zadanie_18_15(){
        /*Метод который заполняет случайными двузначными значениями массив
        * размер массива задается с клавиатуры и выводится на экран следующим образом:
        * -в первой строке - значения из четных ячеек
        * --во второй строке - значения из нечетных ячеек*/
        System.out.println("Введите размер массива");
        System.out.println("-->");
        int arrLength = scn.nextInt();
        int [] arr = new int[arrLength];
        for (int i = 0;i<arr.length;i++){
            arr[i] = rnd.nextInt(10,99);
        }
        Delimetr.deleq(20);
        System.out.println("!!! Контрольный вывод массива !!!");
        System.out.println(Arrays.toString(arr));
        Delimetr.deleq(20);
        for(int i = 0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        for(int i = 0;i<arr.length;i++){
            if(i%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void zadanie_18_16(){
        /*Метод который заполняет случайными двузначными значениями массив
         * размер массива задается с клавиатуры и выводится на экран следующим образом:
         * -в первой строке - четные значения элементов массива
         * --во второй строке - значения  нечетных элементов массива*/
        System.out.println("Введите размер массива");
        System.out.print("-->");
        int arlenth = scn.nextInt();
        int [] array = new int[arlenth];
        for(int i = 0;i<array.length;i++){
            int randomNumber = rnd.nextInt(10,99);
            array[i] = randomNumber;
        }
        for(int i = 0;i<array.length;i++){
            if(array[i]%2==0){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
    public static void zadanie_18_17() {
        /*Метод который заполняет массив случайными трехзначными значениями.
         * - Размер массива задается с клавиатуры
         * после заполнения метод должен вывести на экран значения
         * массива следующим образом:
         * В каждой строке выводится паразначений семетрично расположеных друг к другу
         * если массив имеет не четный размер центральную ячейку вывести отдельно*/

        System.out.println("Введите размер массива");
        System.out.print("-->");
        int num = scn.nextInt();//размер массива
        int[] arr = new int[num];
        boolean isEven = false;
        if (num % 2 == 0) {
            isEven = true;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = rnd.nextInt(100, 999);
            }
            System.out.println(Arrays.toString(arr));
            for (int i = 0, j = arr.length - 1; i < arr.length && j > 0; i++, j--) {
                System.out.print(arr[i] + " ");
                System.out.println(arr[j]);
                if (j == arr.length / 2) {
                    break;
                }
            }
        } else if (isEven == false) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rnd.nextInt(100, 999);
            }
            System.out.println(Arrays.toString(arr));
            for (int i = 0, j = arr.length - 1; i < arr.length && j > 0; i++, j--) {
                while (j != (arr.length / 2)-1) {
                    System.out.print(arr[i] + " ");
                    System.out.println(arr[j]);
                       break;
                }
            }
            System.out.println(arr[(arr.length / 2)]);
        }
    }
    public static void zadanie_18_18(){
        /*Мктод который заполняет массив случайнными дыузнычными числами
        * размер задается с клавиатуры
        * затем метод выводит на экран массив в виде:
        * 1-ой строке - значения из перваой половины массива
        * начиная с начала
        * 2-ой строке - значения из второй половины массива, начиная с конца
        * */
        System.out.println("Введите размер массива");
        System.out.print("-->");
        int arr_len = scn.nextInt();
        int [] array = new int[arr_len];
        for(int i=0;i<array.length;i++){
            array[i] = rnd.nextInt(10,99);
        }
        System.out.println("Итоговый массив");
        System.out.println(Arrays.toString(array));
        Delimetr.deleq(25);
        for(int i = 0;i<array.length/2;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i= array.length-1;i>0;i--){
            System.out.print(array[i]+" ");
            if(i==array.length/2){
                break;
            }
        }
    }
}
