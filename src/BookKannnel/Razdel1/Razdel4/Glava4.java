package BookKannnel.Razdel1.Razdel4;

import java.util.Random;
import java.util.Scanner;

public class Glava4 {
    static Scanner input = new Scanner(System.in);
    static Random rnd = new Random();

    public static void zadanie_4_1(){
        System.out.println("Введите двухзначное число");
        int num = input.nextInt();
        System.out.println(num/10+" "+num%10);
    }
    public static void zadanie_4_2() {
        System.out.println("Введите трехзначное число");
        int num = input.nextInt();
        System.out.println(num / 100 + " --> " +(num/10)%10+ " --> " + num%10);
    }
    public static void zadanie_4_3(){
        System.out.println("Введите двухзначное число");
        int num = input.nextInt();
        System.out.println(num%10+" "+num/10);
    }
    public static void zadanie_4_4(){
        System.out.println("Введите трехзначное число");
        int num = input.nextInt();
        System.out.println(num % 10 + " --> " +(num/10)%10+ " --> " + num/100);
    }
    public static void zadanie_4_5(){
        System.out.println("Введите двухзначное число");
        int num = input.nextInt();
        System.out.println((num/10)*10+" + "+num%10);
    }
    public static void zadanie_4_6(){
        System.out.println("Введите трехзначное число");
        int num = input.nextInt();
        System.out.println((num / 100)*100 + "+" +((num/10)%10)*10+ "+" + num%10);
    }
    public static void zadanie_4_7(){
        System.out.println("Введите двухзначное число");
        int num = input.nextInt();
        int number1 = (num%10)*10;
        int number2 = (number1+(num/10))+8;
        System.out.println("Магическое число-->"+number2);
    }
    public static void zadanie_4_8(){
        System.out.println("Введите трехзначное число");
        int num = input.nextInt();
        int number1 = (num % 10)*100;
        int number2 = number1+((num/10)%10)*10+(num/100);
        int number3 = number2-20;
        System.out.println("Магия цифр-->"+number3);
    }
    public static void zadanie_4_9(){
        System.out.println("Вес числа (Сумма цифр числа)");
        System.out.print("Введите двухзначное число");
        int num = input.nextInt();
        int number1 = num/10;
        int number2 = num%10;
        int summ = number1+number2;
        System.out.println("Вес числа "+num+"  -->"+summ);
    }
    public static void zadanie_4_10(){
        System.out.println("Вес числа (Сумма цифр числа)");
        System.out.print("Введите трехзначное число-->");
        int num = input.nextInt();
        int number1=num/100 ;
        int number2=(num/10)%10;
        int number3 = num%10;
        int sum = number1+number2+number3;
        System.out.println("Вес числа "+num+"  -->"+sum);
    }
    public static void zadanie_4_11(){
        System.out.println("Длинна двухзначного числа");
        System.out.println("Введите двухзначное число");
        int num = input.nextInt();
        int number1 = (num/10)*10;
        int number2 = number1 -num%10;
        System.out.println("Длинна числа "+number2);
    }
    public static void zadanie_4_12(){
        System.out.println("Длинна трехзначного числа");
        System.out.print("Введите трехзначное число--> ");
        int num = input.nextInt();
        int number1 = (num/100)*100;
        int number2 = (num/10)%10;
        int number3 = num%10;
        int dlinna = (number1-number3)*number2;
        System.out.println(number1+" "+number2+" "+number3);
        System.out.println(dlinna);
    }
    public static void zadanie_4_13(){
        System.out.println("Степень четности");
        System.out.print("Введите двухзначное число-->");
        int num = input.nextInt();
        int number1 = num/10;
        int number2 = num%10;
        int stepen = 0;
        System.out.println(number1+" "+number2);
        if(number1%2==0)
            stepen++;
        if(number2%2==0)
            stepen++;
        System.out.println("Степень четности-->"+stepen);
    }
    public static void zadanie_4_14(){
        System.out.println("Степень четности");
        System.out.print("Введите трехзначное число-->");
        int num = input.nextInt();
        int number1 = num/100;
        int number2 = (num/10)%10;
        int number3 = num%10;
        int stepen = 0;
        System.out.println(number1+" "+number2+" "+number3);
        if(number1%2==0)
            stepen++;
        if(number2%2==0)
            stepen++;
        if(number3%2==0)
            stepen++;
        System.out.println("Степень четности-->"+stepen);
    }
    public static void zadanie_4_15(){
        System.out.println("Степень четности");
        System.out.print("Введите четырехзначное число-->");
        int num = input.nextInt();
        int number1 = num/1000;
        int number2 = (num/100)%10;
        int number3 = (num/10)%10;
        int number4 = num%10;
        int stepen = 0;
        System.out.println(number1+" "+number2+" "+number3+" "+number4);
        if(number1%2==0)
            stepen++;
        if(number2%2==0)
            stepen++;
        if(number3%2==0)
            stepen++;
        if (number4%2==0)
            stepen++;
        System.out.println("Степень четности-->"+stepen);
    }
    public static void zadanie_4_16(){
        System.out.println("Перестановка первого и последнего числа");
        System.out.print("Введите четырехзначное число-->");
        int num = input.nextInt();
        int number1 = (num/100)%10;
        int number2 = ((num/10)%10)*10;
        int number3 = (num%10)*100;
        int fin_num = number3+number2+number1;
        System.out.println(fin_num);
    }
    public static void zadanie_4_17(){
        System.out.println("Перестановка первого и последнего числа");
        System.out.print("Введите четырехзначное число-->");
        int num = input.nextInt();
        int number1 = num/1000;
        int number2 = ((num/100)%10)*100;
        int number3 = ((num/10)%10)*10;
        int number4 = (num%10)*1000;
        int fin_num = number4+number2+number3+number1;
        System.out.println(fin_num);
    }
    public static void zadanie_4_18(){
        System.out.println("Линейный сдвиг(типо)");
        System.out.println("Введите трехзначное число");
        int num = input.nextInt();
        int number = (num%100)*10;
        System.out.println(num+"-->"+number);
    }
    public static void zadanie_4_19(){
        System.out.println("Линейный сдвиг(типо)");
        System.out.println("Введите четырехзначное число");
        int num = input.nextInt();
        int number = (num%1000)*10;
        System.out.println(num+"-->"+number);
    }
    public static void zadanie_4_20(){
        System.out.println("круговой сдвиг(влево)");
        System.out.println("Введите трехзначное число");
        int num = input.nextInt();
        int c_num = num/100;
        int number = ((num%100)*10)+c_num;
        System.out.println(num+"-->"+number);
    }
    public static void zadanie_4_21(){
        System.out.println("Круговой сдвиг(влево)");
        System.out.println("Введите четырехзначное число");
        int num = input.nextInt();
        int c_num = num/1000;
        int number = ((num%1000)*10)+c_num;
        System.out.println(num+"-->"+number);
    }
    public static void zadanie_4_22(){
        System.out.println("круговой сдвиг(вправо)");
        System.out.println("Введите трехзначное число");
        int num = input.nextInt();
        int c_num = num%10;
        int number =(c_num*100)+num/10 ;
        System.out.println(num+"-->"+number);
    }
    public static void zadanie_4_23(){
        System.out.println("круговой сдвиг(вправо)");
        System.out.println("Введите четырехзначное число");
        int num = input.nextInt();
        int c_num = num%10;
        int number =(c_num*1000)+num/10 ;
        System.out.println(num+"-->"+number);
    }
    public static void zadanie_4_24_25(){
        /*Условие Задачи 24 совпадает с 25 с небольшим отличаем
        * Решение подойдет как для 24 так и для 25*/
        System.out.println("Обмен правами цифрами");
        System.out.println("Введите 2 трехзначных числа");
        System.out.print("Число 1-->");
        int num1 = input.nextInt();
        System.out.println("");
        System.out.print("Число 2-->");
        int num2 = input.nextInt();
        System.out.println(num1+" || "+num2);
        int number1 = num1%10; // правая цифра 1го числа
        int number2 = (num1/10)*10;// первая половина от первого числа
        int number3 = (num2%10);// правая цифра 2го числа
        int number4 = (num2/10)*10;// первая половина второго числа
        int fin_num1 = number2+number3;
        int fin_num2 = number4+number1;
        System.out.println(fin_num1+" || "+fin_num2);
    }
    public static void zadanie_4_26(){
        System.out.println("Большой обмен");
        System.out.println("Введите 2 трехзначных числа");
        System.out.print("Число 1-->");
        int num1 = input.nextInt();
        System.out.println("");
        System.out.print("Число 2-->");
        int num2 = input.nextInt();
        int number1 = (num1/100)*100;
        int number2 = num1%100;
        int number3 = (num2/100)*100;
        int number4 = (num2%100);
        int fin_num1 = number3+number2;
        int fin_num2 = number1+number4;

        System.out.println(num1+" || "+num2);
        System.out.println(fin_num1+" || "+fin_num2);

    }


}
