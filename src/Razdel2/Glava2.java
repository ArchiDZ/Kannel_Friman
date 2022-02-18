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
    public  static void zadanie_2_26(){
        System.out.println("Введите год рождения");
        int yearB = reader.nextInt();
        System.out.println("Введите текущий год");
        int todayYear = reader.nextInt();
        System.out.println("Возраст -->"+(todayYear-yearB));
    }
    public static void zadanie_2_27(){
        System.out.println("Введите массу тела в граммах");
        int gramm = reader.nextInt();
        int kg = gramm*1000;
        System.out.println("Масса тела в кг-->"+kg);
    }
    public static void zadanie_2_28(){
        System.out.print("Введите расстояние в кабельтовых: ");
        int kab = reader.nextInt();
        double metr = kab*185.2;
        double km = metr/1000;
        System.out.println(kab+" кабельтов равно "+metr+" метров, соответственно " +
                "это равно "+km+" километров");
    }
    public static void zadanie_2_29(){
        System.out.print("Введите время в минутах-->");
        int time = reader.nextInt();
        int sec_time = time*60;
        System.out.println(time+" минут это -->"+sec_time+" секунд");
    }
    public static void zadanie_2_30(){
        System.out.println("Сколько сейчас времени?");
        System.out.print("Сейчас ");
        int hours = reader.nextInt();
        System.out.print(" часов и ");
        int min = reader.nextInt();
        System.out.print(" минут");
        int min_time = (hours*60)+min;
        int sec_time = min_time*60;
        System.out.println("После полуночи прошло "+min_time+" минут");
        System.out.println("После полуночи прошло "+sec_time+" секунд");
        System.out.println("До полуночи осталось "+(1440-min_time)+" минут");
    }
    public static void zadanie_2_31(){
        System.out.println("Расчет кинетической энергии тела");
        System.out.print("Введите массу тела-->");
        int massa = reader.nextInt();
        System.out.println("");
        System.out.print("Введите скорость тела-->");
        int speed = reader.nextInt();
        int keenetic = (massa*(speed*speed))/2;
        System.out.println("Кинетическая энергия тела состовляет--> "+keenetic);
    }
    public static void zadanie_2_32(){
        System.out.print("Введите число-->");
        int num = reader.nextInt();
        System.out.println("Обратное значение-->"+(-num));
    }
    public static void zadanie_2_33(){
        System.out.println("Расчет площади трапеции");
        System.out.print("Введите основание 1-->");
        double osn1 = reader.nextDouble();
        System.out.println(" ");
        System.out.print("Введите основание 2-->");
        double osn2 = reader.nextDouble();
        System.out.print("Введите высоту трапеции-->");
        double visota = reader.nextDouble();
        double plosh = 0.5*(osn1+osn2)*visota;
        System.out.println("Площадь трапеции-->"+plosh);
    }
    public static void zadanie_2_34(){
        System.out.println("Как вас зовут?");
        String name = reader.nextLine();
        System.out.println("Привет, "+name);
    }
    public static void zadanie_2_35(){
        System.out.println("Как вас зовут?");
        String name = reader.nextLine();
        String surname = reader.nextLine();
        System.out.println("Вас зовут "+name+" "+surname);
    }
    public static void zadanie_2_36(){
        System.out.print("Введите вашу фамилию-->");
        String surname = reader.nextLine();
        System.out.println();
        System.out.print("Введите куда вы хотите отправиться-->");
        String location = reader.nextLine();
        System.out.println("Пассажир "+surname+" вылетает в "+location);
    }
    public static void zadanie_2_37(){
        System.out.println("Как вас зовут?");
        String name = reader.nextLine();
        String surname = reader.nextLine();
        System.out.println(name+" "+surname);
        System.out.println(surname+" "+name);
    }
    public static void zadanie_2_38(){
        System.out.println("Введите ваше Имя");
        String name = reader.nextLine();
        System.out.println("Введите вашу Фамилию");
        String surname = reader.nextLine();
        System.out.println("Введите ваше Отчество");
        String fname = reader.nextLine();
        System.out.println(surname+" "+name.charAt(0)+fname.charAt(0));
    }
    public static void zadanie_2_39(){
        System.out.println("Введите ваше Имя");
        String name = reader.nextLine();
        System.out.println("Введите вашу Фамилию");
        String surname = reader.nextLine();
        System.out.println("Введите ваше Отчество");
        String fname = reader.nextLine();
        System.out.println(name.charAt(0)+"."+fname.charAt(0)+"."+surname);
    }


}
