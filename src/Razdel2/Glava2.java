package Razdel2;

/*
* Задания из главы 2 с Задание 2.1 по Задание 2.4*/

import java.security.PublicKey;
import java.util.Scanner;

public class Glava2 {

    static Scanner reader = new Scanner(System.in);

    public static void zadanie_2_1(){
        System.out.println("Hello,world");
    }
    public static void zadanie_2_2(){
        System.out.println("H-e-l-l-o-,-f-r-i-e-n-d!");
    }
    public static void zadanie_2_3(){
        System.out.println("+++");
        System.out.println("!!!!");
        System.out.println("??");
    }
    public static void zadanie_2_4(){
        System.out.println("+++!!!!??");
    }

    public static void zadanie_2_5(){
        System.out.println("Введите целое число");
        int a = reader.nextInt();
        System.out.println("aa= "+a+a);
        System.out.println("a10= "+(a)+10);
    }

    public static void zadanie_2_6(){
        System.out.println("Введите целое число");
        int a = reader.nextInt();
        System.out.println(" "+(a));
        System.out.println(" "+(a+1));
        System.out.println(" "+(a-2));
    }
    public static void zadanie_2_7(){
        int a = reader.nextInt();
        System.out.println(a-10);
    }
    public static void zadanie_2_8(){
        System.out.print("Введите значение: ");
        int x = reader.nextInt();
        System.out.println("Значение х: "+x);
        System.out.println("Значение х в квадрате: "+(x*x));
        System.out.print("Значение х в кубе: "+(x*x*x));
    }
    public static void zadanie_2_9(){
        int x = 9;
        System.out.println("Значение х: "+x);
        System.out.println("Значение х в квадрате: "+(x*x));
        System.out.print("Значение х в кубе: "+(x*x*x));
    }
    public static void zadanie_2_10(){
        int x = 12;
        int y = 359;
        System.out.println("Значение Х:"+x+" Значение У:"+y);
        System.out.println("Проихведение Х и У: "+x*y);
        System.out.println("Сумма Х и У: "+(x+y));
    }
    public static void zadanie_2_11(){
        System.out.println("************************");
        System.out.println("***Вася  Пупкин*********");
        System.out.println("***7-927-6492864********");
        System.out.println("************************");
    }
    public static void zadanie_2_12(){
        System.out.println("******");
        System.out.println(" **** ");
        System.out.println("  ** ");
        System.out.println("  * ");
        System.out.println("   *");
        System.out.println("  ** ");
        System.out.println(" **** ");
        System.out.println("******");
    }
    public static void zadanie_2_13() {
        // Упрощенный вариант для реализации взята задача 1.4
        // задача 1.5 и задача 1.7
        int a = 5;
        int b = 9;
        int c = a+b;
        System.out.println("Переменная а: "+a+" Переменная b: "+b);
        System.out.println("Сумма значений а и b: "+c);
        double x = 7.5;
        double dubleX = x*2;
        double triplX = x*3;
        System.out.println("Значение Х: "+x);
        System.out.println("Значение Х в квадрате: "+dubleX);
        System.out.println("Значение Х в кубе: "+triplX);
        int z = 7;
        double y =(double) z/3;
        System.out.println("Значение переменной z:"+z+
                "1/3 часть от z состовляет:"+y);
    }
    public static void zadanie_2_14(){
        int x = reader.nextInt();
        System.out.println(x+10);
    }
    public static void zadanie_2_15(){
        int x = reader.nextInt();
        System.out.println(x*10);
    }
    public static void zadanie_2_16(){
        int x = reader.nextInt();
        System.out.println(x+6);
        System.out.println(x-12);
    }
    public static void zadanie_2_17(){
        int x = reader.nextInt();
        int dubleX = x*x;
        System.out.println(x+"В квадрате: "+dubleX);
    }
    public static void zadanie_2_18(){
        int x = reader.nextInt();
        int dubleX = x*x;
        int triplX = x*x*x;
        System.out.println(x+"В квадрате: "+dubleX+"&"+triplX+" :в кубе");
    }
    public static void zadanie_2_19(){
        int x = reader.nextInt();
        int y = x-1;
        int z= x+1;
        System.out.println(y+" "+x+" "+z);
    }
    public static void zadanie_2_20(){
        int x = reader.nextInt();
        System.out.println("Первое число__"+x);
        System.out.println("Второе число__"+(-x));
    }
    public static void zadanie_2_21(){
        int x = reader.nextInt();
        int a = x+1;
        int b = x+2;
        int c = x+3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void zadanie_2_22(){
        System.out.println("Введите первое число__");
        int x = reader.nextInt();
        System.out.println("Введите второе число__");
        int y = reader.nextInt();
        System.out.println("Сумма двух чисел__"+(x+y));
        System.out.println("Произведение двух чисел__"+(x*y));
        System.out.println("Разница между первым и вторым числом-->"+(x-y));
        System.out.println("Разница между вторым и первым числом-->"+(y-x));
    }
    public static void zadanie_2_23(){
        System.out.print("Введите первое число-->");
        int x = reader.nextInt();
        System.out.print("Введите вторе число--> ");
        int y = reader.nextInt();
        int dubleX = x*x;
        int dubleY = y*y;
        int summ = dubleX+dubleY;
        System.out.println("Квадрат первого числа-->"+dubleX);
        System.out.println("Квадрат второго числа-->"+dubleY);
        System.out.println("Сумма квадратов-->"+summ);
    }
    public static void zadanie_2_24(){
        System.out.print("Введите размер первой стороны прямоугольника-->");
        int storona1 = reader.nextInt();
        System.out.print("Введите размер второй стороны прямоугольника-->");
        int storona2 = reader.nextInt();
        System.out.println("Периметр прямоугольника равен-->"+((storona1+storona2)*2));
        System.out.println("Площадь прямоугольника ровна-->"+(storona1*storona2));
    }
    public static void zadanie_2_25(){
        System.out.print("Введите длинну параллелепипеда-->");
        int dlina = reader.nextInt();
        System.out.print("Введите ширину параллелепипеда-->");
        int shirina = reader.nextInt();
        System.out.print("Введите высоту параллелепипеда-->");
        int visota = reader.nextInt();
        int perimetrOsn = (dlina+shirina)*2;
        int perimetrLZ = (visota+shirina)*2;
        int perimetrBok = (visota+dlina)*2;
        int ploshadOsnovania = shirina*dlina;
        int ploshadBokPoverhnosti = perimetrOsn*visota;
        int ploshadpolnPoverhnosti = ploshadBokPoverhnosti+2*ploshadOsnovania;
        int objom = dlina*visota*shirina;
        System.out.println("Плошадь основания-->"+ploshadOsnovania);
        System.out.println("Площадь боковой Поверхности-->"+ploshadBokPoverhnosti);
        System.out.println("Полная площадь-->"+ploshadpolnPoverhnosti);
        System.out.println("Обьем-->"+objom);


    }
}
