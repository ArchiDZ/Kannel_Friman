package BookKannnel.Razdel1.Razdel3;

import java.util.Random;
import java.util.Scanner;

public class Glava3 {
    private static Scanner input = new Scanner(System.in);

    public static void zadanie_3_1(){
    System.out.println("Введите температуру по цельсию");
        double far;
    double cels = input.nextDouble();
    far = 5.0*(cels-32)/9;
    System.out.println("Температура по Фаренгейту-->");
    }

    public static void zadanie_3_2(){
        System.out.print("Введите длинну в сантиметрах-->");
        double cm = input.nextDouble();
        double ich = cm/2.54;
        System.out.println(cm+" Сантиметров это -->"+ich+" дюймов");
    }

    public static void zadanie_3_3(){
        System.out.print("Введите длинну в дюймах-->");
        double inch = input.nextDouble();
        double cm = inch*2.54;
        System.out.println(inch+" дюймов = "+cm+" сантиметров");
    }

    public  static void zadanie_3_4(){
        System.out.println("Конвертация валют");
        System.out.println("Введите денежную еденицу в долларах");
        double doll = input.nextDouble();
        double kurs = 75.76;
        System.out.println("На текущий момент курс доллара -->"+kurs);
        System.out.println("=======================================");
        System.out.println(doll*kurs);
    }

    public static void zadanie_3_5(){
        System.out.println("Рассчет площади и периметра прямоугольного треугольника");
        System.out.println("Введите величину катета1--");
        double katet1 = input.nextDouble();
        System.out.println("Введите величену катета2--");
        double katet2 = input.nextDouble();
        System.out.println("Введите величену гипотенузы--");
        double gipotenuza = input.nextDouble();
        double ploshad = 0.5*(katet1*katet2);
        double perimetr = katet1+katet2+gipotenuza;
        System.out.println("Площадь введенного треугольника-->"+ploshad);
        System.out.println("Периметр введенного треугольника-->"+perimetr);
    }

    public static void zadanie_3_6(){
        System.out.print("Введите число-->");
        int x = input.nextInt();
        for(int i = 0;i<3;i++) {
            x += 2;
            System.out.print(x + " ");
        }
    }
    public static void zadanie_3_7(){
        System.out.print("Введите число-->");
        int x = input.nextInt();
        for(int i = 0;i<3;i++){
            x-=1;
            System.out.println(x);
        }
    }
    public static void zadanie_3_8(){
        System.out.println("Расчет площади и периметра равнобедренного треугольника");
        System.out.println("Введите длинну основания треугольника");
        double osn = input.nextDouble();
        System.out.println("Введите высоту треугольника");
        double visota = input.nextDouble();
        double S = 0.5*(osn*visota);
        System.out.println("Площадь данного треугольника-->"+S);
        double gipotenuza = Math.sqrt(Math.pow(osn,2)+Math.pow(visota,2));
        System.out.println(Math.round(gipotenuza));
        double perimetr = (osn/2)+visota+gipotenuza;
        System.out.println("Периметр треугольника -->"+Math.round(perimetr));
    }
    public static void zadanie_3_9(){
        Random rnd = new Random(); //Вместо ручного ввода который просится в
                                    // задаче реализован рандомный выбор чисел
        int a10 = rnd.nextInt(10+1);
        int a100 = rnd.nextInt(15+1);
        int a1000 = rnd.nextInt(6+1);
        int total = a10+a100+a1000;
        int all = (a10*10)+(a100*100)+(a1000*1000);
        System.out.println("Всего Вася солбрал "+total+" пробок");
        System.out.println("Пробок по 10 баллов -->"+a10);
        System.out.println("Пробок по 100 баллов -->"+a100);
        System.out.println("Пробок по 1000 баллов -->"+a1000);
        System.out.println("Вася набрал "+all+" очков");
    }

    public static void zadanie_3_10(){
        System.out.println("Вася пупкин едет в отпуск");
        Random rnd = new Random();
        double money = rnd.nextDouble(30000+100000);
        double par_money = rnd.nextDouble(30000+50000);
        double kurs = 86.15;
        double total = (money+par_money)/kurs;
        System.out.println("Сам Вася накопил-->"+money);
        System.out.println("Родители подарили Васе-->"+par_money);
        System.out.println("Всего у Васи "+Math.round(total)+" euro на отпуск");

    }
}
