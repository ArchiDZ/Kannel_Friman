package BookKannnel.Razdel1.Razdel15;

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
        StringBuilder chet = new StringBuilder();
        StringBuilder nechet= new StringBuilder();
        System.out.print("-->");
        int number = sc.nextInt();
        while (number!=0){
           int k = number%10;
           number/=10;
           if (k%2==0){
               chet.insert(0,k+" ");//System.out.print(k);
           }
            else
               nechet.insert(0,k+" ");
        }
        System.out.println(chet);
        System.out.println(nechet);

    }
    public static void zadanie_15_24(){
        /*Точно такая же задача как и 15.23
        * */
    }
    public static void zadanie_15_25(){
        /*Метод который принимает с клавиатуры целое положительное число и выводит его первую цифру
        * */
        Delimetr.deleq(25);
        System.out.println("-->");
        int number = sc.nextInt();
        int k = 0;
        while(number!=0){
           k= number%10;
            number/=10;
        }
        System.out.println(k);
    }
    public static void zadanie_15_26(){
        /*Метод который принимает с клавиатуры целое положительное число а затем генерирует случайную цифру
        * Метод должен определить встречается ли эта цифра в введенном числе, и вывести сообщение о результате.*/
        Delimetr.deleq(20);
        System.out.print("-->");
        int number = sc.nextInt();
        int digit = rnd.nextInt(1,9);
        boolean isMatch = false;
        int counter = 0;
        System.out.println("digit--->"+digit);
        while (number!=0){
            int k = number%10;
            number/=10;
            if (k==digit){
                isMatch = true;
                counter++;
            }
        }
        if(isMatch==true){
            System.out.println("There is a match "+counter+" times");
        }else System.out.println("No matches");

    }
    public static void zadanie_15_27(){
        /*Метод который принимает с клавиатуры целое положительное число а затем генерирует случайную цифру
         * Метод должен определить встречается ли эта цифра в введенном числе, и вывести сообщение о результате.
         * Сколлько раз и на какой позиции.*/
        Delimetr.deleq(20);
        System.out.print("-->");
        int number = sc.nextInt();
        int digit = rnd.nextInt(1,9);
        StringBuilder position = new StringBuilder();
        int step=0;
        boolean isMatch = false;
        int counter = 0;
        System.out.println("digit--->"+digit);
        while (number!=0){
            step++;
            int k = number%10;
            number/=10;
            if (k==digit){
                isMatch = true;
                counter++;
                position.insert(0,step+" ");
            }
        }
        if(isMatch==true){
            System.out.println("There is a match "+counter+" times on position "+position);
        }else System.out.println("No matches");
    // не совсем корректно позиция учитывается от последнего числа
    }
    public static void zadanie_15_28(){
        /* метод который принимает число с клавиатуры и определяет количество символов*/
        System.out.print("-->");
        int number = sc.nextInt();
        int step_counter = 0;
        while (number!=0){
            int k = number%10;
            number/=10;
            step_counter++;
        }
        System.out.println(" Digits in number -->"+step_counter);
    }
    public static void zadanie_15_29(){
        /*Метод который принимает с клавиатуры число и выводит сумму цифр от введенного числа */
        System.out.print("-->");
        int number = sc.nextInt();
        int k = 0;
        while (number!=0){
             k += number%10;

            number/=10;
        }
        System.out.println(k);
    }
    public static void zadanie_15_30(){
        /*Метод который генерирует случайное число и подсчитывает сколько нулей в данном числе*/
        int number = rnd.nextInt(1,100000);
        System.out.println("--"+number+"--");
        int k = 0;
        int zero_counter = 0;
        while (number!=0){
            k = number%10;
            if (k==0){
                zero_counter++;
            }
            number/=10;
        }
        System.out.println("zero in number-->"+zero_counter);
    }
    public static void zadanie_15_31(){
        /*Метод которй принимает с клавиатуры серию целых чисел до тех пор пока, кол-во четных чисел в
        серии остается меньше 5*/

        System.out.println("Start enter series of numbers");
        int counter = 0;
        StringBuilder enterNumber = new StringBuilder();
        while (counter !=5){
            System.out.print("-->");
            int number = sc.nextInt();
            enterNumber.insert(0,number+" ");
            if(number%2==0){
                counter++;
            }
        }
        System.out.println(enterNumber);
    }
    public static void zadanie_15_32(){
        /*Метод который принимает с клавиатуры серию чисел до тех пор пока,
        кол-во четных чисел на нечетных местах серии остается меньше 5*/

        int counter = 0;
        int position = 0;
        StringBuilder enteredNumbers = new StringBuilder();
        while (counter!=5){
            System.out.print("-->");
            int number = sc.nextInt();
            enteredNumbers.insert(0,"["+number+"]("+position+") ");
            if(position%2!=0){
                if(number%2==0){
                    counter++;
                }
            }
            position++;
        }
        System.out.println(enteredNumbers);
    }
    public static void zadanie_15_33(){
        /*Метод который принимает с клавиатуры целое число,
        и выводит на экран серию переменной в степени*/
        System.out.print("-->");
        int number = sc.nextInt();
        int step =1;
        int x = 0;
        while (x<1000){
            step++;
            x = (int)Math.pow(number,step);
            System.out.print(x+" ");
        }
    }
    public static void zadanie_15_34(){
        /*Метод который принимает с клавиатуры целое положительное число
        * Метод должен определить наибольшее значение в серии, сумма которой
        * не превышает Х*/
        int step=1;
        int summ = 0;
        System.out.print("-->");
        int number = sc.nextInt();
        while (summ<=number){
            step++;
            summ+=step*step;
            System.out.println(step+"("+summ+")");
        }
        System.out.println();
        System.out.println(step-1);
    }
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
    public static void zadanie_15_36(){
        /*Метод который принимает с клавиатуры целое число
        * и определяет является ли оно точным квадратом целого числа*/
        System.out.print("-->");
        int number = sc.nextInt();
        int step = 1;
        int X = 1;
        while (number != X){
        step++;
        X = (int)Math.pow(step,2);
        }
        if (X==number){
            System.out.println("Является");
        }else System.out.println("Неявляется");
    }
    public static void zadanie_15_37() {
        /*Метод который принимает с клавиатуры целое положительное число Х,
         * метод должен найти наименьшее целое положительное двузначное
         * число,сумма цифр которого равна Х*/
        System.out.print("-->");
        int number = sc.nextInt();
        int digit = 10;
        int sum = 0;
        while (digit < 99) {
            sum = (digit / 10) + (digit % 10);
            digit++;
            if (sum == number) {
                System.out.println("Есть совпадение");
                //break;
            }
        }
    }
    public static void zadanie_15_38(){
        /*Метод который находит наибольшее положительное двузначное число ,
        которое делится на произведение своих цифр*/
        int a = 99;
        int b = (a/10)*(a%10);
        while (b!=0 && a%b!=0){
            a--;
            b=(a/10)*(a%10);
        }
        System.out.println(a);
    }
    public static void zadanie_15_39(){
        /*Метод который принимает число с клавиатуры
        и находит его наименьший делитель отличный от 1*/
        System.out.print("-->");
        int number = sc.nextInt();
        int step = 0;
        int tmp = 0;
        StringBuilder str = new StringBuilder();
        while(number !=step){
            step++;
            if(number%step==0){
                tmp = step;
                str.insert(0,step+" ");
            }
        }
        System.out.println("Список делителей: ");
        System.out.println(str);
        System.out.println(tmp);
        //Выводит список делителей но наименьший

    }
    public static void zadanie_15_40(){
        /*Метод который принимает с клавиатуры число
        и находит наибольший делитель числа*/
        System.out.print("-->");
        int number = sc.nextInt();
        int step = 0;
        int tmp = 0;
        StringBuilder str = new StringBuilder();
        while(number !=step){
            step++;
            if(number%step==0){
                tmp = step;
                str.insert(0,step+" ");
            }
        }
        System.out.println("Список делителей: ");
        System.out.println(str);
        System.out.println("Наибольший делитель-->"+tmp);
    }
    public static void zadanie_15_41(){
        /*метод преобразования числа.Принимает с клавиатуры  2 целох положительныз числа
        И преобразует большее из них в меньшее следующим образом.
        * Преобразование: -если число нечетное,оно уменьшается на 1
        *                 -если число четное оно делится на 2
        * Все преобразования с числом записываются*/
        System.out.println("-->");
        int number = sc.nextInt();
        int number2 = sc.nextInt();
        StringBuilder str = new StringBuilder();
        while (number!=0){
            if(number%2!=0){
                number--;
            } else if (number%2==0) {
                number/=2;
            }
            str.insert(0,number+" ");
        }
        System.out.println(str.reverse());
    }
    public static void zadanie_15_42(){
        /*Последовательность Фибоначчи определяется как серия чисел в которой первый и второй
        * члены равны 1 , а любой член , начиная с третьего  равен сумме двух предыдущих*/
        int a=1;
        int a2 = 1;
        int a3=0;
        int x= sc.nextInt();
        if (x==1){
            System.out.println("Является");
        }
        a3=a+a2;
        while (x>a3){
            a=a2;
            a2=a3;
            a3=a+a2;
            System.out.println(a3+" ");
        }
        System.out.println();
        if(x==a3){
            System.out.println("Является");
        }else
            System.out.println("Нет");
    }
    public static void zadanie_15_43(){
        /*YНаибольший общий делитель (НОД) двух целых чисел можно
        * определить при помощи следующего метода:Большее число
        * уменьшается на значение меньшего до тех пор пока числа
        * не оказываются равными
        * Метод который принимает с клавиатуры 2 целых положительных
        * числа и определяет их НОД описанным методом*/

        System.out.print("1)-->");
        int num1 = sc.nextInt();
        System.out.println("2)-->");
        int num2 = sc.nextInt();
        if(num1>num2){
         while (num1!=num2){

         }
        }
    }
    public static void zadanie_15_44(){}
    public static void zadanie_15_45(){}
    public static void zadanie_15_46(){}
    public static void zadanie_15_47(){}
    public static void zadanie_15_48(){}
    public static void zadanie_15_49(){}
    public static void zadanie_15_50(){}
    public static void zadanie_15_51(){}
    public static void zadanie_15_52(){
        /*Игра в кости. 2 игрока. игра заканчивается если 1 игрок набрал 100 очков*/
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;
        while (scorePlayer1<100 || scorePlayer2 < 100) {
            int player1_kub1 = rnd.nextInt(1, 6);
            int player1_kub2 = rnd.nextInt(1,6);
            scorePlayer1 += player1_kub1+player1_kub2;
            System.out.println("1)--"+player1_kub1+"--"+player1_kub2+"--score="+scorePlayer1);
            int player2_kub1 = rnd.nextInt(1, 6);
            int player2_kub2 = rnd.nextInt(1,6);
            scorePlayer2 += player2_kub1+player2_kub2;
            System.out.println("2)--"+player2_kub1+"--"+player2_kub2+"--score="+scorePlayer2);
        }
        if(scorePlayer1>=100){
            System.out.println("Игрок 1 победил");
        }else System.out.println("Игрок 2 победил");
        }

}
