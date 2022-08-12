package Razdel15;

import Tools.Delimetr;
import Tools.Tool2;

import java.util.Random;
import java.util.Scanner;

public class Glava15 {
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void zadanie_15_1(){}
    public static void zadanie_15_2(){}
    public static void zadanie_15_3(){}
    public static void zadanie_15_4(){
        String s = "Принимает с клавиатуры числа пока не будет введен 0";
        System.out.println(s);
        Delimetr.deleq(s.length());
        System.out.print("Введите число-->");
        int num = sc.nextInt();
        while (num!=0){
            if(num>0){
                System.out.println("Плюс");
            }else
                System.out.println("Минус");
            num= sc.nextInt();
        }
    }
    public static void zadanie_15_5(){
        String s = "Выводит числа пока не будет сгенерировано число 999";
        System.out.println(s);
        Delimetr.deleq(s.length());
        int counter = 0;
        int num = rnd.nextInt(1,1000);
        while (num!=999){
            System.out.println(num);
            counter++;
            num = rnd.nextInt(1,1000);
        }
        System.out.println("чисел было сгенерировано-->"+counter);
    }
    public static void zadanie_15_6(){
        String s = "Выводит числа пока не будет сгенерировано число 999, и сумма всех чисел";
        System.out.println(s);
        Delimetr.deleq(s.length());
        int counter = 0;
        int sum = 0;
        int num = rnd.nextInt(1,1000);
        while (num!=999){
            System.out.println(num);
            counter++;
            sum+=num;
            num = rnd.nextInt(1,1000);
        }
        System.out.println("чисел было сгенерировано-->"+counter);
        System.out.println("Сумма чисел-->"+sum);
    }
    public static void zadanie_15_7(){
        /*Имитация ввода пароля */
        //int num = 1234;
        System.out.println("Добро пожаловать в систему");
        System.out.print("Введите пароль-->");
        int pass = sc.nextInt();
        while (pass!=1234){
            if(pass!=1234){
                System.out.println("Acces Dinaeded");
            }else
                System.out.println("Acces Grented");
            System.out.print("Введите пароль-->");
            pass = sc.nextInt();
        }
    }
    public static void zadanie_15_8(){
        String s = "Программа которая принимает с клавиатуры значения, пока их сумма остается меньше 150." +
                "По окончании ввода следует вывести на экран информацию о количестве введенных значений";
        //Вместо ручного ввод поставим генератор случайных значений
        System.out.println(s);
        Delimetr.deleq(s.length()/2);
        int summ =0;
        int count = 0;
        while(summ<=150){
            int num = rnd.nextInt(1,10);
            count ++;
            summ+=num;
            System.out.print(num+"+");
        }
        System.out.println("Кол-во значений-->"+count);
    }
    public static void zadanie_15_9(){
        String s = "Сценарий который принимает с клавиатуры целое число , а затем выводит на экран последуюющие целые числа," +
                "пока сумма этих чисел не превышает квадрата введеного числа";
        System.out.println(s);
        Delimetr.deleq(s.length()/2);
        System.out.print("Введите целое число-->");
        int num = sc.nextInt();
        int num_line = num+1;
        int sum=0;
        while (sum<=num*num){
            System.out.println(num_line+"("+sum+") ");
            num_line++;
            sum+=num_line;
        }
    }
    public static void zadanie_15_10(){
        String s = "сценарий, который принимает с клавиатуры число для переменной Х,а" +
                " затем дополнительную серию чисел,каждое из которых используется для уменьшения числа Х, до тех пор пока" +
                "Х остается положительным";
        System.out.println(s);
        Delimetr.deleq(s.length()/2);
        System.out.print("Введите число-->");
        int number = sc.nextInt();
        while(number>0){
            System.out.println("Введите число-->");
            int num = sc.nextInt();
            number-=num;
            System.out.print(number+"("+num+")");
        }
    }
    public static void zadanie_15_11(){
        String s = "Метод который принимает с клавиатуры пары двузначных чисел целых чисел,пока не будет введена пара одинаковых";
        String s1 = "\nМетод должен выводить на экран сумму всех первых и вторых чисел в парах.";
        System.out.println(s+s1);
        Delimetr.deleq(s1.length());
        System.out.print("Введите первое число-->");
        int number1 = sc.nextInt();
        System.out.print("Введите второе число-->");
        int number2 = sc.nextInt();
        if (number1<10 || number2<10){
            System.out.println("Числа слишком маленькие");
        }
        if (number1>99 || number2>99){
            System.out.println("Числа слишком большие");
        }
        int sum1 = 0;
        int sum2=0;
        while(number1!=number2){
            int num1 = number1/10;
            int num2 = number1%10;
            int num3 = number2/10;
            int num4 = number2%10;
            sum1 = num1+num3;
            sum2 = num2+num4;
            System.out.println("Сумма первых чисел->"+sum1+" Сумма вторых чисел->"+sum2);
            Delimetr.delmin(s.length()/2);
            System.out.print("Введите первое число-->");
            number1 = sc.nextInt();
            System.out.print("Введите второе число-->");
            number2 = sc.nextInt();
        }
    }
    public static void zadanie_15_12(){
        String s = "Метод принимает серию целых чисел до тех пор пока не будут введены друг за другом два одинаковых числа.";
        System.out.println(s);
        Delimetr.deleq(s.length());
        System.out.println("Начните вводить серию чисел");
        int sum = 0;
        int number = sc.nextInt();
        int num = sc.nextInt();
        while (num!=number){
            number = sc.nextInt();
            num = sc.nextInt();
            sum+=num+number;
        }
        System.out.println("Сумма серии-->"+sum);
    }
    public static void zadanie_15_13(){
        String s = "Метод который должен принимать с клавиатуры серию возрастающих по значению целых чисел";
        System.out.println(s);
        Delimetr.deleq(s.length());
        System.out.println("Начните вводить серию чисел");
        int counter = 0;
        int number = sc.nextInt();
        counter++;
        int num = sc.nextInt();
        counter++;
        while (num>number){
            counter++;
            number=num;

        }
        System.out.println("кол-во серии-->"+counter);
    }
    public static void zadanie_15_14() {
        String str = "метод который выводит количество цифр в введеном числе";
        System.out.println(str);
        Delimetr.deleq(str.length());
        System.out.print("-->");
        int number = sc.nextInt();
        int counter = 0;
        while (number > 0) {
            number /= 10;
            counter++;
        }
        System.out.println("Кол-во цифр в числе-->" + counter);

    }
    public static void zadanie_15_15(){
        String str = "метод который выводит количество четных цифр в введеном числе";
        System.out.println(str);
        Delimetr.deleq(str.length());
        System.out.print("-->");
        int number = sc.nextInt();
        int counter = 0;
        while (number > 0) {
             number /=10;
            if (number%2==0){
                counter++;
            }
        }
        System.out.println("Кол-во цифр в числе-->" + counter);
        //Реализация не правильная нужно по выводить проверку на количество цифр
        // от туда перекидывать на другой метод
    }
    public static void zadanie_15_16(){}
    public static void zadanie_15_17(){}
    public static void zadanie_15_18(){
    String s = "Метод который принимает с клавиатуры число и выводит на экран все числа " +
        "которые можно получить из введеного числа путем стирания";
    System.out.println(s);
    Delimetr.deleq(s.length());
    System.out.print("-->");
    int number = sc.nextInt();
    while (number>0){
        number/=10;
        System.out.print(number+" ");
    }
    }
    public static void zadanie_15_19(){
        String str1 = "Метод который генерирует серию 15 чисел";
        System.out.println(str1);
        Delimetr.deleq(str1.length());
        Tool2 tool = new Tool2();
        int counter = 0;
        int sum = 0;
        while (counter<16){
            int number = rnd.nextInt(10,99);
            tool.twoDec(number);
            sum = tool.getNum1()+ tool.getNum2();
            System.out.println(number+"| "+tool.getNum1()+" + "+tool.getNum2()+" |-->"+sum);
            counter++;
        }
    }
    public static void zadanie_15_20(){
        String s = "Метод который выводит целые положительные числа пока сумма" +
                "цифр не станет больше или ровна 15";
        System.out.print(s);
        Delimetr.deleq(s.length());
        int sum = 0;
        while (sum<15){
            int num = rnd.nextInt(1,9);
            sum+=num;
            System.out.print(num+"-");
        }
        System.out.println("Конец цикла--"+sum);
    }
    public static void zadanie_15_21(){}
    public static void zadanie_15_22(){
        String s = "Метод который выводит 15 положительных чисел. Для каждого числа " +
                "выдает сумму цифр. Также выводит порядковый номер и самую большую цифру";
        int sum = 0;
        int position = 1;
        int max = 0;
        for(int i = 1;i<16;i++){
            int number = rnd.nextInt(1,999);
           System.out.print("#"+number);
            while(number>0){
                sum+=number%10;
                number/=10;
            }
            if (sum>max)
                position = i;
            System.out.println("--"+sum+"--");
        }
        System.out.println("pos-->"+position);
//какойто книжный бред--->пример из книги работает не правильно
    }
    public static void zadanie_15_23(){
        String str = "Метод который принимает с клавиатуры целое число и выводит на экран\n" +
                " четные и нечетные числа в разаных строках";
        System.out.println(str);
        Delimetr.deleq(str.length());
        System.out.print("-->");
        int number = sc.nextInt();
        while (number>0){

        }
    }
    public static void zadanie_15_24(){}
    public static void zadanie_15_25(){}
    public static void zadanie_15_26(){}
    public static void zadanie_15_27(){}
    public static void zadanie_15_28(){}
    public static void zadanie_15_29(){}
    public static void zadanie_15_30(){}
    public static void zadanie_15_31(){}
    public static void zadanie_15_32(){}
    public static void zadanie_15_33(){}
    public static void zadanie_15_34(){}
    public static void zadanie_15_35(){
        String s = "Метод который принимает с клавиатуры целое число\n" +
                "и строит из него число с обратным порядком цифр.";
        System.out.println(s);
        Delimetr.deleq(s.length()/2);
        StringBuilder sb = new StringBuilder();
        System.out.print("-->");
        int number = sc.nextInt();//rnd.nextInt(100,999);
        while(number>0){
            sb.insert(0,number%10);
           number= number/10;
            System.out.println(sb+" ");
        }
        //System.out.println(sb+" ");
    }
    public static void zadanie_15_36(){}
    public static void zadanie_15_37(){}
    public static void zadanie_15_38(){}
    public static void zadanie_15_39(){}
    public static void zadanie_15_40(){}
    public static void zadanie_15_41(){}
    public static void zadanie_15_42(){}
    public static void zadanie_15_43(){}
    public static void zadanie_15_44(){}
    public static void zadanie_15_45(){}
    public static void zadanie_15_46(){}
    public static void zadanie_15_47(){}
    public static void zadanie_15_48(){}
    public static void zadanie_15_49(){}
    public static void zadanie_15_50(){}
    public static void zadanie_15_51(){}
    public static void zadanie_15_52(){}

}
