package Razdel10;

import java.util.*;

public class Glava10 {
    static Random rnd = new Random();
    static Scanner input = new Scanner(System.in);

    public static void zadanie_10_1(){
        int num = rnd.nextInt(10,99);
        System.out.println("-->"+num);
    }
    public static void zadanie_10_2(){
        int num1 = rnd.nextInt(-9,9);
        int num2 = rnd.nextInt(-9,9);
        System.out.println("(1)-->"+num1+" (2)-->"+num2);
    }
    public static void zadanie_10_3(){
        int num1 = rnd.nextInt(-9,9);
        int num2 = rnd.nextInt(-9,9);
        System.out.println("(1)-->"+num1+" (2)-->"+num2);
        if(num1>num2){
            System.out.println("Большее-->"+num1);
            System.out.println("Меньшее-->"+num2);
        }
        if (num1<num2){
            System.out.println("Большее-->"+num2);
            System.out.println("Меньшее-->"+num1);
        }
        if (num1==num2){
            System.out.println(num1+"<--Значения равны-->"+num2);
        }
    }
    public static void zadanie_10_4(){
        System.out.print("Введите число-->");
        int x = input.nextInt();
        for (int i=0;i<=2;i++) {
            int num = rnd.nextInt(x);
            System.out.println("("+i+")"+"--->"+num);
        }
    }
    public static void zadanie_10_5(){
        int x = rnd.nextInt(10,99);
        System.out.println("Сгенерированое число-->"+x);
        for (int i=1;i<=3;i++) {
            int num = rnd.nextInt(x);
            System.out.println("("+i+")"+"--->"+num);
        }
    }
    public static void zadanie_10_6(){
        int x = rnd.nextInt(10,99);
        System.out.println("Сгенерировано число--->"+x);
        for(int i=1;i<=3;i++){
            int num = rnd.nextInt(x,99);
            System.out.println("("+i+")"+"--->"+num);
        }
    }
    public static void zadanie_10_7(){
    System.out.println("Генеразия случайного отрезка");
    int dot1,dot2,dot3;
    int num1 = rnd.nextInt(10,99);
    int num2 = rnd.nextInt(10,99);
    if (num1<num2){
        dot1 = rnd.nextInt(num1,num2);
        dot2 = rnd.nextInt(num1,num2);
        dot3 = rnd.nextInt(num1,num2);
        System.out.println("На отрезке от "+num1+" до "+num2);
        System.out.println("Существует три точки-->"+dot1+"-->"+dot2+"-->"+dot3);
    } else if(num1>num2){
        dot1 = rnd.nextInt(num2,num1);
        dot2 = rnd.nextInt(num2,num1);
        dot3 = rnd.nextInt(num2,num1);
        System.out.println("На отрезке от "+num2+" до "+num1);
        System.out.println("Существует три точки-->"+dot1+"-->"+dot2+"-->"+dot3);
    }
    }
    public static void zadanie_10_8(){
        System.out.println("Угадайка");
        //int x = rnd.nextInt(0,11);
        int x = input.nextInt();
        System.out.println("-->"+x);
        System.out.println("Было загадано число от 1 до 10");
        System.out.println("Попробуй угадай___");
        while (true){
            //int num = input.nextInt();
            int num = rnd.nextInt(0,11);
            if(num>x){
                System.out.println("Не угадал твое число больше загаданного");
            }
            if(num<x){
                System.out.println("Не угадал твое число меньше загаданного");
            }
            if(num==x){
                System.out.println("Верно! Отгадал,а ты молодец");
                break;
            }
        }
    }
    public static void zadanie_10_9(){
        System.out.println("Угадайка");
        int x = rnd.nextInt(0,11);
        System.out.println("-->"+x);
        System.out.println("Было загадано число от 1 до 10");
        System.out.println("Попробуй угадай___");
        while (true){
            int num = rnd.nextInt(0,11);
            if(num>x){
                System.out.println("Не угадал твое число больше загаданного");
            }
            if(num<x){
                System.out.println("Не угадал твое число меньше загаданного");
            }
            if(num==x){
                System.out.println("Верно! Отгадал,а ты молодец");
                break;
            }
        }
    }
    public static void zadanie_10_10(){
        /*
        * Задача полностью идентична с задачей 10_9
        * */
    }
    public static void zadanie_10_11(){
        System.out.println("Прототип игры в блэк джэк");
        int card1 = rnd.nextInt(2,11);
        int card2 = rnd.nextInt(2,11);
        int card3 = rnd.nextInt(2,11);
        System.out.println("-->"+card1+"-->"+card2+"-->"+card3);
        int summ = card1+card2+card3;
        if (summ>21){
            System.out.println("Проигрышь, перебор");
        }
        if (summ<21){
            System.out.println("Проигрышь, недобор");
        }
        if(summ==21){
            System.out.println("Победа!");
        }
    }
    public static void zadanie_10_12(){
        System.out.println("Прототип игры в блэк джэк версия 2");
        int card1 = rnd.nextInt(2,11);
        int card2 = rnd.nextInt(2,11);
        int card3 = rnd.nextInt(2,11);
        int choice;
        System.out.println("-->"+card1+"-->"+card2+"-->"+card3);
        int summ = card1+card2+card3;
        if (summ>21){
            System.out.println("Проигрышь, перебор");
        }
        if (summ<21){
            System.out.println("Не добор, желаете еще 1 карту");
            choice = input.nextInt();
            if(choice==1){
                int card4 = rnd.nextInt(2,11);
                summ=+card4;
                if(summ==21){
                    System.out.println("Победа");
                }else System.out.println("Проигрышь");
            }
        }
        if(summ==21){
            System.out.println("Победа");
        }
    } //Не самый удачный вариант***Ё

    public static void zadanie_10_13(){
        System.out.println("Игра в кости");
        int player1;
        int player2;
        int score_p1 = 0;
        int score_p2 = 0;
        for(int i=1;i<=10;i++ ){
            System.out.println("-===Раунд "+i+"===-");
            player1 = rnd.nextInt(1,6);
            System.out.println("Бросаю кость");
            System.out.println("У меня выпало-->"+player1);
            score_p1+=player1;
            System.out.println("Игрок 1 набрал "+score_p1+" очков");
            System.out.println(".......");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            player2 = rnd.nextInt(1,6);
            System.out.println("И я Бросаю кость");
            System.out.println("А у меня, у меня выпало-->"+player2);
            score_p2+=player2;
            System.out.println("Игрок 2 набрал "+score_p2+" очков");
            System.out.println("___________________________________");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (score_p1>score_p2){
            System.out.println("--===Результаты===--");
            System.out.println("Игрок 1 победил");
        }
        if(score_p1<score_p2){
            System.out.println("--===Результаты===--");
            System.out.println("Игрок 2 победил");
        }
        if (score_p1==score_p2){
            System.out.println("--===Результаты===--");
            System.out.println("Победила дружба");
        }
    }
    public static void zadanie_10_14(){
        System.out.println("Генерация 5 случайных чисел");
       int a,a1,a2,a3;
       int down = 250;
       int up = 746;
       int min = -1;
       int max = 10;

       a = down+(int)((up-down+1)*Math.random());
       System.out.println("-->"+a);
       a1 = a/100;
       a2 = (a/10)%10;
       a3 = a%10;

       if(a1<=a2 && a1<=a3)
           min = a1;
        if(a2<=a1 && a2<=a3)
            min = a2;
        if(a3<=a1 && a3<=a2)
            min = a3;
        if(a1>=a2 && a1>=a3)
            max = a1;
        if(a2>=a1 && a2>=a3)
            max = a2;
        if(a3>=a1 && a3>=a2)
            max = a3;
        System.out.println(min+" "+max);
        if (a1==a2||a2==a3||a1==3)
            System.out.println("Да");
        else
            System.out.println("Нет");
        /*
        * Пример предложеный в задачнике для решения 10,14
        * Не пойдет! Это надо переделать
        * */
        }
        public static void zadanie_10_15(){
            System.out.println("Выявление самого маленько числа из трехзначного");
            int number = rnd.nextInt(250,746);
            System.out.println("Случайное число-->"+number);
            int num1 = number/100;
            int num2 = (number/10)%10;
            int num3 = number%10;
            System.out.println("Число в разложеном виде");
            System.out.println(num1+"-->"+num2+"-->"+num3);
            int [] arr = {num1,num2,num3};
            int min = arr[0];
            for (int x : arr){
                if (x<min){
                    min = x;
                }
            }
            System.out.println(min);

        }

        public static void zadanie_10_16(){
        System.out.println("Сравнение двух случайных чисел");
        int num1 = rnd.nextInt(17,94);
        int num2 = rnd.nextInt(17,94);
        System.out.println("(1)-->"+num1+" (2)-->"+num2);
        if (num1>num2){
            System.out.println("---Первое число больше");
        }else{
            System.out.println("---Второе число больше");
        }
        int num1_i = num1/10;
        int num1_ii = num1%10;
        System.out.println(num1_i+"--"+num1_ii);
        int num2_i = num2/10;
        int num2_ii = num2%10;
        System.out.println(num2_i+"--"+num2_ii);
        System.out.println("===================");
       int [] arr = {num1_i,num1_ii,num2_i,num2_ii};
            OptionalInt x = Arrays.stream(arr).min(); // ну как вариант можно и так
            System.out.println("Самая маленькая цифра из чисел"+num1+" и "+num2);
            System.out.println(x.getAsInt());       // хотя, может можно и проще
        }

        public static void zadanie_10_17(){
            double katet = rnd.nextDouble(10.5);
            double katet2 = rnd.nextDouble(10.5);
            System.out.println(katet+"---"+katet2);
            double gipotenuza = Math.sqrt((Math.pow(katet,2)+Math.pow(katet2,2)));
            System.out.println("-->"+gipotenuza);
        }
        public static void zadanie_10_18(){
        int number1 = rnd.nextInt(99,999);
        int number2 = rnd.nextInt(99,999);
        int number3 = rnd.nextInt(99,999);
        int max = 0,min = 0;
        System.out.println("(1)-->"+number1+" (2)-->"+number2+" (3)-->"+number3);
        if(number1>number2 && number1>number3){
            max=number1;
        }else{
            min=number1;
        }
        if(number2>number1 && number2>number3){
            max=number2;
        }else{
            min = number2;
        }
        if(number3>number1 && number3>number2){
            max=number3;
        }else {
            min=number3;
        }
        System.out.println("max-->"+max);
        System.out.println("min--->"+min);
        }
        public static void zadanie_10_19(){
        int minus_num=0;
        for(int i=0;i<5;i++){
            int num = rnd.nextInt(-50,50);
            if(num<0){
                minus_num++;
            }
            System.out.println(i+"-->"+num);
        }
        System.out.println("Знак менялся-->"+minus_num);
        }

        public static void zadanie_10_20(){
        int number1 = rnd.nextInt(0,9);
        int number2 = rnd.nextInt(99,999);
        int max = 0;
        System.out.println(number1+"---"+number2);
        int num1 = number2/100;
        int num2 = (number2/10)%10;
        int num3 = number2%10;
        System.out.println(num1+"--"+num2+"--"+num3);
        if(num1>num2 && num1>num3){
            max = num1;
        } else if(num2>num1 && num2>num3){
            max = num2;
        } else if (num3>num1 && num3>num2){
            max=num3;
        }
        System.out.println("--"+max);

        }
        public static void zadanie_10_21(){
        System.out.println("Положение точки в декартовой системе");
        int x = rnd.nextInt(-30,30);
        int y = rnd.nextInt(-30,30);
        System.out.println("X-->"+x+" Y-->"+y);
        if(x<=0 && y>=0){
            System.out.println("Сектор Альфа");
        }
        if(x>=0 && y>=0){
            System.out.println("Сектор Бета");
        }
        if(x>=0 && y<=0){
            System.out.println("Сектор Гамма");
        }
        if(x<=0 && y<=0){
            System.out.println("Сектор Дельта");
        }


        }
        public static void zadanie_10_22(){}

    }


