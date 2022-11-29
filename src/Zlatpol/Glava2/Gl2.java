package Zlatpol.Glava2;

import java.util.Random;

public class Gl2 {
    static Random rnd = new Random();

    public static void z_2_1(){
        /*Вычислить значение функции
        *1) Y = 17x^2-6x+13 при любом значении Х
        *2) Y = 3a^2+5a-21 при любом значении А
        * */
        int x = rnd.nextInt(1,10);
        int a = rnd.nextInt(1,10);
        System.out.println("x-->"+x+" a-->"+a);
        int formula1 = 17*(int)Math.pow(x,2)-6*x+13;
        int formula2 = 3*(int)Math.pow(a,2)+5*a-21;
        System.out.println("Результаты ");
        System.out.println("17x^2-6x+13-->"+formula1);
        System.out.println("3a^2+5a-21-->"+formula2);

    }

    public static double z_2_31(int kon, int apl){
        double kon_price = 75.85;
        double apl_price = 139.2;

        double summ = (kon*kon_price)+(apl*apl_price);
        return summ;
    }
    public static int z_2_32(int quanti){
        int pc_price = 162999;
        int monitor_price = 141999;
        int mouse_keyboard_price = 24999;
        int summ = (pc_price+monitor_price+mouse_keyboard_price)*quanti;
        return summ;
    }

    public static void z_2_33(){
        int age_tanya = 12;
        int age_dima = 8;
        int avarage_age = (age_tanya+age_dima)/2;
        System.out.println("Возраст Тани "+age_tanya+" лет");
        System.out.println("Возраст Димы "+age_dima+ " лет");
        System.out.println("Средний возраст детей "+avarage_age);
    }

    public static void zadacha_2_36(){

    }

}
